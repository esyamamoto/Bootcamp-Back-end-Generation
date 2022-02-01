programa
{

		funcao inicio()
	{
		cadeia nome
		inteiro anos, idade

		escreva("Entre com seu nome: ")
		leia(nome)
		escreva("Qual a sua idade?: ")
		leia(idade)


		
		se (idade<4)
		{
			escreva("Nome: ",nome,  "\nNadador(a) não se encaixa em nenhuma categoria")
		}
		senao se (idade>=5 e idade<=7)
		{
			escreva("Nome: ", nome, "\nNadador(a) na categotia Infantil A")
		}
		senao se (idade>=8 e idade<=11)
		{
			escreva("Nome: ", nome, "\nNadador(a) na categotia Infantil B")
		}
		senao se (idade>=12 e idade<=13)
		{
			escreva("Nome: ", nome, "\nNadador(a) na categotia Juvenil A ")
		}
		senao se (idade>=14 e idade<=17)
		{
			escreva("Nome: ", nome, "\nNadador(a) na categoti Juvenil B ")
		}
		senao se (idade>=18)
		{
			escreva("Nome: ", nome,"\nNadador(a) na categotia Adulto ")
		}
		
			
	}
}



/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 270; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */