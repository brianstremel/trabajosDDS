class PrendaPromocion implements Prenda{
    private float precioPropio;
    private float descuento;

    PrendaNueva(float unPrecio, float unDescuento) {
        this.precioPropio = unPrecio;
        this.descuento = unDescuento;
    }

    public float precioDeVenta() {
        return precioPropio - descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }
}