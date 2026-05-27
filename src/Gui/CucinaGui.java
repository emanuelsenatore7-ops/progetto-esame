package Gui;

import controller.Controller;

import javax.swing.*;
import model.Ordine;
import model.Piatto;

public class CucinaGui {
    private JTextArea listaOrdini; //sostituire la text area con una lista in futuro per permettere di preparre il piatto
    private JPanel mainPanelCucina;
    private Controller controller;
    private JFrame frameChiamante;


    public CucinaGui(Controller controller,JFrame frameChiamante){
        this.controller = controller;
        this.frameChiamante = frameChiamante;

        //foglietto vuoto della comanda
        String fogliettoComanda = "";
        //Scorriamo la lista degli ordini attivi
        for(Ordine ordine: controller.getOrdiniAttivi()){
            //Creamo l'intestazione iniziale
            fogliettoComanda += "TAVOLO " + ordine.getTavoloAssociato().getNumeroTavolo() + " \n";
            fogliettoComanda += "---------------------------\n";
            //Mettiamo i Piatti in ordine
            for(Piatto piatto: ordine.getListaPiatti()){
                fogliettoComanda += "- " + piatto.getNome() + "\n";
            }
            //Spazio per separare i vari ordini
            fogliettoComanda += "\n\n";
        }
        //Testo a schermo
        if(fogliettoComanda.equals("")){
            listaOrdini.setText("Nessun Ordine Attivo");
        }else{
            listaOrdini.setText(fogliettoComanda);
        }
        //Per non permettere modifiche dal programma
        listaOrdini.setEditable(false);

        JFrame QuestoFrame = new JFrame("Finestra OrdinazioniAttive");
        QuestoFrame.setContentPane(mainPanelCucina);
        QuestoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        QuestoFrame.pack();
        QuestoFrame.setVisible(true);

    }
}
