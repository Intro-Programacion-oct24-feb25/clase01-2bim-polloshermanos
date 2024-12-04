/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Ejericio {
    public static void main(String[] args) {
        Scanner entradad =new Scanner(System.in);
        
        int tabla;
        int limite;
        String cadena="";
        int contadorTabla=1;
        int contadorLimite=1;
        
        System.out.println("Ingrese el numero de tablas que desea");
        tabla=entradad.nextInt();
        System.out.println("Ingrese el limite de cada tabla");
        limite =entradad.nextInt();
        
        while (contadorTabla <= tabla) {            
            while (contadorLimite <= limite) {   
                int resultado=contadorTabla*contadorLimite;
                cadena= String.format("%s\n%d*%d%d=",
                        cadena,
                        contadorTabla,
                        contadorLimite);
                contadorLimite=contadorLimite+1;
            }
            contadorLimite=0;
            contadorTabla=contadorTabla+1;
        }
    }
}
