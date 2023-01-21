// LUIS DURÁN FLORES - 177406
public class Cuadrado {
	
	public double medidaLado;
	public int ID = 177406;
	public double x;
	
	public Cuadrado(){
		medidaLado = ID;
	}
	public double obtenerPerimetro() {
		return medidaLado+medidaLado+medidaLado+medidaLado;
	}
	public double obtenerArea() {
		return medidaLado*medidaLado;
	}
	public double diagonal() {
		return Math.sqrt(Math.pow(medidaLado, 2)*2);
	}
	public void cambiaLongitud(double x) {
		medidaLado = x;
	}
}