
public class Aluno {
	
	private static int quantidadeDeAlunos = 0;
	
	private String ra;
	private String nome;
	private Boletim boletim;
	
	public Aluno(String aRa, String aNome) {
		
		Aluno.quantidadeDeAlunos++;
		
		this.ra = aRa;
		this.nome = aNome;
		this.boletim = new Boletim();
	}
	
	public void setNotaNP1(double aValor) {
		this.boletim.setNotaNP1(aValor);
	} 
	public void setNotaNP2(double aValor) {
		this.boletim.setNotaNP2(aValor);
	} 
	
	public void relatorio() {
		
		System.out.println("RA: " + this.ra);
		System.out.println("Nome: " + this.nome);
		System.out.println("nota da NP1: " + this.boletim.getNotaNP1());
		System.out.println("nota da NP2: " + this.boletim.getNotaNP2());
		
		double media = (this.boletim.getNotaNP1() + this.boletim.getNotaNP2()) / 2.0;
		System.out.println("Media: " + media);
		if(media >= 7.0) {
			System.out.println("O aluno passou");
		}
		else {
			System.out.println("O aluno não passou");
		}
		System.out.println();
	}
	
	public static void relatorioDaClasse() {
		System.out.println("A quantidade de alunos construída foi " + Aluno.quantidadeDeAlunos);
	}

}
