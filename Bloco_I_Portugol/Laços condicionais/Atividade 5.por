programa
{
	
	funcao inicio()
	{

		// 3 grupos de indústrias
		//índice de poluição aceitável varia de 0,05 até 0,25
		
		real indice , indiceDePoluicao

		escreva("Qual o indice de poluição da sua empresa?: ")
		leia(indice)

		
		se   (indice>=0.05 e indice<=0.25)
		{
			escreva("O indice de poluicao está aceitavel")
		}
		senao se (indice >= 0.3 e indice < 0.4)
		{
			escreva("O indice foi ultrapassado,grupo 1  esta intimada a suspender suas atividades")
		}
		senao se (indice >= 0.4 e indice < 0.5)
		{
			escreva("O indice foi ultrapassado,grupo 1 e 2  estam intimadas a suspenderem suas atividades")
		}
		senao se(indice>=0.5)
		{
			escreva("O indice para todos os grupos foram ultrapassados, e devem encerrar suas atividades")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 750; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */