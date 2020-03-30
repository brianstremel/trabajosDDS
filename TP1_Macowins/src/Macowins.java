class Macowins {
  private ArrayList<Venta> ventas = new ArrayList<Venta>();

  private void realizarVenta(ArrayList<Prenda> unasPrendas, MetodoDePago unMetodo) {
    ventas.add(new Venta(unasPrendas, today(), unMetodo));
  }

  private float gananciasDeDia(Date unaFecha) {
    return ventas.stream().filter(unaVenta -> unaVenta.getFecha() == unaFecha).map(unaVenta -> unaVenta.totalVenta()).sum();
  }
}
