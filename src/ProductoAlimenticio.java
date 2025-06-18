public class ProductoAlimenticio extends Producto{
    private String fechaVencimiento;
    private boolean esOrganico;
    private double peso;
    private String tipoAlimento;
    private String procedencia;

    //CONSTRUCTORES

    public ProductoAlimenticio(){
        super();
        this.fechaVencimiento ="Desconocida";
        this.esOrganico = false;
        this.peso = 0;
        this.tipoAlimento = "Desconocido";
        this.procedencia = "Desconocida";

    }
    public ProductoAlimenticio(int codigo, String nombre, double precio, int stock, String marca,
                               String fechaVencimiento, boolean esOrganico, double peso,
                               String tipoAlimento, String procedencia){
        super(codigo, nombre, precio, stock, marca);
        setFechaVencimiento(fechaVencimiento);
        setEsOrganico(esOrganico);
        setPeso(peso);
        setTipoAlimento(tipoAlimento);
        setProcedencia(procedencia);
    }

    //GETTERS

    public String getFechaVencimiento(){
        return this.fechaVencimiento;
    }
    public boolean getEsOrganico(){
        return this.esOrganico;
    }
    public double getPeso(){
        return this.peso;
    }
    public String getTipoAlimento(){
        return tipoAlimento;
    }
    public String getProcedencia(){
        return procedencia;
    }

    //SETTERS

    public void setFechaVencimiento(String fechaVencimiento){
        this.fechaVencimiento = fechaVencimiento;
    }
    public void setEsOrganico(boolean esOrganico){
        this.esOrganico = esOrganico;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public void setTipoAlimento(String tipoAlimento){
        this.tipoAlimento = tipoAlimento;
    }
    public void setProcedencia(String procedencia){
        this.procedencia = procedencia;
    }

    @Override public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Fecha de vencimiento: "+getFechaVencimiento());
        System.out.println("El producto es orgánico: "+getEsOrganico());
        System.out.println("Peso del produto: "+getPeso());
        System.out.println("Tipo de elimento: "+getTipoAlimento());
        System.out.println("Procedencia: "+getProcedencia());
    }
}
