public class ProductoLimpieza extends Producto{
    private String tipoSuperficie;
    private double concentracion;
    private String fragancia;
    private double litros;
    private String modoUso;

    //CONSTRUCTORES

    public ProductoLimpieza(){
        super();
        this.tipoSuperficie = "Desconocida";
        this.concentracion = 0;
        this.fragancia="Desconocida";
        this.litros =0;
        this.modoUso = "Desconocido";
    }
    public ProductoLimpieza(int codigo, String nombre, double precio, int stock, String marca,
                            String tipoSuperficie, double concentracion, String fragancia,
                            double litros, String modoUso){
        super(codigo, nombre, precio, stock, marca);
        setTipoSuperficie(tipoSuperficie);
        setConcentracion(concentracion);
        setFragancia(fragancia);
        setLitros(litros);
        setModoUso(modoUso);
    }


    //GETTERS

    public String getTipoSuperficie(){
        return this.tipoSuperficie;
    }
    public double getConcentracion(){
        return concentracion;
    }
    public String getFragancia(){
        return this.fragancia;
    }
    public double getLitros(){
        return this.litros;
    }
    public String getModoUso(){
        return this.modoUso;
    }

    //SETTERS

    public void setTipoSuperficie(String tipoSuperficie){
        this.tipoSuperficie = tipoSuperficie;
    }
    public void setConcentracion(double concentracion){
        this.concentracion = concentracion;
    }
    public void setFragancia(String fragancia){
        this.fragancia = fragancia;
    }
    public void setLitros(double litros){
        this.litros = litros;
    }
    public void setModoUso(String modoUso){
        this.modoUso = modoUso;
    }

    @Override public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo de superficie: "+getTipoSuperficie());
        System.out.println("Concentración: "+getConcentracion());
        System.out.println("Fragancia: "+getFragancia());
        System.out.println("Litros : "+getLitros());
        System.out.println("Modo de uso: "+getModoUso());
    }

    public double calcularDilusion(double litros, double concentracion){
        double dilucionXlitro;
        dilucionXlitro = litros / concentracion;
        return dilucionXlitro;
    }
}

