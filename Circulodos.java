
public class Circulodos {

	public double x;
	
	Circulodos(){
		this(177406);
	}
	public Circulodos(double y) {
		this.x = y;
	}
	public double calculaCircunferencia() {
		return x*2;
	}
	public double calculaArea() {
		return Math.PI * Math.pow(x, 2);
	}
	public double calculaPerimetro() {
		return 4 * Math.PI * x;
	}
	public void cambiaRadio(double y) {
		x = y;
	}
	
}