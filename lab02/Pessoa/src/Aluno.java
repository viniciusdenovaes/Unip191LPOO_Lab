
public class Aluno extends Pessoa {
	
	private Boletim boletim = new Boletim();
	
	public Nota getNotaNP1() {
		return boletim.getNotaNP1();
	}
	public Nota getNotaNP2() {
		return boletim.getNotaNP2();
	}
	
	public void setNotaNP1(Nota nota) {
		this.boletim.setNotaNP1(nota);
	}
	public void setNotaNP2(Nota nota) {
		this.boletim.setNotaNP2(nota);
	}
	
	public void setNotaNP1(double nota) {
		this.boletim.setNotaNP1(nota);
	}
	public void setNotaNP2(double nota) {
		this.boletim.setNotaNP2(nota);
	}
	
	@Override
	public void relatorio() {
		System.out.println("Classe Aluno");
		System.out.println("Id: " + this.getId());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Nota NP1: " + this.getNotaNP1());
		System.out.println("Nota NP2: " + this.getNotaNP2());
		
		double media = boletim.getMedia();
		System.out.println("Media: " + media);
		if(media >= 7.0)
			System.out.println("O aluno passou direto");
		else
			System.out.println("O aluno não passou direto");
		System.out.println();
		
	}

}
