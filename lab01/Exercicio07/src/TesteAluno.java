
public class TesteAluno {
	public static void main(String[] args) {
	
		Aluno aluno01 = new Aluno("R0d4", "Copernico");
		aluno01.setNotaNP1(-5.0);
		aluno01.setNotaNP2(11.0);
		aluno01.relatorio();
	
		Aluno aluno02 = new Aluno("emc2", "Einstein");
		aluno02.setNotaNP1(7.0);
		aluno02.setNotaNP2(8.0);
		aluno02.relatorio();
		
		Aluno.relatorioDaClasse();
	
	}

}
