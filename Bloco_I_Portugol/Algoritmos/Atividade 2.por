programa
{
	
	funcao inicio()
	{
		//Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.

		inteiro dias, dia, mes , ano 
		escreva("Digite sua idade em dias: ")
		leia(dias)
		
			 ano = dias / 365
   			 mes =(dias % 365)/ 30
   			 dia =(dias % 365)% 30

   				 escreva("\nEu tenho " + ano + " anos " + mes +" meses " + dia +" dias")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 181; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */