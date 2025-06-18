public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private int stock;
    private String marca;

    //CONSTRUCTORES
    public Producto(){
        this.codigo = 0;
        this.nombre = "Desconocido";
        this.precio= 0;
        this.stock = 0;
        this.marca = "Desconocida";
    }

    public Producto(int codigo, String nombre, double precio, int stock, String marca){
        setCodigo(codigo);
        setNombre(nombre);
        setPrecio(precio);
        setStock(stock);
        setMarca(marca);

    }

    //GETTERS

    public int getCodigo(){
        return this.codigo;
    }
    public String getNombre(){
        return this.nombre;
    }
    public double getPrecio(){
        return this.precio;
    }
    public int getStock(){
        return this.stock;
    }
    public String getMarca(){
        return this.marca;
    }

    //SETTERS

    public void setCodigo(int codigo){
        this.codigo= codigo;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public void mostrarInfo(){
        System.out.println("Código del producto :"+getCodigo());
        System.out.println("Nombre del producto: "+getNombre());
        System.out.println("Precio del producto: $"+getPrecio());
        System.out.println("Stock del producto: "+getStock());
        System.out.println("Marca del producto: "+getMarca());
    }
}
