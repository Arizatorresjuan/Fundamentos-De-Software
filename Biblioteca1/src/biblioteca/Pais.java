package biblioteca;

public class Pais {
	private String nombre;
	private long codigo;
	/**
	 * @param nombre
	 * @param codigo
	 */
	public Pais(String nombre, long codigo) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + ", codigo=" + codigo + "]";
	}
	

}
