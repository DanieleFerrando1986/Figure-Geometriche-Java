package solido;

public class Rettangolo extends Solido {
	
	private double base, altezza;
	
	public Rettangolo(double base, double altezza) {
		this.base=base;
		this.altezza=altezza;
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
	
	@Override
	public double area() {
		return base*altezza;
	}

	@Override
	public double perimetro() {
		return 2*(base+altezza);
	}
}
