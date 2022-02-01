package com.org.generation.laçosRepetição;

import java.util.Scanner;

public class Atividade05 {
public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
		
		int num = 0, soma = 0;
		
		do 
		{
			
			System.out.println("Digite o número que deseja somar, e finalize digitando 0: ");
			num = leia.nextInt();
			
			soma += num;
		}
		
		while(num !=0);
		
		System.out.print("A soma de todos os números é: " + soma);
		
		leia.close();
	}
}
