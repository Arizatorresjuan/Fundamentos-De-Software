package TiendaDeport;

public class Producto {
    private TipoDeProducto tipoDeProducto;
    private Double precioDeVenta;
    private int cantidad;
    private Provedor provedor;

    /**
     * @param tipoDeProducto
     * @param precioDeVenta
     * @param cantidad
     * @param provedor
     */
    public Producto(TipoDeProducto tipoDeProducto, Double precioDeVenta, int cantidad, Provedor provedor) {
        this.tipoDeProducto = tipoDeProducto;
        this.precioDeVenta = precioDeVenta;
        this.cantidad = cantidad;
        this.provedor = provedor;
    }

    public TipoDeProducto getTipoDeProducto() {
        return tipoDeProducto;
    }

    public void setTipoDeProducto(TipoDeProducto tipoDeProducto) {
        this.tipoDeProducto = tipoDeProducto;
    }

    public Double getPrecioDeVenta() {
        return precioDeVenta;
    }

    public void setPrecioDeVenta(Double precioDeVenta) {
        this.precioDeVenta = precioDeVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Provedor getProvedor() {
        return provedor;
    }

    public void setProvedor(Provedor provedor) {
        this.provedor = provedor;
    }
    
    @Override
    public String toString() {
        return "Producto =" + tipoDeProducto + ", precio de venta =" + precioDeVenta + ", cantidad ="
                + cantidad + ", provedor =" + provedor;
    }
    
}
