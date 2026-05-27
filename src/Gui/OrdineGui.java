package Gui;

import controller.Controller;
import model.Piatto;
import model.Tavolo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OrdineGui {
    private JPanel mainPanelOrdini;
    private JList listaMenu;
    private JButton confermaPiattoButton;
    private JTextArea piattiOrdinati;
    private JButton confermaOrdine;

    private DefaultListModel<Piatto> modelloLista;

    public OrdineGui(Controller controller, JFrame frameChiamante, Tavolo tavoloSelezionato){
        modelloLista = new DefaultListModel<Piatto>();
        ArrayList<Piatto> menuDaMostrare = controller.ottieniMenu();
        modelloLista.addAll(menuDaMostrare);
        listaMenu.setModel(modelloLista);


        confermaPiattoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Prendiamo il piatto selezionato dalla lista
                Piatto piattoScelto = (Piatto) listaMenu.getSelectedValue();
                //controlliamo che non sia vuoto
                if(piattoScelto!= null){
                    //Aggiungiamo il piatto all'odine avendo preso anche il tavolo selezionato passato come parametro dal frame Tavoli
                    controller.aggiungiPiattoAOrdine(tavoloSelezionato,piattoScelto);
                    JOptionPane.showMessageDialog(null,"Piatto:" + piattoScelto.getNome() + " aggiunto con successo" );
                    piattiOrdinati.append("- "+ piattoScelto.getNome() + " " + piattoScelto.getPrezzo()+ "$\n");
                }else{
                    JOptionPane.showMessageDialog(null,"ERRORE nessun Piatto selezionato");

                }
            }
        });

        JFrame QuestoFrame = new JFrame("Finestra Ordinazioni");
        QuestoFrame.setContentPane(mainPanelOrdini);
        QuestoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        QuestoFrame.pack();
        QuestoFrame.setVisible(true);

        confermaOrdine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Ordine Inviato con Successo!");
                QuestoFrame.dispose();
            }
        });
    }

}
