/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aulaestruturas;

import java.util.Scanner;
        
/**
 *
 * @author Bruno Stefanello
 */
public class AulaEstruturas {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       String nome [] = new String[10];
       int numeros [] = new int[20];
       double real [] = new double[5];
       
            for(int i=0; i<1;i++){
                System.out.println("Digite um nome: ");
                nome[i] = ler.nextLine();
                
                
            }
            System.out.print("\nNomes Informados: ");
            for(int i = 0; i<nome.length;i++){
                System.out.print(nome[i]+" - ");
            }
            
            //inteiro
            for(int i=0; i<numeros.length;i++){
                System.out.println("\nDigite um numero inteiro: ");
                numeros[i] = ler.nextInt();
            }
            
            System.out.print("\nNumeros inteiros Informados: ");
            for(int i = 0; i<numeros.length;i++){
                System.out.print(numeros[i]+" - ");
            }
            //real
            for(int i=0; i<real.length;i++){
                System.out.println("\nDigite um numero real: ");
                real[i] = ler.nextDouble();
            }
            
            System.out.print("\nNumeros reais Informados: ");
            for(int i = 0; i<real.length;i++){
                System.out.print(real[i]+" - ");
            }
    }
}
