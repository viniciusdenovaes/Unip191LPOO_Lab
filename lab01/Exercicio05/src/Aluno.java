
public class Aluno {
	
	public String ra;
	public String nome;
	public Boletim boletim;
	
	public Aluno(String aRa, String aNome) {
		this.ra = aRa;
		this.nome = aNome;
		this.boletim = new Boletim();
	}
	
	public void setNotaNP1(double aValor) {
		this.boletim.notaNP1 = new Nota(aValor);
	} 
	public void setNotaNP2(double aValor) {
		this.boletim.notaNP2 = new Nota(aValor);
	} 
	
	public void relatorio() {
		
		System.out.println("RA: " + this.ra);
		System.out.println("Nome: " + this.nome);
		System.out.println("nota da NP1: " + this.boletim.notaNP1.valor);
		System.out.println("nota da NP2: " + this.boletim.notaNP2.valor);
		
		double media = (this.boletim.notaNP1.valor + this.boletim.notaNP2.valor) / 2.0;
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
