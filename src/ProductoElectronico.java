public class ProductoElectronico extends Producto{
    private double voltaje;
    private double consumoEnergia;
    private boolean esSmart;
    private double tamañoPantalla;
    private String tipoConexion;

    //CONSTRUCTORES

    public ProductoElectronico(){
        super();
        this.voltaje = 0;
        this.consumoEnergia = 0;
        this.esSmart = false;
        this.tamañoPantalla = 0;
        this.tipoConexion = "Desconocida";
    }

    public ProductoElectronico(int codigo, String nombre, double precio,
                               int stock, String marca, double voltaje, double consumoEnergia,
                               boolean esSmart, double tamañoPantalla, String tipoConexion){
        super(codigo, nombre, precio, stock, marca);
        setVoltaje(voltaje);
        setConsumoEnergia(consumoEnergia);
        setEsSmart(esSmart);
        setTamañoPantalla(tamañoPantalla);
        setTipoConexion(tipoConexion);
    }

    //GETTERS

    public double getVoltaje(){
        return this.voltaje;
    }
    public double getConsumoEnergia(){
        return this.consumoEnergia;
    }
    public boolean getEsSmart(){
        return this.esSmart;
    }
    public double getTamañoPantalla(){
        return this.tamañoPantalla;
    }
    public String getTipoConexion(){
        return this.tipoConexion;
    }
    //SETTERS

    public void setVoltaje(double voltaje){
        this.voltaje = voltaje;
    }
    public void setConsumoEnergia(double consumoEnergia){
        this.consumoEnergia = consumoEnergia;
    }
    public void setEsSmart(boolean esSmart){
        this.esSmart = esSmart;
    }
    public void setTamañoPantalla(double tamañoPantalla){
        this.tamañoPantalla = tamañoPantalla;
    }
    public void setTipoConexion(String tipoConexion){
        this.tipoConexion = tipoConexion;
    }


    @Override public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Voltaje del producto: "+getVoltaje());
        System.out.println("Consumo de energia: "+getConsumoEnergia());
        System.out.println("El producto es Smart: "+getEsSmart());
        System.out.println("Tamaño de pantalla: "+getTamañoPantalla());
        System.out.println("Tipo de conexión: "+getTipoConexion());
    }
    public double calcularGarantiaExtendida(double precio){
        return precio*1.4;
    }
}




