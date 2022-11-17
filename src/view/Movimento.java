package view;

import static java.lang.Thread.sleep;
import java.util.Random;

/**
 * @author massa gnmis
 */

public class Movimento extends javax.swing.JFrame {

    /*
     * Creates new form Movimento
     */
    
    // [ INICIA O MOVIMENTO DAS PARTICULAS ]
    public Movimento() {
        initComponents();
        
        new Thread() {

            @Override
            public void run() {    
                Movimento1();
            }
        }.start();
    }
    
    // [ MOVIMENTO DA PARTICULA 1 ]
    public void Movimento1() {
        int x = - 3;
        int y = Particula1.getLocation().y;
        int z = 0;

        while(true) {
            
            //* Velocidade da Particula 1
            if (z == 0) {
                x += 2;

            }   else if (z == 1) {
                x -= 2;

            }   else {}

            // Faz a Particula 1 ir e voltar
            if (x < Area.getWidth() - 19) {}
            else if (x > - 3) {
                z = 1;
            }

            //* Faz a Particula 1 se esconder e sorteia a próxima Particula
            if (x == - 3) {
                Particula1.setLocation(- 18, y);
                z = 2;

                Random sorte = new Random();
                int teto = 5;

                int int_sorte = sorte.nextInt(teto);
                int_sorte ++;

                System.out.println(int_sorte);

                if (int_sorte == 1) {
                    Movimento1();
                }

                if (int_sorte == 2) {
                    Movimento2();
                }

                if (int_sorte == 3) {
                    Movimento3();
                }

                if (int_sorte == 4) {
                    Movimento4();
                }

                if (int_sorte == 5) {
                    Movimento5();
                }
            }

            // Força a Particula 1 seguir o caminho planejado a cada instante
            Particula1.setLocation(x, y);

            try {
                sleep (10);
            }   catch (Exception e) {}
        }
    }

    // [MOVIMENTO DA PARTICULA 2]    
    public void Movimento2() {
        int x = - 3;
        int y = Particula2.getLocation().y;
        int z = 0;

        while (true) {
            
            // Velocidade da Particula 2
            if (z == 0) {
                x += 3;

            }   else if (z == 1) {
                x -= 3;

            }   else {}

            // Faz a Particula 2 ir e voltar
            if (x < Area.getWidth() - 19) {}

            else if (x > - 3) {
                z = 1;
            }

            // Faz a Particula 2 se esconder e sorteia a próxima Particula
            if (x == - 3) {
                Particula2.setLocation(- 18, y);
                z = 2;

                Random sorte = new Random();
                int teto = 5;

                int int_sorte = sorte.nextInt(teto);
                int_sorte ++;

                System.out.println(int_sorte);

                if (int_sorte == 1) {
                    Movimento1();
                }

                if (int_sorte == 2) {
                    Movimento2();
                }

                if (int_sorte == 3) {
                    Movimento3 ();
                }

                if (int_sorte == 4) {
                    Movimento4 ();
                }

                if (int_sorte == 5) {
                    Movimento5 ();
                }
            }

            // Força a Particula 2 seguir o caminho planejado a cada instante
            Particula2.setLocation(x, y);

            try {
                sleep (10);
            }   catch (Exception e) {}
        }
    }
    
    // [MOVIMENTO DA PARTICULA 3] 
    public void Movimento3() {
        int x = - 3;
        int y = Particula3.getLocation().y;
        int z = 0;

        while (true) {
            
            // Velocidade da Particula 3
            if (z == 0) {
                x += 4;

            }   else if (z == 1) {
                x -= 4;

            }   else {}

            // Faz a Particula 3 ir e voltar
            if (x < Area.getWidth() - 19) {}
            else if (x > - 3) {
                z = 1;
            }

            // Faz a Particula 3 se esconder e sorteia a próxima Particula
            if (x == - 3) {
                Particula3.setLocation(- 18, y);
                z = 2;

                Random sorte = new Random();
                int teto = 5;

                int int_sorte = sorte.nextInt(teto);
                int_sorte ++;

                System.out.println(int_sorte);

                if (int_sorte == 1) {
                    Movimento1();
                }

                if (int_sorte == 2) {
                    Movimento2();
                }

                if (int_sorte == 3) {
                    Movimento3();
                }

                if (int_sorte == 4) {
                    Movimento4();
                }

                if (int_sorte == 5) {
                    Movimento5();
                }
            }

            // Força a Particula 3 seguir o caminho planejado a cada instante
            Particula3.setLocation(x, y);

            try {
                sleep (10);
            }   catch (Exception e) {}
        }
    }
    
