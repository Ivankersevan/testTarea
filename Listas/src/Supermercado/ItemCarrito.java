package Supermercado;

public class ItemCarrito {
	
	//atributos
	private int idItem;
	private Productos producto;
	private int cantidad;

	//constructor
	public ItemCarrito(int id,Productos mercaderia,int cant) {
		this.idItem = id;
		this.producto = mercaderia;
		this.cantidad = cant;
	}
	
	//metodos getter y setter
	public int getIdItem() {
		return idItem;
	}
	
	public void setIdItem(int id) {
		this.idItem = id; 
	}

	public Productos getProducto() {
		return producto;
	}

	public void setProducto(Productos producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public String toString() {
		return "id: "+this.getIdItem()+" Producto: "+this.getProducto().getProducto()+" Cantidad: "+this.getCantidad();
	}
	
}
