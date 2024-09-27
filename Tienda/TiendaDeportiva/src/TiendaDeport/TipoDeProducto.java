package TiendaDeport;

public class TipoDeProducto {
    private int codigoProducto;
    private String descripccion;
    private Double porcentajeIva;
    
    public TipoDeProducto(int codigoProducto, String descripccion, Double porcentajeIva) {
        this.codigoProducto = codigoProducto;
        this.descripccion = descripccion;
        this.porcentajeIva = porcentajeIva;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripccion() {
        return descripccion;
    }

    public void setDescripccion(String descripccion) {
        this.descripccion = descripccion;
    }

    public Double getPorcentajeIva() {
        return porcentajeIva;
    }

    public void setPorcentajeIva(Double porcentajeIva) {
        this.porcentajeIva = porcentajeIva;
    }

    @Override
    public String toString() {
        return " Codigo del producto=" + codigoProducto + ", descripccion =" + descripccion
                + ", porcentaje de IVA =" + porcentajeIva;
    }
    

}
