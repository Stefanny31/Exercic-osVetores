/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexerciciosvetores;

import java.util.Scanner;

/**
 *
 * @author stefanny.0181
 */
public class VETORES_MaioreMenorNumero {
    public static void main(String args[]){
        Scanner scanner = new Scanner (System.in);
        int[] valor = new int[4];
        int maior = 0 , menor = 0;
        
        for (int i = 0; i < valor.length; i++){
            System.out.println("Digito o " +(i++)+ " valor:");
            valor[i] = scanner.nextInt();
            if(valor[i] > maior){
                maior = valor[i];
            }
            
        }
        for (int j = 0; j < valor.length; j++){
            if(valor[j] < menor){
                menor = valor[j];
            }
        }
        System.out.println("Maior valor = " + maior);
        System.out.println("Menor valor = " + menor);
    }
}
    
    
    

