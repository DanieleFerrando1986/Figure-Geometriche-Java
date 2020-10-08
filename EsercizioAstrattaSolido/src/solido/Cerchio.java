package solido;

public class Cerchio extends Solido {
	
	private double raggio;
	
	public double getRaggio() {
		return this.raggio;
	}
	
	public void setRaggio(double nuovoRaggio) {
		this.raggio=nuovoRaggio;
	}
	
	public Cerchio(double raggio) {
		this.raggio=raggio;
	}

	@Override
	public double area() {
		return raggio*raggio*Math.PI;
	}

	@Override
	public double perimetro() {
		return 2*Math.PI*raggio;
	}
}
