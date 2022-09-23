/***************** MARCELO MORALES *************************/
/* IMPORTAMOS LIBRERIAS */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Welcome extends JFrame implements ActionListener{
    private JTextField textfield1;
    private JLabel label1, label2, label3, label4;
    private JButton button1;//=boton1
    public static String text = "";
    
    public Welcome(){
        setLayout(null);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(16,0,79));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        ImageIcon imagen = new ImageIcon("images/logoBlanco.png");
        label1 = new JLabel(imagen);
        label1.setBounds(25,15,320,150);
        add(label1);

        label2 = new JLabel("Sistema Gestor de Vaciones");
        label2.setBounds(60,140,300,30);
        label2.setFont(new Font("Andale Mono", 3, 18));
        label2.setForeground(new Color(255,255,255));
        add(label2);

        label3 = new JLabel("Ingrese su nombre");
        label3.setBounds(50,212,200,30);
        label3.setFont(new Font("Andale Mono", 1, 12));
        label3.setForeground(new Color(255,255,255));
        add(label3);

        label4 = new JLabel("©2022 LATAM Airlines Chile");
        label4.setBounds(100,375,300,30);
        label4.setFont(new Font("Andale Mono", 1, 12));
        label4.setForeground(new Color(255,255,255));
        add(label4);

        textfield1 = new JTextField ();
        textfield1.setBounds(50,240,255,25);
        textfield1.setBackground(new Color(255,255,255));
        textfield1.setFont(new Font("Andale Mono", 1, 14));
        textfield1.setForeground(new Color(16,0,79));
        add(textfield1);

        button1 = new JButton("Ingresar");
        button1.setBounds(125,280,100,30);
        button1.setBackground(new Color(224,224,224));
        button1.setFont(new Font("Andale Mono", 1, 14));
        button1.setForeground(new Color(0,0,0));
        button1.addActionListener(this);
        add(button1);
    }

    public void actionPerformed(ActionEvent ev){
        if(ev.getSource() == button1){
            text = textfield1.getText().trim();
            if(text.equals("")){
                JOptionPane.showMessageDialog(null, "Debes inresar tu nombre");
            } else{
                Terms windowTerms = new Terms();//= Licencia
                windowTerms.setBounds(0,0,640,400);
                windowTerms.setVisible(true);
                windowTerms.setResizable(false);
                windowTerms.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        }
    }

    public static void main(String args[]){
        Welcome windowWelcome = new Welcome();//= ventanabienvenida
        windowWelcome.setBounds(0,0,380,450);
        windowWelcome.setVisible(true);
        windowWelcome.setResizable(false);
        windowWelcome.setLocationRelativeTo(null);
    }
}