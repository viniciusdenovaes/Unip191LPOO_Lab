
public class Boletim {
	
	private Nota notaNP1;
	private Nota notaNP2;
	
	public Nota getNotaNP1() {
		return notaNP1;
	}
	public Nota getNotaNP2() {
		return notaNP2;
	}
	public void setNotaNP1(Nota nota) {
		this.notaNP1 = nota;
	}
	public void setNotaNP2(Nota nota) {
		this.notaNP2 = nota;
	}
	public void setNotaNP1(double nota) {
		this.notaNP1 = new Nota(nota);
	}
	public void setNotaNP2(double nota) {
		this.notaNP2 = new Nota(nota);
	}
	
	public double getMedia() {
		return (notaNP1.getValor() + notaNP2.getValor()) / 2.0;
	}

}
