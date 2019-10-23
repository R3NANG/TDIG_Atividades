package classes;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Painel extends javax.swing.JPanel {
    private int contadorCheckBox = 0;
        public Painel() {
            
            addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent event) {
                    if((event.getX() > 40 && event.getX() < 340) && (event.getY() > 30 && event.getY() < 60)) {
                        Tela.variavelTextField = true;
                    }
                    else {
                        Tela.variavelTextField = false;
                    }
                    
                    if((event.getX() > 40 && event.getX() < 80) && (event.getY() > 80 && event.getY() < 110)) {
                        contadorCheckBox++;
                    }
                    
                    if((event.getX() > 150 && event.getX() < 230) && (event.getY() > 130 && event.getY() < 160)) {
                        System.out.printf("Texto Digitado: " + Tela.texto);
                        if(contadorCheckBox % 2 == 1) {
                            System.out.printf("\nValor do CheckBox: True\n\n");
                        }
                        else {
                            System.out.printf("\nValor do CheckBox: False\n\n");
                        }
                    }
                }
            });
        }

        public void paint(Graphics g) {
            g.drawRect(40, 30, 300, 30);
            g.drawString(Tela.texto, 50, 48);
            g.drawRect(40, 80, 30, 30);
            g.drawString("CheckBox", 80, 100);
            if(contadorCheckBox % 2 == 1) {
                g.drawString("V", 50, 100);
                repaint();
            }
            else {
                g.drawString("F", 50, 100);
                repaint();
            }
            g.drawRect(150, 130, 80, 30);
            g.drawString("Submit", 170, 150);
        }
    }