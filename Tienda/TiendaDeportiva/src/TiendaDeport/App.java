package TiendaDeport;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Provedor provedor = new Provedor("Muelas", 1655612165, "Lina ");
        Cliente cliente = new Cliente(101326156, "Iker ");
        TipoDeProducto tipoDeProducto = new TipoDeProducto(14565486, "Zapatos de tacon", 0.19);
        Producto producto= new Producto(tipoDeProducto, 22.12, 150, provedor);
        Venta venta = new Venta(154654645, cliente, producto);
        System.out.println(venta);
    }
}
