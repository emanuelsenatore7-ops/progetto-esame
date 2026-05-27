package Gui;

import controller.Controller;
import model.Piatto;


import javax.swing.*;
import java.util.ArrayList;

public class MenuGui {
    private JPanel mainPanelMenu;
    private JList listaMenu;
    private Controller controller;
    private JFrame frameChiamante;

    private static DefaultListModel<Piatto> modelloMenu;



    public MenuGui(Controller controller, JFrame frameChiamante){
        this.controller = controller;
        this.frameChiamante = frameChiamante;
//Usata una lista ma sarebbe stato meglio una JTextArea
        JFrame QuestoFrame = new JFrame("Finestra Menu");
        QuestoFrame.setContentPane(mainPanelMenu);
        QuestoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        QuestoFrame.pack();
        QuestoFrame.setVisible(true);

        modelloMenu = new DefaultListModel<Piatto>();
        ArrayList<Piatto> menuDaMostrare = controller.ottieniMenu();
        modelloMenu.addAll(menuDaMostrare);
        listaMenu.setModel(modelloMenu);

      //  QuestoFrame.setVisible(false);
      //  QuestoFrame.dispose();

    }

}
