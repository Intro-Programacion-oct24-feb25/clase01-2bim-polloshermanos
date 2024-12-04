/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class hola {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador = 1;
        int contador2 = 0;
        System.out.println("Ingrese el número de tablas que desea crear");
        int tablas = leer.nextInt();
        System.out.println("Ingrese el límite de la tabla");
        int limite = leer.nextInt();

        while (contador <= tablas) {
            System.out.println("Tabla del:" + contador);
            contador2 = 1;
            contador++;
            while (contador2 <= limite) {
                System.out.println(contador + "*" + contador2 + "=" + contador * contador2);
                contador2++;
            }
        }
    }
}
