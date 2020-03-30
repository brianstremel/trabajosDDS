class MetodoDePagoTarjeta implements MetodoDePago {
    int cantidadDeCuotas;
    float coeficiente;

    MetodoDePagoTarjeta(int unasCuotas, float unCoeficiente) {
        this.cantidadDeCuotas = unasCuotas;
        this.coeficiente = unCoeficiente;
    }

    float totalVenta(float unMonto) {
        return unMonto + cantidadDeCuotas * unMonto * 0.01 * coeficiente;
    }
}