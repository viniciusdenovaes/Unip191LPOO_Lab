
public abstract class Animal {
	
	private String nome;
	private int idade;
	private boolean doente;
	
	public String getNome() {
		return this.nome;
	}
	public int getIdade() {
		return this.idade;
	}
	public boolean getDoente() {
		return this.doente;
	}
	public void setNome(String aNome) {
		this.nome = aNome;
	}
	public void setIdade(int aIdade) {
		this.idade = aIdade;
	}
	public void setDoente(boolean aDoente) {
		this.doente = aDoente;
	}
	
	public void dorme() {
		System.out.println("ZZZZZZ");
	}
	abstract public void fazBarulho();
	abstract public void procuraComida();
	
	@Override
	public String toString() {
		String resultado = "";
		resultado += "Sou um animal " + this.getClass() + "\n";
		resultado += "Nome: " + this.getNome() + "\n";
		resultado += "Idade: " + this.getIdade() + "\n";
		return resultado;
	}

}


