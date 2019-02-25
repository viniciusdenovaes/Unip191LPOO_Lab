
public class Funcionario extends Pessoa{
	
	private double salario;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double aSalario) {
		this.salario = aSalario;
	}
	public double getPagamento() {
		return this.salario;
	}
	
	@Override
	public void relatorio() {
		System.out.println("Classe Funcionario");
		System.out.println("Id: " + this.getId());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Salario Base: " + this.getSalario());
		System.out.println("Pagamento: " + this.getPagamento());
		System.out.println();
		
	}


}
