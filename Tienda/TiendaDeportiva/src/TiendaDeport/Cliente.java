package TiendaDeport;

public class Cliente {
    private int identificacion;
    private String nombre;
    
    /**
     * @param identificacion
     * @param nombre
     */

    public Cliente(int identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Identificacion cliente =" + identificacion + ", nombre =" + nombre;
    }
    
    
    
}
