programa
{
	//Escreva um sistema que leia três números inteiros e positivos A, B e C.

	
	inclua biblioteca Matematica --> math
	
	funcao inicio()
	{

	 	inteiro A,B,C,R,S
	 	
		escreva("Insira o numero de A:")
		leia(A)
		
		escreva("Insira o numero de B:")
		leia(B)
		
		escreva("Insira o numero de C:")
		leia(C)

		
		//R=(A+B)²
		R = math.potencia((A+B), 2.0) 
		
		//S=(B+C)²
		S = math.potencia((B+C), 2.0)

		
		//D=R+S/2
		escreva("O valor de D=" , (R+S)/2)	

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 370; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */