package com.org.generation.classeObjeto;

import java.util.Scanner;

public class TesteAviao {
	public static void main(String []args){
		aviao a1 = new aviao ();
		
		{
			Scanner entrada = new Scanner (System.in);
			System.out.println("Digite a cor do avião: ");
			a1.cor = entrada.nextLine();
			System.out.println("Digite a companhia do avião desejado: ");
			a1.companhia = entrada.nextLine();
			a1.status();
			a1.ativar();
			a1.decolar();
			entrada.close();	
		}
	}
}
