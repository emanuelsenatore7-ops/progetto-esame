package Gui;

import controller.Controller;
import model.Ordine;
import model.Tavolo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TavoliGui {
    private JPanel mainPanelTavoli;
    private JPanel grigliaPanello;
    private Controller controller;
    //riferimenti
    private JFrame frameChiamante;
    private static JFrame tavoliFrame;


    public TavoliGui(Controller controller,JFrame frameChiamante){
        this.controller = controller;
        this.frameChiamante = frameChiamante;


        //creazione della griglia 4X5 da coidce per evitare di
        grigliaPanello.setLayout(new GridLayout(4,5,5,5));
                //Prediamo tavolo per tavolo
        for(Tavolo tavoloCorrente: controller.getListaTavoli()){
            //creiamo un bottone fin quanto è lunga la lista tavoli (in questo caso 20)
            JButton btnTavolo = new JButton("Tavolo "+ tavoloCorrente.getNumeroTavolo());
            btnTavolo.setOpaque(true);
            btnTavolo.setBorderPainted(false); //definisce meglio il colore del bordo
            //
            if(!tavoloCorrente.isDisponibile()){
                btnTavolo.setBackground(Color.RED); //setta il colore rosso se non è disponibile
            }else{
                btnTavolo.setBackground(Color.GREEN); //verde se è disponibile
            }
            btnTavolo.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) { // qua in base al clicc del bottone tavolo
                if(tavoloCorrente.isDisponibile()){ //chiede se prenotare o no il tavolo selezionato
                    int risposta = JOptionPane.showConfirmDialog(null,"Prenotare il tavolo?","Prenota",JOptionPane.YES_NO_OPTION);
                    if(risposta == JOptionPane.YES_OPTION){
                        controller.PrenotaTavolo(tavoloCorrente);
                        btnTavolo.setBackground(Color.RED);
                    }
                    }else{
                    //Momentaneamente mettere tavolo occupato (Aggiungere metodo ordinazioni)
                    //JOptionPane.showMessageDialog(null,"Tavolo Occupato");
                    //chiama l'ordinazione
                    OrdineGui pannelloOrdine = new OrdineGui(controller,tavoliFrame,tavoloCorrente);
                }

                }
            });
            //aggiunge la griglia aggiornata al panel creato
            grigliaPanello.add(btnTavolo);
        }

        JFrame frame = new JFrame("Schema tavoli");
        frame.setContentPane(mainPanelTavoli);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}
