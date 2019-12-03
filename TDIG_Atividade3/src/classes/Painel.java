package classes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

public class Painel extends javax.swing.JPanel {
    private boolean checkBoxAtivo = false;
        public Painel() {
            addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent event) {
                    if((event.getX() > 40 && event.getX() < 340) && (event.getY() > 30 && event.getY() < 60)) {
                        Tela.variavelTextField = true;
                    }
                    else {
                        Tela.variavelTextField = false;
                    }
                    
                    if ((event.getX() > 40 && event.getX() < 80) && (event.getY() > 80 && event.getY() < 110)) {
                        checkBoxAtivo = !checkBoxAtivo;
                    }
                    
                    if((event.getX() > 150 && event.getX() < 230) && (event.getY() > 130 && event.getY() < 160)) {
                        String texto = "Texto Digitado: " + Tela.texto + "\nValor do CheckBox: " + checkBoxAtivo;
                        JOptionPane.showMessageDialog(null, texto);
                    }
                }
            });
        }

        public void paint(Graphics g) {
            g.setColor(new Color(235, 235, 235));
            g.fillRect(0, 0, 400, 300);
            g.setColor(Color.BLACK);
            g.drawRect(40, 30, 300, 30);
            g.drawString(Tela.texto, 50, 48);
            g.drawRect(40, 80, 30, 30);
            g.drawString("CheckBox", 80, 100);
            if(checkBoxAtivo) {
                g.fillRect(45, 85, 20, 20);
                repaint();
            }
            else {
                g.setColor(new Color(235, 235, 235));
                g.fillRect(45, 85, 20, 20);
                repaint();
            }
            g.setColor(Color.BLACK);
            g.drawRect(150, 130, 80, 30);
            g.drawString("Submit", 170, 150);
        }
    }