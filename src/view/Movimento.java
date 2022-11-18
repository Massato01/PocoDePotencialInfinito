package view;

import static java.lang.Thread.sleep;
import java.util.Random;

/**
 *
 * @author massa gnmis
 */
public class Movimento extends javax.swing.JFrame
{

    /**
     * Creates new form Movimento
     */
    
//* [INICIA O MOVIMENTO DAS PARTICULAS]
    public Movimento ()
    {
        initComponents ();
        
        new Thread ()
        {
            @Override
            public void run ()
            {    
                Movimento1 ();
            }
        }.start ();
    }
    
//* [MOVIMENTO DA PARTICULA 1]
    public void Movimento1 ()
    {
        int x = - 3;
        int y = Particula1.getLocation ().y;
        int z = 0;

        while (true)
        {
            
//* Velocidade da Particula 1
            if (z == 0)
            {
                x += 2;
            }   else if (z == 1)
            {
                x -= 2;
            }   else {}

//* Faz a Particula 1 ir e voltar
            if (x < Area1.getWidth () - 19) {}
            else if (x > - 3)
            {
                z = 1;
            }

//* Faz a Particula 1 se esconder e sorteia a próxima Particula
            if (x == - 3)
            {
                Particula1.setLocation(- 22, y);
                z = 2;

                Random sorte = new Random ();
                int teto = 5;

                int int_sorte = sorte.nextInt (teto);
                int_sorte ++;

                System.out.println(int_sorte);

                if (int_sorte == 1)
                {
                    Movimento1 ();
                }
                if (int_sorte == 2)
                {
                    Movimento2 ();
                }
                if (int_sorte == 3)
                {
                    Movimento3 ();
                }
                if (int_sorte == 4)
                {
                    Movimento4 ();
                }
                if (int_sorte == 5)
                {
                    Movimento5 ();
                }
            }

//* Força a Particula 1 seguir o caminho planejado a cada instante
            Particula1.setLocation (x, y);

            try
            {
                sleep (10);
            }   catch (Exception e) {}
        }
    }

//* [MOVIMENTO DA PARTICULA 2]    
    public void Movimento2 ()
    {
        int x = - 3;
        int y = Particula2.getLocation ().y;
        int z = 0;

        while (true)
        {
            
//* Velocidade da Particula 2
            if (z == 0)
            {
                x += 3;
            }   else if (z == 1)
            {
                x -= 3;
            }   else {}

//* Faz a Particula 2 ir e voltar
            if (x < Area1.getWidth () - 19) {}
            else if (x > - 3)
            {
                z = 1;
            }

//* Faz a Particula 2 se esconder e sorteia a próxima Particula
            if (x == - 3)
            {
                Particula2.setLocation(- 22, y);
                z = 2;

                Random sorte = new Random ();
                int teto = 5;

                int int_sorte = sorte.nextInt (teto);
                int_sorte ++;

                System.out.println(int_sorte);

                if (int_sorte == 1)
                {
                    Movimento1 ();
                }
                if (int_sorte == 2)
                {
                    Movimento2 ();
                }
                if (int_sorte == 3)
                {
                    Movimento3 ();
                }
                if (int_sorte == 4)
                {
                    Movimento4 ();
                }
                if (int_sorte == 5)
                {
                    Movimento5 ();
                }
            }

//* Força a Particula 2 seguir o caminho planejado a cada instante
            Particula2.setLocation (x, y);

            try
            {
                sleep (10);
            }   catch (Exception e) {}
        }
    }
    
//* [MOVIMENTO DA PARTICULA 3] 
    public void Movimento3 ()
    {
        int x = - 3;
        int y = Particula3.getLocation ().y;
        int z = 0;

        while (true)
        {
            
//* Velocidade da Particula 3
            if (z == 0)
            {
                x += 4;
            }   else if (z == 1)
            {
                x -= 4;
            }   else {}

//* Faz a Particula 3 ir e voltar
            if (x < Area1.getWidth () - 19) {}
            else if (x > - 3)
            {
                z = 1;
            }

//* Faz a Particula 3 se esconder e sorteia a próxima Particula
            if (x == - 3)
            {
                Particula3.setLocation(- 22, y);
                z = 2;

                Random sorte = new Random ();
                int teto = 5;

                int int_sorte = sorte.nextInt (teto);
                int_sorte ++;

                System.out.println(int_sorte);

                if (int_sorte == 1)
                {
                    Movimento1 ();
                }
                if (int_sorte == 2)
                {
                    Movimento2 ();
                }
                if (int_sorte == 3)
                {
                    Movimento3 ();
                }
                if (int_sorte == 4)
                {
                    Movimento4 ();
                }
                if (int_sorte == 5)
                {
                    Movimento5 ();
                }
            }

//* Força a Particula 3 seguir o caminho planejado a cada instante
            Particula3.setLocation (x, y);

            try
            {
                sleep (10);
            }   catch (Exception e) {}
        }
    }
    
//* [MOVIMENTO DA PARTICULA 4] 
    public void Movimento4 ()
    {
        int x = - 3;
        int y = Particula4.getLocation ().y;
        int z = 0;

        while (true)
        {
            
//* Velocidade da Particula 4
            if (z == 0)
            {
                x += 5;
            }   else if (z == 1)
            {
                x -= 5;
            }   else {}
            
//* Faz a Particula 4 ir e voltar
            if (x < Area1.getWidth () - 19) {}
            else if (x > - 3)
            {
                z = 1;
            }

//* Faz a Particula 4 se esconder e sorteia a próxima Particula
            if (x == - 3)
            {
                Particula4.setLocation(- 22, y);
                z = 2;

                Random sorte = new Random ();
                int teto = 5;

                int int_sorte = sorte.nextInt (teto);
                int_sorte ++;

                System.out.println(int_sorte);

                if (int_sorte == 1)
                {
                    Movimento1 ();
                }
                if (int_sorte == 2)
                {
                    Movimento2 ();
                }
                if (int_sorte == 3)
                {
                    Movimento3 ();
                }
                if (int_sorte == 4)
                {
                    Movimento4 ();
                }
                if (int_sorte == 5)
                {
                    Movimento5 ();
                }
            }

//* Força a Particula 4 seguir o caminho planejado a cada instante
            Particula4.setLocation (x, y);

            try
            {
                sleep (10);
            }   catch (Exception e) {}
        }
    }
    
//* [MOVIMENTO DA PARTICULA 5] 
    public void Movimento5 ()
    {
        int x = - 3;
        int y = Particula5.getLocation ().y;
        int z = 0;

        while (true)
        {
            
//* Velocidade da Particula 5
            if (z == 0)
            {
                x += 6;
            }   else if (z == 1)
            {
                x -= 6;
            }   else {}

//* Faz a Particula 5 ir e voltar
            if (x < Area1.getWidth () - 19) {}
            else if (x > - 3)
            {
                z = 1;
            }

//* Faz a Particula 5 se esconder e sorteia a próxima Particula
            if (x == - 3)
            {
                Particula5.setLocation(- 22, y);
                z = 2;

                Random sorte = new Random ();
                int teto = 5;

                int int_sorte = sorte.nextInt (teto);
                int_sorte ++;

                System.out.println(int_sorte);

                if (int_sorte == 1)
                {
                    Movimento1 ();
                }
                if (int_sorte == 2)
                {
                    Movimento2 ();
                }
                if (int_sorte == 3)
                {
                    Movimento3 ();
                }
                if (int_sorte == 4)
                {
                    Movimento4 ();
                }
                if (int_sorte == 5)
                {
                    Movimento5 ();
                }
            }

//* Força a Particula 5 seguir o caminho planejado a cada instante
            Particula5.setLocation (x, y);

            try
            {
                sleep (10);
            }   catch (Exception e) {}
        }
    }

//* [GERADOS AUTOMATICAMENTE]
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Area1 = new javax.swing.JPanel();
        Camadas = new javax.swing.JLayeredPane();
        Particula1 = new javax.swing.JLabel();
        Particula2 = new javax.swing.JLabel();
        Particula3 = new javax.swing.JLabel();
        Particula4 = new javax.swing.JLabel();
        Particula5 = new javax.swing.JLabel();
        Regua1 = new javax.swing.JLabel();
        Linha1 = new javax.swing.JLabel();
        Linha2 = new javax.swing.JLabel();
        Linha3 = new javax.swing.JLabel();
        Linha4 = new javax.swing.JLabel();
        Linha5 = new javax.swing.JLabel();
        Regua3 = new javax.swing.JLabel();
        n5 = new javax.swing.JLabel();
        n4 = new javax.swing.JLabel();
        n3 = new javax.swing.JLabel();
        n2 = new javax.swing.JLabel();
        n1 = new javax.swing.JLabel();
        num5 = new javax.swing.JLabel();
        num4 = new javax.swing.JLabel();
        num3 = new javax.swing.JLabel();
        num2 = new javax.swing.JLabel();
        num1 = new javax.swing.JLabel();
        pos5 = new javax.swing.JLabel();
        pos4 = new javax.swing.JLabel();
        pos3 = new javax.swing.JLabel();
        pos2 = new javax.swing.JLabel();
        pos1 = new javax.swing.JLabel();
        pos0 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(243, 246, 251));
        setForeground(new java.awt.Color(60, 63, 65));
        setPreferredSize(new java.awt.Dimension(800, 450));

        Area1.setBackground(new java.awt.Color(53, 53, 53));
        Area1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(166, 108, 255), 1, true));
        Area1.setForeground(new java.awt.Color(53, 53, 53));
        Area1.setToolTipText("");
        Area1.setPreferredSize(new java.awt.Dimension(500, 345));

        Camadas.setOpaque(true);

        Particula1.setBackground(new java.awt.Color(53, 53, 53));
        Particula1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Particula1.setForeground(new java.awt.Color(243, 246, 251));
        Particula1.setText("●");
        Particula1.setToolTipText("");
        Particula1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Particula1.setOpaque(true);

        Particula2.setBackground(new java.awt.Color(52, 52, 52));
        Particula2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Particula2.setForeground(new java.awt.Color(243, 246, 251));
        Particula2.setText("●");

        Particula3.setBackground(new java.awt.Color(52, 52, 52));
        Particula3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Particula3.setForeground(new java.awt.Color(243, 246, 251));
        Particula3.setText("●");

        Particula4.setBackground(new java.awt.Color(52, 52, 52));
        Particula4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Particula4.setForeground(new java.awt.Color(243, 246, 251));
        Particula4.setText("●");

        Particula5.setBackground(new java.awt.Color(52, 52, 52));
        Particula5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Particula5.setForeground(new java.awt.Color(243, 246, 251));
        Particula5.setText("●");

        Regua1.setForeground(new java.awt.Color(243, 246, 251));
        Regua1.setText("   |                                |                                 |                                |");

        Linha1.setBackground(new java.awt.Color(53, 53, 53));
        Linha1.setForeground(new java.awt.Color(152, 168, 248));
        Linha1.setText("_______________________________________________________________________");
        Linha1.setMaximumSize(new java.awt.Dimension(500, 0));
        Linha1.setMinimumSize(new java.awt.Dimension(500, 0));
        Linha1.setPreferredSize(new java.awt.Dimension(500, 0));

        Linha2.setBackground(new java.awt.Color(53, 53, 53));
        Linha2.setForeground(new java.awt.Color(188, 206, 248));
        Linha2.setText("_______________________________________________________________________");
        Linha2.setMaximumSize(new java.awt.Dimension(500, 0));
        Linha2.setMinimumSize(new java.awt.Dimension(500, 0));
        Linha2.setPreferredSize(new java.awt.Dimension(500, 0));

        Linha3.setBackground(new java.awt.Color(53, 53, 53));
        Linha3.setForeground(new java.awt.Color(205, 252, 246));
        Linha3.setText("_______________________________________________________________________");
        Linha3.setMaximumSize(new java.awt.Dimension(500, 0));
        Linha3.setMinimumSize(new java.awt.Dimension(500, 0));
        Linha3.setPreferredSize(new java.awt.Dimension(500, 0));

        Linha4.setBackground(new java.awt.Color(53, 53, 53));
        Linha4.setForeground(new java.awt.Color(250, 247, 240));
        Linha4.setText("_______________________________________________________________________");
        Linha4.setMaximumSize(new java.awt.Dimension(500, 0));
        Linha4.setMinimumSize(new java.awt.Dimension(500, 0));
        Linha4.setPreferredSize(new java.awt.Dimension(500, 0));

        Linha5.setBackground(new java.awt.Color(53, 53, 53));
        Linha5.setForeground(new java.awt.Color(250, 255, 175));
        Linha5.setText("_______________________________________________________________________");
        Linha5.setMaximumSize(new java.awt.Dimension(500, 0));
        Linha5.setMinimumSize(new java.awt.Dimension(500, 0));
        Linha5.setPreferredSize(new java.awt.Dimension(500, 0));

        Regua3.setForeground(new java.awt.Color(243, 246, 251));
        Regua3.setText("   |                                |                                 |                                |");

        Camadas.setLayer(Particula1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Camadas.setLayer(Particula2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Camadas.setLayer(Particula3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Camadas.setLayer(Particula4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Camadas.setLayer(Particula5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Camadas.setLayer(Regua1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Camadas.setLayer(Linha1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Camadas.setLayer(Linha2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Camadas.setLayer(Linha3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Camadas.setLayer(Linha4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Camadas.setLayer(Linha5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Camadas.setLayer(Regua3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout CamadasLayout = new javax.swing.GroupLayout(Camadas);
        Camadas.setLayout(CamadasLayout);
        CamadasLayout.setHorizontalGroup(
            CamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CamadasLayout.createSequentialGroup()
                .addGroup(CamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CamadasLayout.createSequentialGroup()
                        .addGroup(CamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Linha5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(CamadasLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Regua3, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Particula5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CamadasLayout.createSequentialGroup()
                        .addGroup(CamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CamadasLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Regua1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Linha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Particula1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CamadasLayout.createSequentialGroup()
                        .addComponent(Linha4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Particula4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CamadasLayout.createSequentialGroup()
                        .addComponent(Linha2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Particula2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CamadasLayout.createSequentialGroup()
                        .addComponent(Linha3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Particula3)))
                .addContainerGap())
        );
        CamadasLayout.setVerticalGroup(
            CamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CamadasLayout.createSequentialGroup()
                .addGroup(CamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CamadasLayout.createSequentialGroup()
                        .addComponent(Regua3, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(CamadasLayout.createSequentialGroup()
                        .addGroup(CamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Particula5)
                            .addGroup(CamadasLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Linha5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)))
                .addGroup(CamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Particula4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CamadasLayout.createSequentialGroup()
                        .addComponent(Linha4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGroup(CamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CamadasLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(Particula3)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CamadasLayout.createSequentialGroup()
                        .addComponent(Linha3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addGroup(CamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Particula2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CamadasLayout.createSequentialGroup()
                        .addComponent(Linha2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGroup(CamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CamadasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Particula1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(CamadasLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Linha1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Regua1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout Area1Layout = new javax.swing.GroupLayout(Area1);
        Area1.setLayout(Area1Layout);
        Area1Layout.setHorizontalGroup(
            Area1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(Camadas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 498, Short.MAX_VALUE)
        );
        Area1Layout.setVerticalGroup(
            Area1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Camadas)
        );

        n5.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        n5.setText("n");

        n4.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        n4.setText("n");

        n3.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        n3.setText("n");

        n2.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        n2.setText("n");

        n1.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        n1.setText("n");

        num5.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        num5.setText("= 5");

        num4.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        num4.setText("= 4");

        num3.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        num3.setText("= 3");

        num2.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        num2.setText("= 2");

        num1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        num1.setText("= 1");

        pos5.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        pos5.setText("5");

        pos4.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        pos4.setText("4");

        pos3.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        pos3.setText("3");

        pos2.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        pos2.setText("2");

        pos1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        pos1.setText("1");

        pos0.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        pos0.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(pos0)
                        .addGap(85, 85, 85)
                        .addComponent(pos1)
                        .addGap(85, 85, 85)
                        .addComponent(pos2)
                        .addGap(85, 85, 85)
                        .addComponent(pos3)
                        .addGap(85, 85, 85)
                        .addComponent(pos4)
                        .addGap(85, 85, 85)
                        .addComponent(pos5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(Area1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(n2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(num2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(n4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(num4))
                            .addComponent(n5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(num5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(n3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(num3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(n1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(num1)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(n5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(n4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(num4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(n3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(num3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(n2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(num2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Area1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pos5)
                            .addComponent(pos4)
                            .addComponent(pos3)
                            .addComponent(pos2)
                            .addComponent(pos1)
                            .addComponent(pos0))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>                        

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
        java.awt.EventQueue.invokeLater (new Runnable ()
        {
            @Override
            public void run ()
            {
                new Movimento ().setVisible (true);
            }
        }   );
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel Area1;
    private javax.swing.JLayeredPane Camadas;
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
    private javax.swing.JLabel Regua1;
    private javax.swing.JLabel Regua3;
    private javax.swing.JLabel n1;
    private javax.swing.JLabel n2;
    private javax.swing.JLabel n3;
    private javax.swing.JLabel n4;
    private javax.swing.JLabel n5;
    private javax.swing.JLabel num1;
    private javax.swing.JLabel num2;
    private javax.swing.JLabel num3;
    private javax.swing.JLabel num4;
    private javax.swing.JLabel num5;
    private javax.swing.JLabel pos0;
    private javax.swing.JLabel pos1;
    private javax.swing.JLabel pos2;
    private javax.swing.JLabel pos3;
    private javax.swing.JLabel pos4;
    private javax.swing.JLabel pos5;
    // End of variables declaration                   
}
