programa
{
	inclua biblioteca Matematica -->math
	
	funcao inicio()
	{
		real P , M , E
		
		
		//peso dos tomates
		escreva("Qual o peso em kg dos tomates? ")
		leia(P)

		se (P>=50) {

			E = P - 50

			M = E * 4		
		
		escreva("Ultrapassou o peso máximo de 50 KG, e sua multa é de " + M)
		}
		
		senao 
		{
		escreva("Não teve peso excedente!")
		}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 368; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */