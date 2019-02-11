
public class TesteAluno {
	public static void main(String[] args) {
	
		Aluno aluno01 = new Aluno();
		aluno01.ra = "R0d4";
		aluno01.nome = "Copernico";
		aluno01.boletim = new Boletim();
		aluno01.boletim.notaNP1 = new Nota();
		aluno01.boletim.notaNP1.valor = 0.0;
		aluno01.boletim.notaNP2 = new Nota();
		aluno01.boletim.notaNP2.valor = 10.0;
		aluno01.relatorio();
	
		Aluno aluno02 = new Aluno();
		aluno02.ra = "emc2";
		aluno02.nome = "Einstein";
		aluno02.boletim = new Boletim();
		aluno02.boletim.notaNP1 = new Nota();
		aluno02.boletim.notaNP1.valor = 7.0;
		aluno02.boletim.notaNP2 = new Nota();
		aluno02.boletim.notaNP2.valor = 8.0;
		aluno02.relatorio();
	
	}

}
