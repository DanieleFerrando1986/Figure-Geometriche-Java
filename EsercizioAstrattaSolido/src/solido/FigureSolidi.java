package solido;

public class FigureSolidi {

	public static void main(String[] args) {
		Quadrato q = new Quadrato(4.2);
		Rettangolo r = new Rettangolo(8.6,3.3);
		Triangolo t = new Triangolo(9.11,2.55,14.66);
		Cerchio c = new Cerchio(7.22);
		System.out.println("Area Quadrato: " +q.area()+ " \nPerimetro Quadrato: " +q.perimetro()+ 
		" \nArea Rettangolo: " +r.area()+ " \nPerimetro Rettangolo: " +r.perimetro()+ 
		" \nArea Triangolo: " +t.area()+ " \nPerimetro Triangolo: " +t.perimetro()+
		" \nArea Cerchio: " +t.area()+ " \nPerimetro Cerchio: " +t.perimetro());
		
	}
}
