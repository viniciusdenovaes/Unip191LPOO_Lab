
public abstract class Felino extends Animal{
	
	public void miar() {
		System.out.println("miau");
	}
	
	@Override
	public void fazBarulho() {
		this.miar();
	}

}
