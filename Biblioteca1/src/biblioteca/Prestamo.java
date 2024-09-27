package biblioteca;


import java.time.LocalDate;

public class Prestamo {
	 private LocalDate fechaPrestamo;
	 private Libro libro;
	 private LocalDate fechaEntrega;
	 private Estudiante estudiante;
	 private int diasprestamo;
	 private int diasMora;
	 private int multa;
	/**
	 * @param libro
	 * @param estudiante
	 * @param diasprestamo
	 */
	public Prestamo(Libro libro, Estudiante estudiante, int diasprestamo) {
		super();
		this.libro = libro;
		this.estudiante = estudiante;
		this.diasprestamo = diasprestamo;
	}
	@Override
	public String toString() {
		return "Prestamo [fechaPrestamo=" + fechaPrestamo + ", libro=" + libro + ", fechaEntrega=" + fechaEntrega
				+ ", estudiante=" + estudiante + ", diasprestamo=" + diasprestamo + ", diasMora=" + diasMora
				+ ", multa=" + multa + "]";
	}
	 
	 

}
