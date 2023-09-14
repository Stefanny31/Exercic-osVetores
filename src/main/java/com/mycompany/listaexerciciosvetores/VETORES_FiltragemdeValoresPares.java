/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexerciciosvetores;

/**
 *
 * @author stefanny.0181
 */
public class VETORES_FiltragemdeValoresPares {
    public static void main(String args[]){
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        //Contagem de pares
        int contPares =0;
        for(int i=0; i < numeros.length; i++){
            if(numeros[i] % 2 ==0){
                contPares++;
                
            }
        }
        
        //Atribuição dos valores pares ao vetor de pares
        int[] pares = new int[contPares];
        int contParesPos =0;
        for(int i=0; i<numeros.length; i++){
            if(numeros[i] % 2 == 0){
                pares[contParesPos] = numeros[i];
                contParesPos++;
                
            }
        }
        
         //Mostrando os valores pares
        for(int i = 0; i < pares.length; i++){
        System.out.println(pares[i]);
        
        }
    }
    
}
