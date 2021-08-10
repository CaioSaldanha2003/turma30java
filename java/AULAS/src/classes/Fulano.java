package classes;

public class Fulano {
	private String primeiroNome;
	private String nomesDoMeio;
	private String ultimoNome;
	
	public Fulano (String primeiro,String meio,String ultimo) {
		primeiroNome = primeiro;
		nomesDoMeio = meio;
		ultimoNome = ultimo;
	}
	
	public String getNomeCompleto() {
		String nomeCompleto = primeiroNome+" "+nomesDoMeio+" "+ultimoNome;
		return nomeCompleto;
	}
}
