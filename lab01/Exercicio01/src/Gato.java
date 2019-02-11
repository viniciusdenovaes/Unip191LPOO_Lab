
public class Gato {
	
	public String nome;
	public int idade;
	public double peso;
	
	public void miar() {
		if(this.idade<3) {
			System.out.print("miau miau miau ");
		}
		else if(this.idade>=3 && this.idade<=8) {
			System.out.print("miaaau ");
		}
		else if(this.idade>8) {
			System.out.print("Grrr ");
		}
		System.out.println("meu nome é " + this.nome + ", eu tenho " + this.peso + " quilos");
		System.out.println();
	}

}
