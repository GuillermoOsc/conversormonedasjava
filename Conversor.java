
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GFG {

    // using Java Swing
    public static void converter() {

        // Marco general
        JFrame f = new JFrame("CONVERTER");

        JLabel l1, l2;

        // Campos de textos

        JTextField t1, t2;

        // botones
        JButton b1, b2, b3;

        // Plantillas formulario

        l1 = new JLabel("Pesos:");
        l1.setBounds(20, 40, 60, 30);
        l2 = new JLabel("Dolares:");
        l2.setBounds(170, 40, 60, 30);

        // Por defecto se inician los valores en 0
        t1 = new JTextField("0");
        t1.setBounds(80, 40, 50, 30);
        t2 = new JTextField("0");
        t2.setBounds(240, 40, 50, 30);

        b1 = new JButton("Pesos");
        b1.setBounds(50, 80, 60, 15);
        b2 = new JButton("Dollar");
        b2.setBounds(190, 80, 60, 15);
        b3 = new JButton("close");
        b3.setBounds(150, 150, 60, 30);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Conversion
                double d = Double.parseDouble(t1.getText());
                double d1 = (d / 95.05);

                String str1 = String.valueOf(d1);

                t2.setText(str1);
            }
        });

        // Adding action listener
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Conversion
                double d2 = Double.parseDouble(t2.getText());

                // Dolares / pesos
                double d3 = (d2 * 65.25);

                // Calculo valores
                String cambioPesos = String.valueOf(d3);

                // texto
                t1.setText(cambioPesos);
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });

        // Método predeterminado para cerrar el marco
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Añadir objetos creados
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.setLayout(null);
        f.setSize(400, 300);
        f.setVisible(true);
    }

    // Driver code
    public static void main(String args[]) {
        converter();
    }
}