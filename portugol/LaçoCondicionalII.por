programa{
	
	inclua biblioteca Matematica --> mat
	funcao inicio(){
	cadeia nome
	real nota1,nota2,nota3,media

	escreva("Seu nome: ")
	leia(nome)
	escreva("\nPrimeira nota: ")
	leia(nota1)
	escreva("\nSegunda nota: ")
	leia(nota2)
	escreva("\nTerceira nota: ")
	leia(nota3)

	media = (nota1+nota2+nota3)/(3)
	limpa()

	se (media > 7.0){
	escreva("Aluno: ",nome,", você passou com a nota: ",mat.arredondar(media,2))	
	}

	senao se(media >= 4 e media < 7.0){
	escreva("Você está de recuperação com a nota: ",mat.arredondar(media,2))
	}

	senao{
	escreva("Cê reprovou colega, com a nota: ",mat.arredondar(media,2))
	}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 259; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */