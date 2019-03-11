
abstract public class Canino extends Animal {
	
	public void latir() {
		System.out.println("auauau");
	}
	
	@Override
	public void fazBarulho() {
		this.latir();
	}

}