    // [MOVIMENTO DA PARTICULA 4] 
    public void Movimento4() {
        int x = - 3;
        int y = Particula4.getLocation().y;
        int z = 0;

        while (true) {
            
            // Velocidade da Particula 4
            if (z == 0) {
                x += 5;

            }   else if (z == 1) {
                x -= 5;

            }   else {}
            
            // Faz a Particula 4 ir e voltar
            if (x < Area.getWidth() - 19) {}
            else if (x > - 3) {
                z = 1;
            }

            // Faz a Particula 4 se esconder e sorteia a próxima Particula
            if (x == - 3) {
                Particula4.setLocation(- 18, y);
                z = 2;

                Random sorte = new Random();
                int teto = 5;

                int int_sorte = sorte.nextInt(teto);
                int_sorte ++;

                System.out.println(int_sorte);

                if (int_sorte == 1) {
                    Movimento1();
                }

                if (int_sorte == 2) {
                    Movimento2();
                }

                if (int_sorte == 3) {
                    Movimento3();
                }

                if (int_sorte == 4) {
                    Movimento4();
                }

                if (int_sorte == 5) {
                    Movimento5();
                }
            }

            // Força a Particula 4 seguir o caminho planejado a cada instante
            Particula4.setLocation(x, y);

            try {
                sleep (10);
            }   catch (Exception e) {}
        }
    }
    
    // [ MOVIMENTO DA PARTICULA 5 ]
    public void Movimento5() {
        int x = - 3;
        int y = Particula5.getLocation().y;
        int z = 0;

        while(true) {
            
            // Velocidade da Particula 5
            if (z == 0) {
                x += 6;

            }   else if (z == 1) {
                x -= 6;

            }   else {}

            // Faz a Particula 5 ir e voltar
            if (x < Area.getWidth() - 19) {}
            else if (x > - 3) {
                z = 1;
            }

            // Faz a Particula 5 se esconder e sorteia a próxima Particula
            if (x == - 3) {
                Particula5.setLocation(- 18, y);
                z = 2;

                Random sorte = new Random();
                int teto = 5;

                int int_sorte = sorte.nextInt(teto);
                int_sorte ++;

                System.out.println(int_sorte);

                if (int_sorte == 1) {
                    Movimento1();
                }

                if (int_sorte == 2) {
                    Movimento2();
                }

                if (int_sorte == 3) {
                    Movimento3();
                }

                if (int_sorte == 4) {
                    Movimento4();
                }

                if (int_sorte == 5) {
                    Movimento5();
                }
            }

            // Força a Particula 5 seguir o caminho planejado a cada instante
            Particula5.setLocation(x, y);

            try {
                sleep (10);
            }   catch (Exception e) {}
        }
    }

