package classes;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Tela extends javax.swing.JFrame {
    public static boolean variavelTextField = false;
    public static String texto = new String("");
    
    public Tela() {
        Painel panel = new Painel();
        add(panel);
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent event){
                if(variavelTextField == true) {
                    texto += event.getKeyChar();
                    repaint();
                }
            }
        });
    }
}