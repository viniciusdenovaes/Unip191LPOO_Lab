
public class Pessoa {
	
	private String id;
	private String nome;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void relatorio() {
		System.out.println("Classe Pessoa");
		System.out.println("Id: " + this.getId());
		System.out.println("Nome: " + this.getNome());
		System.out.println();
	}

}
