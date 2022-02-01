package com.org.generation.algoritmos;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int horas, minutos, segundos;
		
		System.out.println("Escreva o tempo de duração em segundos:");
		segundos = ler.nextInt();
		
		minutos = segundos/60;
		horas = minutos/60;
		
			if (horas==1) {
			System.out.println(horas+" hora, "+ minutos+ " minutos e "+segundos+" segundos.");
		}		
			
		else {
			System.out.println(horas+" horas, "+ minutos+ " minuto e "+segundos+" segundos.");
			
		}		
			ler.close();
	}
}
