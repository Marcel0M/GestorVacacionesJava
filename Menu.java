import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame implements ActionListener{
    private JMenuBar mb;
    private JMenu menuOptions, menuCalculate, menuAbout, menuWallpaper;
    private JMenuItem myCalculate, myLatam, myBlack, myPurple, myCreator, myExit, myNew;
    private JLabel labelLogo, labelWelcome, labelTitle, labelName, labelLastName1, labelLastName2, labelDepto, labelLabor, labelResult, labelFooter;
    private JTextField txtName, txtLastName1, txtLastName2;
    private JComboBox comboDepto, comboLabor;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    String nameAdmin = "";
    
    
    public Menu(){
        setLayout(null);
        setTitle("Menu Principal");
        getContentPane().setBackground(new Color(16,0,79));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        Welcome windowWelcome = new Welcome();
        nameAdmin = windowWelcome.text;

        mb = new JMenuBar();
        mb.setBackground(new Color(16,0,79));
        setJMenuBar(mb);

        menuOptions = new JMenu("Opciones");
        menuOptions.setBackground(new Color(16,0,79));
        menuOptions.setFont(new Font("Andale Mono", 1, 14));
        menuOptions.setForeground(new Color(255,255,255));
        mb.add(menuOptions);

        menuCalculate = new JMenu("Calcular");
        menuCalculate.setBackground(new Color(16,0,79));
        menuCalculate.setFont(new Font("Andale Mono", 1, 14));
        menuCalculate.setForeground(new Color(255,255,255));
        mb.add(menuCalculate);

        menuAbout = new JMenu("Acerca de");
        menuAbout.setBackground(new Color(16,0,79));
        menuAbout.setFont(new Font("Andale Mono", 1, 14));
        menuAbout.setForeground(new Color(255,255,255));
        mb.add(menuAbout);

        menuWallpaper = new JMenu("Temas");
        menuWallpaper.setFont(new Font("Andale Mono", 1, 14));
        menuWallpaper.setForeground(new Color(255,0,0));
        menuOptions.add(menuWallpaper);

        myCalculate = new JMenuItem("Vacaciones");
        myCalculate.setFont(new Font("Andale Mono", 1, 14));
        myCalculate.setForeground(new Color(255,0,0));
        menuCalculate.add(myCalculate);
        myCalculate.addActionListener(this);

        myLatam = new JMenuItem("Latam");
        myLatam.setFont(new Font("Andale Mono", 1, 14));
        myLatam.setForeground(new Color(255,0,0));
        menuWallpaper.add(myLatam);
        myLatam.addActionListener(this);

        myBlack = new JMenuItem("Oscuro");
        myBlack.setFont(new Font("Andale Mono", 1, 14));
        myBlack.setForeground(new Color(255,0,0));
        menuWallpaper.add(myBlack);
        myBlack.addActionListener(this);

        myPurple = new JMenuItem("Morado");
        myPurple.setFont(new Font("Andale Mono", 1, 14));
        myPurple.setForeground(new Color(255,0,0));
        menuWallpaper.add(myPurple);
        myPurple.addActionListener(this);

        myNew = new JMenuItem("Nuevo");
        myNew.setFont(new Font("Andale Mono", 1, 14));
        myNew.setForeground(new Color(255,0,0));
        menuOptions.add(myNew);
        myNew.addActionListener(this);

        myCreator = new JMenuItem("El Creador");
        myCreator.setFont(new Font("Andale Mono", 1, 14));
        myCreator.setForeground(new Color(255,0,0));
        menuAbout.add(myCreator);
        myCreator.addActionListener(this);

        myExit = new JMenuItem("Salir");
        myExit.setFont(new Font("Andale Mono", 1, 14));
        myExit.setForeground(new Color(255,0,0));
        menuOptions.add(myExit);
        myExit.addActionListener(this);

        ImageIcon imagen = new ImageIcon("images/logoBlanco.png");
        labelLogo = new JLabel(imagen);
        labelLogo.setBounds(5, 5, 330, 100);
        add(labelLogo);

        labelWelcome = new JLabel("Bienvenido " + nameAdmin);
        labelWelcome.setBounds(350, 30, 300, 50);
        labelWelcome.setFont(new Font("Andale Mono", 1, 32));
        labelWelcome.setForeground(new Color(255,255,255));
        add(labelWelcome);

        labelTitle = new JLabel("Datos del trabajador para el calculo de vacaiones");
        labelTitle.setBounds(45, 140, 900, 25);
        labelTitle.setFont(new Font("Andale Mono", 0, 24));
        labelTitle.setForeground(new Color(255,255,255));
        add(labelTitle);

        labelName = new JLabel("Nombre: ");
        labelName.setBounds(25, 188, 180, 25);
        labelName.setFont(new Font("Andale Mono", 1, 12));
        labelName.setForeground(new Color(255,255,255));
        add(labelName);

        txtName = new JTextField();
        txtName.setBounds(25, 213, 150, 25);
        txtName.setBackground(new java.awt.Color(224, 224, 224));
        txtName.setFont(new java.awt.Font("Andale Mono", 1, 14));
        txtName.setForeground(new java.awt.Color(255, 0, 0));
        add(txtName);

        labelLastName1 = new JLabel("Apellido Paterno: ");
        labelLastName1.setBounds(25, 248, 180, 25);
        labelLastName1.setFont(new Font("Andale Mono", 1, 12));
        labelLastName1.setForeground(new Color(255,255,255));
        add(labelLastName1);

        txtLastName1 = new JTextField();
        txtLastName1.setBounds(25, 273, 150, 25);
        txtLastName1.setBackground(new java.awt.Color(224, 224, 224));
        txtLastName1.setFont(new java.awt.Font("Andale Mono", 1, 14));
        txtLastName1.setForeground(new java.awt.Color(255, 0, 0));
        add(txtLastName1);

        labelLastName2 = new JLabel("Apellido Materno: ");
        labelLastName2.setBounds(25, 308, 180, 25);
        labelLastName2.setFont(new Font("Andale Mono", 1, 12));
        labelLastName2.setForeground(new Color(255,255,255));
        add(labelLastName2);

        txtLastName2 = new JTextField();
        txtLastName2.setBounds(25, 334, 150, 25);
        txtLastName2.setBackground(new java.awt.Color(224, 224, 224));
        txtLastName2.setFont(new java.awt.Font("Andale Mono", 1, 14));
        txtLastName2.setForeground(new java.awt.Color(255, 0, 0));
        add(txtLastName2);

        labelDepto = new JLabel("Selecciona el Departamento: ");
        labelDepto.setBounds(220, 188, 180, 25);
        labelDepto.setFont(new Font("Andale Mono", 1, 12));
        labelDepto.setForeground(new Color(255,255,255));
        add(labelDepto);

        comboDepto = new JComboBox();
        comboDepto.setBounds(220, 213, 220, 25);
        comboDepto.setBackground(new java.awt.Color(224, 224, 224));
        comboDepto.setFont(new Font("Andale Mono", 1, 14));
        comboDepto.setForeground(new Color(255,0,0));
        add(comboDepto);
        comboDepto.addItem("");
        comboDepto.addItem("Atencion al Pasajero");
        comboDepto.addItem("Rampa");
        comboDepto.addItem("Gerencia");


        labelLabor = new JLabel("Selecciona Antiguedad Laboral: ");
        labelLabor.setBounds(220, 248, 180, 25);
        labelLabor.setFont(new Font("Andale Mono", 1, 12));
        labelLabor.setForeground(new Color(255,255,255));
        add(labelLabor);

        comboLabor = new JComboBox();
        comboLabor.setBounds(220, 273, 220, 25);
        comboLabor.setBackground(new java.awt.Color(224, 224, 224));
        comboLabor.setFont(new Font("Andale Mono", 1, 14));
        comboLabor.setForeground(new Color(255,0,0));
        add(comboLabor);
        comboLabor.addItem("");
        comboLabor.addItem("1 a?o de servicio");
        comboLabor.addItem("2 a 6 a?os de servicio");
        comboLabor.addItem("7 o mas a?os de servico");


        labelResult = new JLabel("Resultado del Calculo: ");
        labelResult.setBounds(220, 307, 180, 25);
        labelResult.setFont(new Font("Andale Mono", 1, 12));
        labelResult.setForeground(new Color(255,255,255));
        add(labelResult);

        textArea1 = new JTextArea();
        textArea1.setEditable(false);
        textArea1.setBackground(new Color(224,224,224));
        textArea1.setFont(new Font("Andale Mono", 1, 11));
        textArea1.setForeground(new Color(255, 0, 0));
        textArea1.setText("\n Aqui aparece el resultado del calculo de las vacaciones.");
        scrollPane1 = new JScrollPane(textArea1);
        scrollPane1.setBounds(220, 333, 385, 90);
        add(scrollPane1);


        labelFooter = new JLabel("?2022 LATAM Airlines Chile | Todos los derechos reservados");
        labelFooter.setBounds(135,445,500,30);
        labelFooter.setFont(new Font("Andale Mono", 1, 12));
        labelFooter.setForeground(new Color(255,255,255));
        add(labelFooter);
        
    }

    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource() == myCalculate){
            String name = txtName.getText();
            String L1 = txtLastName1.getText();
            String L2 = txtLastName2.getText();
            String Depto = comboDepto.getSelectedItem().toString();
            String Labor = comboLabor.getSelectedItem().toString();//antiguedad

            if(name.equals("") || L1.equals("") || L2.equals("") || Depto.equals("") || Labor.equals("")){
                JOptionPane.showMessageDialog(null, "Debes completar todos los campos.");
            } else {
                if(Depto.equals("Atencion al Pasajero")){
                    if(Labor.equals("1 a?o de servicio")){
                        textArea1.setText("\n  El trabajador " + name + " " + L1 + " " + L2 + 
                                          "\n quien trabaja en el area de " + Depto + " con " + Labor + 
                                          "\n recibe 15 dias de vacaciones.");
                    }
                    if(Labor.equals("2 a 6 a?os de servicio")){
                        textArea1.setText("\n  El trabajador " + name + " " + L1 + " " + L2 + 
                                          "\n quien trabaja en el area de " + Depto + " con " + Labor + 
                                          "\n recibe 17 dias de vacaciones.");
                    }
                    if(Labor.equals("7 o mas a?os de servico")){
                        textArea1.setText("\n  El trabajador " + name + " " + L1 + " " + L2 + 
                                          "\n quien trabaja en el area de " + Depto + " con " + Labor + 
                                          "\n recibe 20 dias de vacaciones.");
                    }
                    
                }
                if(Depto.equals("Rampa")){
                    if(Labor.equals("1 a?o de servicio")){
                        textArea1.setText("\n  El trabajador " + name + " " + L1 + " " + L2 + 
                                          "\n quien trabaja en el area de " + Depto + " con " + Labor + 
                                          "\n recibe 16 dias de vacaciones.");
                    }
                    if(Labor.equals("2 a 6 a?os de servicio")){
                        textArea1.setText("\n  El trabajador " + name + " " + L1 + " " + L2 + 
                                          "\n quien trabaja en el area de " + Depto + " con " + Labor + 
                                          "\n recibe 18 dias de vacaciones.");
                    }
                    if(Labor.equals("7 o mas a?os de servico")){
                        textArea1.setText("\n  El trabajador " + name + " " + L1 + " " + L2 + 
                                          "\n quien trabaja en el area de " + Depto + " con " + Labor + 
                                          "\n recibe 22 dias de vacaciones.");
                    }
                    
                }
                if(Depto.equals("Gerencia")){
                    if(Labor.equals("1 a?o de servicio")){
                        textArea1.setText("\n  El trabajador " + name + " " + L1 + " " + L2 + 
                                          "\n quien trabaja en el area de " + Depto + " con " + Labor + 
                                          "\n recibe 17 dias de vacaciones.");
                    }
                    if(Labor.equals("2 a 6 a?os de servicio")){
                        textArea1.setText("\n  El trabajador " + name + " " + L1 + " " + L2 + 
                                          "\n quien trabaja en el area de " + Depto + " con " + Labor + 
                                          "\n recibe 20 dias de vacaciones.");
                    }
                    if(Labor.equals("7 o mas a?os de servico")){
                        textArea1.setText("\n  El trabajador " + name + " " + L1 + " " + L2 + 
                                          "\n quien trabaja en el area de " + Depto + " con " + Labor + 
                                          "\n recibe 25 dias de vacaciones.");
                    }
                    
                }
            }

        }
        if (ev.getSource() == myLatam){
            getContentPane().setBackground(new Color(16,0,79));
        }
        if (ev.getSource() == myBlack){
            getContentPane().setBackground(new Color(0,0,0));
        }
        if (ev.getSource() == myPurple){
            getContentPane().setBackground(new Color(51,0,51));
        }
        if (ev.getSource() == myNew){
            txtName.setText("");
            txtLastName1.setText("");
            txtLastName2.setText("");
            comboDepto.setSelectedIndex(0);
            comboLabor.setSelectedIndex(0);
            textArea1.setText("\n Aqui aparace el resultado del calculo de las vacaiones. ");
        }
        if (ev.getSource() == myExit){
            Welcome windowWelcome = new Welcome();//= ventanabienvenida
            windowWelcome.setBounds(0,0,380,450);
            windowWelcome.setVisible(true);
            windowWelcome.setResizable(false);
            windowWelcome.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if (ev.getSource() == myCreator){
            JOptionPane.showConfirmDialog(null, "Desarrollado por Marcelo Morales \n"+
                                                                         "  https://github.com/Marcel0M");
        }

    }

    public static void main(String args[]) {
        Menu windowMenu = new Menu();
        windowMenu.setBounds(0, 0, 650, 535);
        windowMenu.setVisible(true);
        windowMenu.setResizable(false);
        windowMenu.setLocationRelativeTo(null);
    }
}
