programa
{
	//Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.

	
	funcao inicio()
	{
		real n1, n2, n3
		real media

		escreva("Digite a n1: ")
		leia(n1)

		escreva("Digite a n2: ")
		leia(n2)

		escreva("Digita a n3: ")
		leia(n3)

		media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10
		escreva("Média é:", media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 446; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */