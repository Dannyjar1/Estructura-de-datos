/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uide.estructuradedatos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EstructuraDeDatos {

    public static void main(String[] args) {
        // arreglos();
       // busquedaReemplazo();
       sumarArreglos();
    }

    public static void busquedaReemplazo() {
        String nombres[] = {"Yeferson", "Arlett,", "Leonardo", "Juan", "Kevin", "Danny", "Ricardo", "Nicolas", "Santiago", "Andres", "Anderson"};
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese el numero a buscar");
        String dato = scanner.nextLine();
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals(dato)) {
                System.out.println("Se encontro el nombre del arreglo");
                System.out.println("Deseas remplazar Y/N");
                String reemplazar = scanner.nextLine();
                if (reemplazar.equals("Y")) {
                    System.out.println("Por favor ingresa el valor a reemplazar");
                    String valor = scanner.nextLine();
                    nombres[i] = valor;
                } else {
                    System.out.println("Ud decidio no reemplazar el elemento");
                }

            }
        }

    }

    public static void sumarArreglos() {

        int[] arreglo1 = {1, 4, 5, 6, 7, 2, 4, 5, 4, 4, 2};
        int[] arreglo2 = {3, 333, 4, 7, 5, 2, 3443, 4, 3};
        int[] suma = new int [arreglo1.length + arreglo2.length];
        for(int i = 0; i <suma.length; i++){
            for(int j = 0; j< arreglo1.length; j++){
                suma[i]=arreglo1[j];
                i++;
            }
            for(int j = 0; j <arreglo2.length; j++){
                suma[i]=arreglo2[j];
                i++;
            }
            
        }
        for (int i =0; i<suma.length; i++){
            System.out.println(suma[i]);
        }
    }

    public static void arreglos() {
        String nombres[] = new String[11];
        nombres[0] = "Yeferson";
        nombres[1] = "Arlett";
        nombres[2] = "Leonardo";
        nombres[3] = "Juan";
        nombres[4] = "Kevin";
        nombres[5] = "Danny";
        nombres[6] = "Ricardo";
        nombres[7] = "Nicolas";
        nombres[8] = "Santiago";
        nombres[9] = "Andres";
        nombres[10] = "Anderson";

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        for (int j = nombres.length - 1; j >= 0; j--) {
            System.out.println(nombres[j]);
        }
    }
}
