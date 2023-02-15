public class Articulo {

     int codigo;
    String descripcion  = " ";
    double precioCompra;
    double precioVenta;
    int unidadesStock;


    public Articulo(int codigo, String descripcion, double precioCompra, double precioVenta, int unidadesStock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.unidadesStock = unidadesStock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getUnidadesStock() {
        return unidadesStock;
    }

    public void setUnidadesStock(int unidadesStock) {
        this.unidadesStock = unidadesStock;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "codigo: " + codigo +
                ", descripcion: '" + descripcion + '\'' +
                ", precio Compra: " + precioCompra +
                ", precio Venta: " + precioVenta +
                ", unidades en Stock: " + unidadesStock +
                '}';
    }
}
