package App.view;

import java.awt.Graphics;
import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.Random;

/**
 * Animação da partícula
 *
 * @author Carlos Chinen
 */
public class Animacao extends javax.swing.JFrame {

    /**
     * Creates new form Animacao
     */
    Graphics principal;

    // Janela principal da animação
    public Animacao() {
        initComponents();
        principal = Janela.getGraphics();
        Janela.paintComponents(principal);
        
         new Thread() {
            public void run() {

                Random random = new Random();

                // Posição Inicial da partícula
                int estado_particula = 0;
                int num = 0;

                // Direção do Fóton
                int bola_roxa = 2;

                // Direção da Partícula
                int aux = 0;

                // Posição X da partícula
                int x_particula = Janela.getWidth() - Janela.getWidth();

                // Posição Y da partícula
                int y_particula = 0;

                // Posição X do fóton
                int x_foton = 0;

                // Posição Y do fóton
                int y_foton = Janela.getHeight() + 74;

                while (true) {
                    if (bola_roxa == 0) {

                        x_foton++;

                    } else if (bola_roxa == 1) {

                        x_foton--;

                    }
                    if (num == 0) {

                        y_particula = Janela.getHeight() - 48;

                        if (aux == 0) {

                            x_particula++;

                            if (x_particula > Janela.getWidth() - 18) {

                                aux = 1;

                            }
                        } else if (aux == 1) {

                            x_particula--;

                            if (x_particula == 75) {

                                System.out.println("entrou 0");
                                estado_particula = random.nextInt(5);

                                if (estado_particula > 0) {

                                    y_foton = Janela.getHeight() - 20;
                                    x_foton = Janela.getWidth() - Janela.getWidth() - 3;
                                    bola_roxa = 0;

                                }
                            }
                            if (x_particula < -3) {

                                aux = 0;
                                num = estado_particula;
                                bola_roxa = 2;
                                x_foton = 0;
                                y_foton = Janela.getHeight() + 74;

                            }
                        }
                    } else if (num == 1) {

                        y_particula = 381;

                        if (aux == 0) {

                            x_particula += 2;

                            if (x_particula > Janela.getWidth() - 18) {

                                aux = 1;

                            }
                        } else if (aux == 1) {

                            x_particula -= 2;

                            if (x_particula == 138 || x_particula == 137) {

                                System.out.println("entrou 1");
                                estado_particula = random.nextInt(5);

                                if (estado_particula > 1) {

                                    x_foton = 0;
                                    y_foton = Janela.getWidth() - 100;
                                    bola_roxa = 0;

                                } else if (estado_particula < 1) {

                                    x_foton = 80;
                                    y_foton = Janela.getWidth() - 100;
                                    bola_roxa = 1;

                                }
                            }
                            if (x_particula < -3) {

                                aux = 0;
                                num = estado_particula;
                                bola_roxa = 2;
                                x_foton = 0;
                                y_foton = Janela.getHeight() + 74;

                            }
                        }
                    } else if (num == 2) {

                        y_particula = 291;

                        if (aux == 0) {

                            x_particula += 3;

                            if (x_particula > Janela.getWidth() - 18) {

                                aux = 1;

                            }
                        } else if (aux == 1) {

                            x_particula -= 3;

                            if (x_particula == 202 || x_particula == 201 || x_particula == 200) {

                                System.out.println("entrou 2");
                                estado_particula = random.nextInt(5);

                                if (estado_particula > 2) {

                                    x_foton = 0;
                                    y_foton = Janela.getWidth() - 190;
                                    bola_roxa = 0;

                                } else if (estado_particula < 2) {

                                    x_foton = 80;
                                    y_foton = Janela.getWidth() - 190;
                                    bola_roxa = 1;

                                }
                            }
                            if (x_particula < -3) {

                                aux = 0;
                                num = estado_particula;
                                bola_roxa = 2;
                                x_foton = 0;
                                y_foton = Janela.getHeight() + 74;

                            }
                        }
                    } else if (num == 3) {

                        y_particula = 166;

                        if (aux == 0) {

                            x_particula += 4;

                            if (x_particula > Janela.getWidth() - 18) {

                                aux = 1;

                            }
                        } else if (aux == 1) {

                            x_particula -= 4;

                            if (x_particula == 395 || x_particula == 396 || x_particula == 397 || x_particula == 398) {

                                System.out.println("entrou 3");
                                estado_particula = random.nextInt(5);

                                if (estado_particula > 3) {

                                    x_foton = 0;
                                    y_foton = Janela.getWidth() - 318;
                                    bola_roxa = 0;

                                } else if (estado_particula < 3) {

                                    x_foton = 80;
                                    y_foton = Janela.getWidth() - 318;
                                    bola_roxa = 1;

                                }
                            }
                            if (x_particula < -3) {

                                aux = 0;
                                num = estado_particula;
                                bola_roxa = 2;
                                x_foton = 0;
                                y_foton = Janela.getHeight() + 74;

                            }
                        }
                    } else if (num == 4) {

                        y_particula = -8;

                        if (aux == 0) {

                            x_particula += 5;

                            if (x_particula > Janela.getWidth() - 18) {

                                aux = 1;

                            }
                        } else if (aux == 1) {

                            x_particula -= 5;

                            if (x_particula == 480 || x_particula == 479 || x_particula == 478 || x_particula == 477 || x_particula == 476) {

                                System.out.println("entrou 4");
                                estado_particula = random.nextInt(5);

                                if (estado_particula < 4) {

                                    y_foton = 18;
                                    x_foton = 80;
                                    bola_roxa = 1;

                                } else if (estado_particula > 4) {

                                    x_foton = 0;
                                    y_foton = Janela.getWidth() - 318;
                                    bola_roxa = 0;

                                }
                            }
                            if (x_particula < -3) {

                                aux = 0;
                                num = estado_particula;
                                bola_roxa = 2;
                                x_foton = 0;
                                y_foton = Janela.getHeight() + 74;

                            }
                        }
                    }

                    principal.setColor(Color.black);
                    principal.drawLine(-3, 477, 509, 477);
                    principal.setColor(Color.black);
                    principal.drawLine(-3, 409, 509, 409);
                    principal.setColor(Color.black);
                    principal.drawLine(-3, 319, 509, 319);
                    principal.setColor(Color.black);
                    principal.drawLine(-3, 194, 509, 194);
                    principal.setColor(Color.black);
                    principal.drawLine(-3, 20, 509, 20);

                    bola_principal.setLocation(x_particula, y_particula);
                    bola_foton.setLocation(x_foton, y_foton);

                    try {

                        sleep(10);

                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }                            
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        bola_foton = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Janela = new javax.swing.JPanel();
        bola_principal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        bola_foton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bola_foton.setForeground(new java.awt.Color(102, 102, 255));
        bola_foton.setText("●");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Animação");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(680, 550));
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("n = 1");

        Janela.setBackground(new java.awt.Color(255, 255, 255));
        Janela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bola_principal.setBackground(new java.awt.Color(0, 0, 153));
        bola_principal.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        bola_principal.setText("●");

        javax.swing.GroupLayout JanelaLayout = new javax.swing.GroupLayout(Janela);
        Janela.setLayout(JanelaLayout);
        JanelaLayout.setHorizontalGroup(
            JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JanelaLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(bola_principal)
                .addContainerGap(251, Short.MAX_VALUE))
        );
        JanelaLayout.setVerticalGroup(
            JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JanelaLayout.createSequentialGroup()
                .addContainerGap(441, Short.MAX_VALUE)
                .addComponent(bola_principal)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("n = 2");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("n = 3");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("n = 4");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("n = 5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(Janela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(96, 96, 96)
                        .addComponent(jLabel4)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel3)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2))
                    .addComponent(Janela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Animacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Animacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Animacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Animacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Animacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel Janela;
    private javax.swing.JLabel bola_foton;
    private javax.swing.JLabel bola_principal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration                   
}
