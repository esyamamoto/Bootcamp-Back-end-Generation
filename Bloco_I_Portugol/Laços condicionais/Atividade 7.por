programa
{
	inclua biblioteca Matematica --> math
	
	funcao inicio()
	{
		
		real  h, b
		real Area


		//area do triangulo

		escreva("Digite a base de um triangulo: ")
		leia(b)

				
		escreva("Digite a altura de um triangulo: ")
		leia(h)

		
			se(b<=0 ou h<=0){
				
				escreva ("Valores invalidos para altura ou base")				 
			}
			
			senao{
				
		//A= b*h/2
		 Area= ((b*h)/2.0)
		
		 escreva ("\nA area do triangulo é: " + Area)
				
		}		


	
		

		 
	}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 249; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */