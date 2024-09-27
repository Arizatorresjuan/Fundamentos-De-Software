package TiendaDeport;

import java.util.ArrayList;
import java.time.LocalDate;

public class Venta {
    private int nroConsecutivo;
    private LocalDate fechaVenta;
    private Cliente cliente;
    private Producto producto;
    private ArrayList<Detalle> listaDetalle;

    public Venta(int nroConsecutivo, Cliente cliente, Producto producto) {
        this.nroConsecutivo = nroConsecutivo;
        this.cliente = cliente;
        this.producto = producto;
    }

    public int getNroConsecutivo() {
        return nroConsecutivo;
    }

    public void setNroConsecutivo(int nroConsecutivo) {
        this.nroConsecutivo = nroConsecutivo;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Venta numero de venta =" + nroConsecutivo + ", fecha de la venta =" + fechaVenta + ", cliente =" + cliente
                + ", producto =" + producto;
    }

    public void adicionarDetalle(Detalle detalle){
        listaDetalle.add(detalle);
    }
    
    
}
