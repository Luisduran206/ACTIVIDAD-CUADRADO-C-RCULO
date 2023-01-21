// LUIS DURÁN FLORES - 177406
public class Circulo {

	public double medidaRadio;
	public int ID = 177406;
	public double x;
	
	public Circulo(){
		medidaRadio = 177406;
	}
	public double obtenerCircunferencia() {
		return medidaRadio * 2;
	}
	public double obtenerArea() {
		return Math.PI * Math.pow(medidaRadio, 2);
	}
	public double obtenerPerimetro() {
		return 4* Math.PI * medidaRadio;
	}
	public void cambiaLongitud (double x) {
		medidaRadio = x;
	}
}
