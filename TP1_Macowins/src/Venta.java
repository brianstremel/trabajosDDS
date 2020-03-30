class Venta {
    private ArrayList<Prenda> prendas;
    private Date fecha;
    private MetodoDePago metodoDePago;

    Venta(ArrayList<Prenda> unasPrendas, Date unaFecha, MetodoDePago unMetodo) {
        this.prendas = unasPrendas;
        this.fecha = unaFecha;
        this.metodoDePago = unMetodo;
    }

    private float precioTotalProductos() {
        return prendas.stream().map(prenda -> prenda.precioDeVenta()).sum();
    }

    public float totalVenta() {
        metodoDePago.totalVenta(precioTotalProductos());
    }

    public Date getFecha() {
        return fecha;
    }
}