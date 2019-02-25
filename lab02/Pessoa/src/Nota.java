
public class Nota {
	
	private double valor;
	
	public Nota(double aValor) {
		if     (aValor > 10.0) this.valor = 10.0;
		else if(aValor <  0.0) this.valor =  0.0;
		else                   this.valor = aValor;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	@Override
	public String toString() {
		String result = "";
		result += this.valor;
		result += " pontos";
		return result;
	}

}
