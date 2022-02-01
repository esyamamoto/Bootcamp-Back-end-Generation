package com.org.generation.algoritmos;

import java.util.Scanner;

public class Atividade08 {
public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double custoFabrica, custoFinal;
		
		System.out.println("Insira o valor do carro: ");
		custoFabrica = ler.nextDouble();
		
		//foi somado o valor da porcentagem de 28% + 45% = 73%
		
		custoFinal = custoFabrica*1.73;
		
		System.out.println("O valor do carro para o consumidor é: " + custoFinal);
		ler.close();
	
	}
}
