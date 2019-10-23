package classes;

import java.awt.EventQueue;

public class Main {
    public boolean variavel = false;
    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }
}