    // [ GERADOS AUTOMATICAMENTE ]
    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Area = new javax.swing.JPanel();
        Particula5 = new javax.swing.JLabel();
        Particula4 = new javax.swing.JLabel();
        Particula3 = new javax.swing.JLabel();
        Particula2 = new javax.swing.JLabel();
        Particula1 = new javax.swing.JLabel();
        Linha1 = new javax.swing.JLabel();
        Linha2 = new javax.swing.JLabel();
        Linha3 = new javax.swing.JLabel();
        Linha4 = new javax.swing.JLabel();
        Linha5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(60, 63, 65));

        Area.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(175, 55, 135), 1, true));
        Area.setForeground(new java.awt.Color(60, 63, 65));
        Area.setToolTipText("");
        Area.setPreferredSize(new java.awt.Dimension(500, 345));

        Particula5.setBackground(new java.awt.Color(0, 0, 0));
        Particula5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Particula5.setText("●");

        Particula4.setBackground(new java.awt.Color(0, 0, 0));
        Particula4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Particula4.setText("●");

        Particula3.setBackground(new java.awt.Color(0, 0, 0));
        Particula3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Particula3.setText("●");

        Particula2.setBackground(new java.awt.Color(0, 0, 0));
        Particula2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Particula2.setText("●");

        Particula1.setBackground(new java.awt.Color(0, 0, 0));
        Particula1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Particula1.setText("●");
        Particula1.setToolTipText("");
        Particula1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Linha1.setText(" _______________________________________________________________________");
        Linha1.setMaximumSize(new java.awt.Dimension(500, 0));
        Linha1.setMinimumSize(new java.awt.Dimension(500, 0));
        Linha1.setPreferredSize(new java.awt.Dimension(500, 0));

        Linha2.setText(" _______________________________________________________________________");
        Linha2.setMaximumSize(new java.awt.Dimension(500, 0));
        Linha2.setMinimumSize(new java.awt.Dimension(500, 0));
        Linha2.setPreferredSize(new java.awt.Dimension(500, 0));

        Linha3.setText(" _______________________________________________________________________");
        Linha3.setMaximumSize(new java.awt.Dimension(500, 0));
        Linha3.setMinimumSize(new java.awt.Dimension(500, 0));
        Linha3.setPreferredSize(new java.awt.Dimension(500, 0));

        Linha4.setText(" _______________________________________________________________________");
        Linha4.setMaximumSize(new java.awt.Dimension(500, 0));
        Linha4.setMinimumSize(new java.awt.Dimension(500, 0));
        Linha4.setPreferredSize(new java.awt.Dimension(500, 0));

        Linha5.setText(" _______________________________________________________________________");
        Linha5.setMaximumSize(new java.awt.Dimension(500, 0));
        Linha5.setMinimumSize(new java.awt.Dimension(500, 0));
        Linha5.setPreferredSize(new java.awt.Dimension(500, 0));

        jLabel3.setText("  |                                |                                 |                                |");

        jLabel18.setText("                                |                                |                                 |                                |");

        javax.swing.GroupLayout AreaLayout = new javax.swing.GroupLayout(Area);
        Area.setLayout(AreaLayout);
        AreaLayout.setHorizontalGroup(
            AreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(AreaLayout.createSequentialGroup()
                .addGroup(AreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Linha5, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Particula5))
            .addGroup(AreaLayout.createSequentialGroup()
                .addComponent(Linha4, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Particula4))
            .addGroup(AreaLayout.createSequentialGroup()
                .addComponent(Linha3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Particula3))
            .addGroup(AreaLayout.createSequentialGroup()
                .addComponent(Linha2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Particula2))
            .addGroup(AreaLayout.createSequentialGroup()
                .addGroup(AreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Linha1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AreaLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Particula1))
        );
        AreaLayout.setVerticalGroup(
            AreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AreaLayout.createSequentialGroup()
                .addGroup(AreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Particula5)
                    .addGroup(AreaLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(Linha5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(AreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Particula4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AreaLayout.createSequentialGroup()
                        .addComponent(Linha4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGroup(AreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AreaLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(Particula3)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AreaLayout.createSequentialGroup()
                        .addComponent(Linha3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addGroup(AreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Particula2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AreaLayout.createSequentialGroup()
                        .addComponent(Linha2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGroup(AreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AreaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Particula1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AreaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Linha1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jLabel1.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        jLabel1.setText("n");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel6.setText("= 5");

        jLabel9.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        jLabel9.setText("n");

        jLabel10.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        jLabel10.setText("n");

        jLabel11.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        jLabel11.setText("n");

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel12.setText("= 3");

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel13.setText("= 2");

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel14.setText("= 4");

        jLabel15.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        jLabel15.setText("n");

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel16.setText("= 1");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel2.setText("0");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel4.setText("1");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel5.setText("4");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel7.setText("2");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel8.setText("3");

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel17.setText("5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16)))
                        .addGap(18, 18, 18)
                        .addComponent(Area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel4)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel7)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel8)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel5)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel17)
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(jLabel17))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(95, 95, 95))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(Movimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Movimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Movimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Movimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable ()
        {
            @Override
            public void run ()
            {
                new Movimento().setVisible (true);
            }
        }   );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Area;
    private javax.swing.JLabel Linha1;
    private javax.swing.JLabel Linha2;
    private javax.swing.JLabel Linha3;
    private javax.swing.JLabel Linha4;
    private javax.swing.JLabel Linha5;
    private javax.swing.JLabel Particula1;
    private javax.swing.JLabel Particula2;
    private javax.swing.JLabel Particula3;
    private javax.swing.JLabel Particula4;
    private javax.swing.JLabel Particula5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
