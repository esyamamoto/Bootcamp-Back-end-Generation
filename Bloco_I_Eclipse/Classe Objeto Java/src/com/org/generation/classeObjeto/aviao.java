package com.org.generation.classeObjeto;

public class aviao {
	
		String cor;
		String companhia;
		boolean ativado;
			
		
		public void ativar ()
		{ 
			ativado = true;
		}
		public void desligar()
		{
			ativado=false;
		}
		public void decolar ()
		{
			
			if(ativado==true)
				 System.out.print("\nPronto para decolagem!");
			
			else
				System.out.print("ERRO PARA DECOLAGEM!!! ");
		
		}
		public void status () {
			System.out.print("O avião é da cor:" +this.cor);
			System.out.print("\nA companhia do avião é: "+this.companhia);
		
				}

	}


