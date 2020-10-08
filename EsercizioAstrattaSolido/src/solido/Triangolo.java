package solido;

public class Triangolo extends Solido {
	
	private double lato, base, altezza;
	
	public Triangolo(double lato, double base, double altezza) {
		this.lato=lato;
		this.base=base;
		this.altezza=altezza;
	}
	
	public double getLato() {
		return this.lato;
	}
	
	public double getBase() {
		return this.base;
	}
	
	public double getAltezza() {
		return this.altezza;
	}
	
	public void setBase(double nuovaBase) {
		this.base=nuovaBase;
	}
	
	public void setAltezza(double nuovaAltezza) {
		this.altezza=nuovaAltezza;
	}
	
	public void setLato(double nuovoLato) {
		this.lato=nuovoLato;
	}

	@Override
	public double area() {
		return (base*altezza)/2;
	}

	@Override
	public double perimetro() {
		return lato+lato+lato;
	}
}
