
public class Aluno {
	
	public String ra;
	public String nome;
	public double notaNP1;
	public double notaNP2;
	
	public void relatorio() {
		
		System.out.println("RA: " + this.ra);
		System.out.println("Nome: " + this.nome);
		System.out.println("nota da NP1: " + this.notaNP1);
		System.out.println("nota da NP2: " + this.notaNP2);
		
		double media = (this.notaNP1 + this.notaNP2) / 2.0;
		System.out.println("Media: " + media);
		if(media >= 7.0) {
			System.out.println("O aluno passou");
		}
		else {
			System.out.println("O aluno não passou");
		}
		System.out.println();
	}

}
