

public class Producto {
    private String id;
    private String nombre;
    
  
	private int cantidad;
    private double precioUnitario;  
    public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}


    public Producto(String id, String nombre, int cantidad, double precioUnitario) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public double calcularValor() {
        return cantidad * precioUnitario;
    }
}
