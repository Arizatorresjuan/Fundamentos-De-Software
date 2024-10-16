package ejemplo1;

public class Rectangulo extends Figura{
	private double ancho;
	private double largo;
	public Rectangulo(double ancho, double largo) {
		super();
		this.ancho = ancho;
		this.largo = largo;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public double getLargo() {
		return largo;
	}
	public void setLargo(double largo) {
		this.largo = largo;
	}
	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		this.area = this.largo * this.ancho;
	}
	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub
		this.perimetro= 2 * this.ancho + 2 * this.largo;
	}
	
	

}
