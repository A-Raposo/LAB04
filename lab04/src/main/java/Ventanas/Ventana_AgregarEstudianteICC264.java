package Ventanas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import datos.*;

public class Ventana_AgregarEstudianteICC264 extends Ventana implements ActionListener {
    datos datos = new datos();
    public Ventana_AgregarEstudianteICC264() {
        laminaAgregar();
        add(lamina);
    }
    private JLabel label = new JLabel("rut: ");
    private JLabel label1 = new JLabel("Nombre: ");
    private JLabel label2 = new JLabel("Email: ");

    private JTextField texto = new JTextField(10);
    private JTextField texto1 = new JTextField(10);
    private JTextField texto2 = new JTextField(10);

    private JPanel laminaBoton = new JPanel();
    private JButton boton = new JButton("Agregar");
    private JButton boton1 = new JButton("Cancelar");
    public void laminaAgregar(){
        lamina.add(label,constraints);
        lamina.add(texto,constraints);
        constraints.gridy = 1;
        lamina.add(label1,constraints);
        lamina.add(texto1,constraints);
        constraints.gridy = 2;
        lamina.add(label2,constraints);
        lamina.add(texto2,constraints);

        constraints.gridy = 3;
        constraints.gridwidth = 2;
        laminaBoton.add(boton);
        laminaBoton.add(boton1);
        lamina.add(laminaBoton,constraints);

        boton.addActionListener(this);
        boton1.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object seleccion = e.getSource();

        if(seleccion == boton){
        datos.agregarAlumno(texto.getText(),texto1.getText(),texto2.getText());


        }else{
            new Ventana_CursoICC264();
        }
    }
}
