
public class Boletim {
	
	Nota notaNP1;
	Nota notaNP2;
	
	public void setNotaNP1(double aValor) {
		this.notaNP1 = new Nota(aValor);
	}
	public void setNotaNP2(double aValor) {
		this.notaNP2 = new Nota(aValor);
	}
	public double getNotaNP1() {
		return this.notaNP1.getValor();
	}
	public double getNotaNP2() {
		return this.notaNP2.getValor();
	}
	

}
