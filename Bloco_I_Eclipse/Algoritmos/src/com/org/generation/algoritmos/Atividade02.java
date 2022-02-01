package com.org.generation.algoritmos;

import java.util.Scanner;

public class Atividade02 {
	
public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idadeDias, ano, mes, dia;
		
		System.out.println("Escreva sua idade em dias: ");
		idadeDias = ler.nextInt();
		
		ano = idadeDias / 365;
		mes =(idadeDias % 365)/ 30;
		dia =(idadeDias%365)%30;
		
		System.out.println("Você tem: "+ano+" anos, "+mes+" meses e "+dia+" dias.");
		ler.close();
		
	}
}
