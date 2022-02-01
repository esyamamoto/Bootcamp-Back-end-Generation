programa
{
	
	funcao inicio()
	{
		//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.

		inteiro dia, mes, anoNascimento
		inteiro diaAtual, mesAtual, anoAtual
		inteiro total

		escreva("Informe o dia do seu aniversário: ")
		leia(dia)
		escreva("Mês: ")
		leia(mes)
		escreva("ano de nascimento: ")
		leia(anoNascimento)

		escreva("Informe dia atual: ")
		leia(diaAtual)
		escreva("mês atual: ")
		leia(mesAtual)
		escreva("Ano atual: ")
		leia(anoAtual)

		total = (anoAtual - anoNascimento) * 365 + (mesAtual * 30 + diaAtual) - (mes * 30 + dia)
		escreva ("Sua idade em quantidade de dias é: " + total )
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 681; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */