programa
{
	
	funcao inicio()
	{
		//código, número de horas, valor excedentes, horas excedentes, salario, salario total
		real C, N, vE, E, salario, sT

		escreva("Insira o seu código: ")
		leia(C)
		
		escreva("\nInsira o número de horas trabalhadas: ")
		leia(N)

		se (N <= 50 e N>=0) {
			salario = N * 10
			escreva("\nSeu salário é: "+ salario + "\n.")
			        }
		
		senao se (N > 50) {
			E = (N - 50)
			vE = E * 20
			sT = ((N- E) * 10) + vE
			
			escreva("\nO salário excedente é R$" + vE + " e o salário total é R$" + sT +"\n\n.")
		                  }
			
		senao {
			salario = 0.0
			escreva("\nEntrada Inválida\n\n")
		      }

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 663; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */