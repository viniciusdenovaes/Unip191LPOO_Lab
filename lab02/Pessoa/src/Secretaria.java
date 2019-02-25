
public class Secretaria {
	
	public static void imprimeRelatorio(Pessoa pessoa) {
		pessoa.relatorio();
	}
	
	public static void fazPagamento(Funcionario funcionario) {
		System.out.println("Pagando " + funcionario.getPagamento() + " ao funcionario " + funcionario.getNome());
		System.out.println();
	}

}
