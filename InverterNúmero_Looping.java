/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas;

/**
 *
 * @author Matheus
 */
import java.util.Scanner;
public class InverterNúmero_Looping {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro e positivo:");
        int num = entrada.nextInt();
        while (num < 0){
            System.out.println("Número Negativo.Digite um número inteiro");
            num = entrada.nextInt();
        }
        do{
            System.out.print(num%10);
            num=num/10;
        }
        while (num!=0);
}}
