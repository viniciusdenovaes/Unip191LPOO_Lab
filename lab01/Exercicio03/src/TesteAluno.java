
public class TesteAluno {
	public static void main(String[] args) {
	
		Aluno aluno01 = new Aluno();
		aluno01.ra = "R0d4";
		aluno01.nome = "Copernico";
		aluno01.notaNP1 = new Nota();
		aluno01.notaNP1.valor = 0.0;
		aluno01.notaNP2 = new Nota();
		aluno01.notaNP2.valor = 10.0;
		aluno01.relatorio();
	
		Aluno aluno02 = new Aluno();
		aluno02.ra = "emc2";
		aluno02.nome = "Einstein";
		aluno02.notaNP1 = new Nota();
		aluno02.notaNP1.valor = 7.0;
		aluno02.notaNP2 = new Nota();
		aluno02.notaNP2.valor = 8.0;
		aluno02.relatorio();
	
	}

}
