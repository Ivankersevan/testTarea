package Supermercado;

import java.util.ArrayList;
import java.util.List;
import java.time.*;

public class Carrito {

	//atributos
	private int idCarrito;
	private LocalDate fecha;
	private LocalTime hora;
	private List <ItemCarrito> listItem;
	private Cliente cliente;
	
	//constructor
	public Carrito(int id,Cliente cliente){
		this.idCarrito = id;
		this.fecha = LocalDate.now();
		this.hora = LocalTime.now();
		this.listItem = new ArrayList <ItemCarrito>();
		this.cliente = cliente;
	}

	//metodos getter y setter
	public int getIdCarrito() {
		return idCarrito;
	}

	public void setIdCarrito(int id) {
		this.idCarrito = id;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}	

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public List<ItemCarrito> getListItem() {
		return listItem;
	}

	public void setListItem(List<ItemCarrito> listItem) {
		this.listItem = listItem;
	}
	
	public String mostrarDia() {
		return this.fecha.getDayOfMonth()+"/"+this.fecha.getMonthValue()+"/"+this.fecha.getYear();
	}
	
	public String mostrarHora() {
		return this.hora.getHour()+"-"+this.hora.getMinute()+"-"+this.hora.getSecond();
	}
	
	public String mostrarTiempo() {
		return this.mostrarDia()+" "+this.mostrarHora();
	}
	
	public Productos traerProducto(Productos producto) {
		for(int i = 0;i<this.listItem.size();i++) {
			if(this.listItem.get(i).getProducto()==producto) {
				return this.listItem.get(i).getProducto();
			}
		}
		return null;
	}
	
	public ItemCarrito traerItem(Productos producto) {
		for(int i = 0;i<this.listItem.size();i++) {
			if(this.listItem.get(i).getProducto()==producto) {
				return this.listItem.get(i);
			}
		}
		return null;
	}
	
	public void ordenarId() {
		for(int i = 0;i<this.listItem.size();i++) {
			this.listItem.get(i).setIdItem(i+1);
		}
	}
	
	public void mostrarCarrito() {
		System.out.println("\nCantidad de productos en carrito: "+this.getListItem().size());
		for(int i = 0;i<this.listItem.size();i++)
		{
			System.out.println(this.listItem.get(i).toString());
		}
	}
	
	//metodos a implementar
	public boolean agregarProducto(Productos producto,int cantidad){
		
		for(int i = 0;i<this.listItem.size();i++) {
			if(this.listItem.get(i).getProducto().equals(producto)) {
				this.listItem.get(i).setCantidad(cantidad+this.listItem.get(i).getCantidad());
				return false;
			}
		}
		
		ItemCarrito aux = new ItemCarrito(this.listItem.size()+1,producto,cantidad);
		
		this.listItem.add(aux);
				
		return true;
	}
	
	public boolean eliminarItem(Productos producto,int cantidad) throws IllegalArgumentException{
		if(this.traerProducto(producto)==null) {
			throw new IllegalArgumentException("\nNO exites el producto ingresado!!!");
		}
		
		if(cantidad<this.traerItem(producto).getCantidad())
		{
			this.traerItem(producto).setCantidad(this.traerItem(producto).getCantidad()-cantidad);
			return true;
		}else if(cantidad==this.traerItem(producto).getCantidad()) 
		{
			this.listItem.remove(this.traerItem(producto).getIdItem()-1);
			this.ordenarId();
			return true;
		}
		
		return false;
	}
	
	public float calcularSubTotal() {
		float aux = 0;
		
		for(int i = 0;i<this.listItem.size();i++) {
			aux += (this.listItem.get(i).getCantidad()*this.listItem.get(i).getProducto().getPrecio());
		}
		
		return aux;
	}
	
	public float calcularTotal() {
		float total = 0;
		
		total = this.calcularSubTotal()+((this.calcularSubTotal()/100)*21);
		
		return total;
	}
	
}
