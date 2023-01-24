public class Cuadradodos {

	public double x;
	
	Cuadradodos(){
		this(177406);
	}
	public Cuadradodos(double y){
		this.x = y;
	}
	public double calculaPerimetro() {
		return x+x+x+x;
	}
	public double calculaArea() {
		return x*x;
	}
	public double calculaDiagonal() {
		return Math.sqrt(Math.pow(x, 2)*2);
	}
	public void cambiaValor(double y) {
		x = y;
	}
}