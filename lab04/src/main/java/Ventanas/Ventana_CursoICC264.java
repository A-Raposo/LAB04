package Ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import datos.*;

public class Ventana_CursoICC264 extends Ventana implements ActionListener {
    datos datos = new datos();

    private JButton boton = new JButton("Nuevo Estudiante");

    private JComboBox lista = new JComboBox(datos.getRut().toArray());

    private JLabel label = new JLabel("Nombre: ");
    private JLabel label1 = new JLabel("Email: ");

    private JTextField texto = new JTextField(30);
    private JTextField texto1 = new JTextField(30);
    public Ventana_CursoICC264() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(lamina());
        GestorArchivo ga = new GestorArchivo();
    }

    private Component lamina() {

        lista.insertItemAt("",0);
        lista.setSelectedIndex(0);

        texto.setEditable(false);
        texto1.setEditable(false);
        constraints.gridwidth = 2;
        lamina.add(lista,constraints);
        constraints.gridwidth = 1;
        constraints.gridy = 1;
        lamina.add(label,constraints);
        lamina.add(texto,constraints);
        constraints.gridy = 2;
        lamina.add(label1,constraints);
        lamina.add(texto1,constraints);
        constraints.gridy = 3;
        constraints.gridx = 1;
        lamina.add(boton,constraints);

        lista.addActionListener(this);
        boton.addActionListener(this);


        return lamina;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object seleccion = e.getSource();

        if(seleccion == boton){
            new Ventana_AgregarEstudianteICC264();
            this.dispose();

        }else{
            if (lista.getSelectedIndex()!=0) {
                texto.setText(datos.getNombre().get(lista.getSelectedIndex() - 1));
                texto1.setText(datos.getCorreo().get(lista.getSelectedIndex()-1));
            }else{
                texto.setText(null);
                texto1.setText(null);
            }
        }
    }
}