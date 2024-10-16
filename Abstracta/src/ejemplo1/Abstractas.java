package ejemplo1;

public class Abstractas java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Circulo circulo1 =new Circulo(120);
		
		circulo1.calcularArea();
		circulo1.calcularPerimetro();
		
		System.out.println("Area del Circulo "+circulo1.getArea());
		System.out.println("Perimetro del Circulo "+circulo1.getPerimetro());
	}

}
