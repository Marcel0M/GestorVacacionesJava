import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Terms extends JFrame implements ActionListener, ChangeListener{

    private JLabel label1, label2;
    private JCheckBox check1;
    private JButton button1, button2;
    private JScrollPane scrollpane1;
    private JTextArea textarea1;
    String name = "";

    public Terms(){
        setLayout(null);
        setTitle("Licencia de uso");
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        Welcome windowWelcome = new Welcome();
        name = windowWelcome.text;

        label1 = new JLabel("TERMINOS Y CONDICIONES");
        label1.setBounds(215,5,200,30);
        label1.setFont(new Font("Andale Mono", 1, 14));
        label1.setForeground(new Color(0,0,0));
        add(label1);

        textarea1 = new JTextArea();
        textarea1.setEditable(false);
        textarea1.setFont(new Font("Andale Mono", 0, 12));
        textarea1.setText("\n\nTerminos y Condiciones" + 
        "\n" +
        "\n El presente documento establece los Términos y Condiciones de Uso," +
        "\n (en adelante los Términos y Condiciones) mediante los cuales se regirá" +
        "\n el uso de la aplicación de escritorio: generadorVacaciones, (en adelante la Aplicación)," +
        "\n la cual es operada por Marcelo Morales, entidad constituida y válidamente existente bajo" +
        "\n las leyes de la República de Chile, destinada a la facilitación para los usuarios que" +
        "\n deseen instalar o instalen la aplicación de escritorio (en adelante los usuarios)." +
        "\n" +
        "\n El usuario se compromete a leer los Términos y Condiciones aquí establecidos y los" +
        "\n disponibles y regulados, previamente a la descarga de la Aplicación. Por tanto, por" +
        "\n el hecho de instalar la misma se entiende que el Usuario cuenta con el conocimiento integral" +
        "\n de este documento y del contenido en la página Web referida y , que, consecuentemente, acepta" +
        "\n la totalidad de sus estipulaciones. Si el usuario no está de acuerdo con estos Términos y" + 
        "\n Condiciones de Uso, deberá abstenerse de descargar la Aplicación.");
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(10,40,575,200);
        add(scrollpane1);

        check1 = new JCheckBox("Yo " + name + " Acepto");
        check1.setBounds(10,250,300,30);
        check1.addChangeListener(this);
        add(check1);

        button1 = new JButton("Continuar");
        button1.setBounds(10,290,100,30);
        button1.addActionListener(this);
        button1.setEnabled(false);
        add(button1);

        button2 = new JButton("No Acepto");
        button2.setBounds(120,290,100,30);
        button2.addActionListener(this);
        button2.setEnabled(true);
        add(button2);

        ImageIcon imagen = new ImageIcon("images/logop.png");
        label2 = new JLabel(imagen);
        label2.setBounds(315,140,300,300);
        add(label2);
    }

    public void stateChanged(ChangeEvent ev){
        if(check1.isSelected() == true){
            button1.setEnabled(true);
            button2.setEnabled(false);
        }else{
            button1.setEnabled(false);
            button2.setEnabled(true);
        }

    }

    public void actionPerformed(ActionEvent ev){
        if(ev.getSource() == button1){
            Menu windowMenu = new Menu();
            windowMenu.setBounds(0, 0, 650, 535);
            windowMenu.setVisible(true);
            windowMenu.setResizable(false);
            windowMenu.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        else if(ev.getSource() == button2){
            Welcome windowWelcome = new Welcome();//= ventanabienvenida
            windowWelcome.setBounds(0,0,380,450);
            windowWelcome.setVisible(true);
            windowWelcome.setResizable(false);
            windowWelcome.setLocationRelativeTo(null);
            this.setVisible(false);
        }

    }

    public static void main(String args[]){
        Terms windowTerms = new Terms();//= Licencia
        windowTerms.setBounds(0,0,640,400);
        windowTerms.setVisible(true);
        windowTerms.setResizable(false);
        windowTerms.setLocationRelativeTo(null);
    }
}