class PrendaLiquidacion implements Prenda{
    private float precioPropio;

    PrendaNueva(float unPrecio {
        this.precioPropio = unPrecio;
    }

    public float precioDeVenta() {
        return precioPropio/2;
    }
}