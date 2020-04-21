class EstadoPrendaPromocion implements EstadoPrenda {
    private float descuento;

    EstadoPrendaPromocion(float unDescuento) {
        self.descuento = unDescuento;
    }

    public float precioFinal(float precioBase) {
        return precioBase - descuento;
    }
}