package com.upchiapas.C3Practiva1.models;

import javax.swing.*;
import java.util.ArrayList;

public class LeerDatos {
    int numero;
    ArrayList<Integer> listaNumeros = new ArrayList<>();

    public ArrayList<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public void agregarNumeros(){
        numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un número: "));
        listaNumeros.add(numero);
        mostrarNumeros();
    }

    public void mostrarNumeros(){
            JOptionPane.showMessageDialog(null, "Numeros ingreasdos:" + listaNumeros);
    }
}
