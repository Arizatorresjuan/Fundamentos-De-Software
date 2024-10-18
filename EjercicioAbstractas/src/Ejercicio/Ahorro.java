package Ejercicio;

public class Ahorro extends Cuenta {
	private long interes;

	public Ahorro(int numeroCuenta,String titular) {
		super(numeroCuenta, titular);
		this.interes = 3;
	}
	
	

	public long getInteres() {
		return interes;
	}



	public void setInteres(long interes) {
		this.interes = interes;
	}



	@Override
	public void deposito(long valor) {
		
		this.saldo+=this.saldo*(interes/100);
		this.saldo += valor;
		
	}

	@Override
	public void retiro(long valor) {
		if(valor > this.saldo)
		{
			System.out.println("Yucas paila no se puede");
		}else{
			this.saldo=this.saldo-valor;
		}

	}
}
