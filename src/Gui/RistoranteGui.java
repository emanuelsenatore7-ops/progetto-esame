package Gui;

import controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RistoranteGui {
    private JPanel mainPanel;
    private JButton menuButton;
    private JButton tavoliButton;
    private JButton mostraOrdini;
    private Controller controller;


    //frame principale
    private static JFrame mainFrame;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ristorante");
        frame.setContentPane(new RistoranteGui().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public RistoranteGui(){
        controller = new Controller();

    //bottone che mostra il menu in azzione
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            MenuGui menuFrame = new MenuGui(controller,mainFrame);
            }
        });
    //Bottone per accedere alla gui dei tavoli
        tavoliButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            TavoliGui menuTavoli = new TavoliGui(controller,mainFrame);
            }
        });
        //mostra gli ordini aggiornati
        mostraOrdini.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CucinaGui menuCucina = new CucinaGui(controller,mainFrame);
            }
        });
    }




}
