package com.org.generation.laçosRepetição;

import java.util.Scanner;

public class Atividade06 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
			
		int num,contador=0,soma=0;
		double media;
			
			do 
			{
				
				System.out.println("Digite um número inteiro, e finalize digitando 0: ");
				num = leia.nextInt();
				
				if(num%3 == 0 && num!=0) 
				{	
				soma += num;
				contador++;
				}
			}
			
			while(num !=0);
			media = soma/contador;
			
			System.out.print("A média dos múltiplos de 3 é: " + media);
			
			leia.close();
		}
	}