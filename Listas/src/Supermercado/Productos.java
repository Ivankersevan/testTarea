package Supermercado;

public class Productos {
	
	//atributos
	private int id;
	private String producto;
	private float precio;
	
	//contructor
	public Productos(int iden,String nombre,float dinero) {
	this.id = iden;
	this.producto = nombre;
	this.precio = dinero;
	}

	//metodos setter y getter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public String toString() {
		return "id: "+this.getId()+" producto: "+this.getProducto()+" precio: $"+this.getPrecio();
	}

}
