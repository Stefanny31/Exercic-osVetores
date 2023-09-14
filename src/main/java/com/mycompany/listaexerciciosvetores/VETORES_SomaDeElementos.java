package com.mycompany.listaexerciciosvetores;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stefanny.0181
 */
public class VETORES_SomaDeElementos {
    public static void main(String args[]){
        int[] vetor = {1,2,3,4,5};
        int soma = 0;
        
        for(int i = 0; i < vetor.length; i++){
            soma = soma + vetor[i];
        }
        System.out.println("Total: " + soma);
                
    }
    
}
