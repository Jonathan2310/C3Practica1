package com.upchiapas.C3Practiva1.models;

import javax.swing.*;
import java.util.ArrayList;

public class Operaciones {
    public void calcularSuma(ArrayList<Integer> listaNumeros){
        int sumaTotal = 0;

        for (int i=0; i<listaNumeros.size() && listaNumeros.get(i)!=null; i++){
            sumaTotal += listaNumeros.get(i);
        }

        JOptionPane.showMessageDialog(null,"\nSuma = "+sumaTotal+"\n");
        listaNumeros.clear();
    }
}
