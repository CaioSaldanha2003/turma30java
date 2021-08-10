package lista5;

public class Animal {
	private String nome;
	private int anoNascimento;
	
	public Animal (String nome, int anoNascimento) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
	}
	
	public void emitirSom() {
		System.out.println("*O som característico do animal pode ser escutado*");
	}
	
	public int calcIdade (int anoAtual) {
		int valor;
		valor = anoAtual - anoNascimento;
		return valor;
	}

						public String getNome() {
				return nome;
			}

						public void setNome(String nome) {
				this.nome = nome;
			}

						public int getAnoNascimento() {
				return anoNascimento;
			}

						public void setAnoNascimento(int anoNascimento) {
				this.anoNascimento = anoNascimento;
			}
	
}
