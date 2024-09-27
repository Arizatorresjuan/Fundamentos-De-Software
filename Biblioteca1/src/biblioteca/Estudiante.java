package biblioteca;

public class Estudiante {
	private String nombre;
	private long matricula;
	/**
	 * @param nombre
	 * @param matricula
	 */
	public Estudiante(String nombre, long matricula) {
		super();
		this.nombre = nombre;
		this.matricula = matricula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getMatricula() {
		return matricula;
	}
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", matricula=" + matricula + "]";
	}

	
}