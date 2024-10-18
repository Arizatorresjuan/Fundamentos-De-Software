package Ejercicio;

public class Corriente extends Cuenta{
	private long sobregiro;


	public Corriente(int numeroCuenta, String titular, long sobregiro) {
		super(numeroCuenta, titular);
		this.sobregiro = sobregiro;
	}

	public long getSobregiro() {
		return sobregiro;
	}
	public void setSobregiro(long sobregiro) {
		this.sobregiro = sobregiro;
	}

	@Override
	public void deposito(long valor) {
		
		this.saldo += valor;
		
	}

	@Override
	public void retiro(long valor) {
		if(valor > this.sobregiro+this.saldo)
		{
			System.out.println("Yucas paila no se puede");
		}else{
			this.saldo=this.saldo-valor;
		}
		
		

	}
	

}
