package com.upchiapas.C3Practiva1;
import com.upchiapas.C3Practiva1.models.LeerDatos;
import com.upchiapas.C3Practiva1.models.Operaciones;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        mostraMenu();
    }

    public static void mostraMenu(){
        byte opcion;
        LeerDatos leerDatos = new LeerDatos();
        Operaciones operaciones = new Operaciones();
        do {
            opcion=Byte.parseByte(JOptionPane.showInputDialog(null, "1.Agregar numero.\n" +"2.Sumar los numeros ingreados.\n" +"3.Salir.\n" +"Ingrese una opcion: "));

            switch (opcion){
                case 1:
                    leerDatos.agregarNumeros();
                    break;
                case 2:
                    operaciones.calcularSuma(leerDatos.getListaNumeros());
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opcion no correcta, ingresa otra que sea valida.");
            }
        }while (opcion != 3);
    }
}
