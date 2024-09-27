package TiendaDeport;

public class Detalle {
    private Producto producto;
    private int cantidadDetalle;
    
    /**
     * @param producto
     * @param cantidadDetalle
     */

    public Detalle(Producto producto, int cantidadDetalle) {
        this.producto = producto;
        this.cantidadDetalle = cantidadDetalle;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidadDetalle() {
        return cantidadDetalle;
    }

    public void setCantidadDetalle(int cantidadDetalle) {
        this.cantidadDetalle = cantidadDetalle;
    }

    @Override
    public String toString() {
        return "Detalle producto =" + producto + ", cantidad =" + cantidadDetalle;
    }
    
    
}
