package TiendaDeport;

public class Provedor {
    private String productoOfrecido;
    private int identificacion;
    private String nombre;

    /**
     * @param productoOfrecido
     * @param identificacion
     * @param nombre
     */

    public Provedor(String productoOfrecido, int identificacion, String nombre) {
        this.productoOfrecido = productoOfrecido;
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    public String getProductoOfrecido() {
        return productoOfrecido;
    }

    public void setProductoOfrecido(String productoOfrecido) {
        this.productoOfrecido = productoOfrecido;
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
        return "Provedor producto ofrecido =" + productoOfrecido + ", identificacion =" + identificacion + ", nombre ="
                + nombre;
    }
    
    

    
    
    
}
