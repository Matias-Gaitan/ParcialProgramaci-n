//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto(234, "Papel de cocina", 1800, 20, "MarcaRandom");
        ProductoElectronico producto2 = new ProductoElectronico(277, "Tablet", 30000, 15, "MarcaRandom2", 131, 30, false, 4, "Conexion1" );
        ProductoAlimenticio producto3 = new ProductoAlimenticio();
        ProductoLimpieza producto4 = new ProductoLimpieza(444, "Lavandina", 2000, 30, "MarcaRandom4", "Piso", 16, "FraganciaRandom", 1.5, "Diluir en agua y pasar con una mopa por el piso");

        producto3.setNombre("Manzana");

        producto1.mostrarInfo();
        System.out.println();
        System.out.println("-----------------------");
        producto2.mostrarInfo();
        System.out.println();
        System.out.println("-----------------------");
        producto3.mostrarInfo();
        System.out.println();
        System.out.println("-----------------------");
        producto4.mostrarInfo();
        System.out.println();
        System.out.println("-----------------------");


        double garantiaExtendida = producto2.calcularGarantiaExtendida(producto2.getPrecio());
        System.out.println("Con la garantía extendida, el producto "+producto2.getNombre()+" tiene un precio de $"+garantiaExtendida);

        System.out.println("La dilución del producto "+producto4.getNombre()+" es de "+producto4.calcularDilusion(producto4.getLitros(), producto4.getConcentracion()));
    }
}