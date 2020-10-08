package solido;

public class Quadrato extends Solido {
	
	private double lato;
	
	public Quadrato(double lato) {
		this.lato=lato;
	}
	
	public double getLato() {
		return this.lato;
	}
	
	public void setLato(double nuovoLato) {
		this.lato=nuovoLato;
	}

	@Override
	public double area() {
		return lato*lato;
	}

	@Override
	public double perimetro() {
		return lato*4;
	}
}
