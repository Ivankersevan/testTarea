package Supermercado;

import java.util.List;
import java.util.ArrayList;

public class Supermercado {

	//atributos
	private List <Productos> listProducto;
	private List <Cliente> listCliente;
	private List <Carrito> listCarrito;
	
	//constructor
	public Supermercado() {
		this.listProducto = new ArrayList <Productos>();
		this.listCliente = new ArrayList <Cliente>();
		this.listCarrito = new ArrayList <Carrito>();
	}
	
	//metodos getter y setter
	public List<Productos> getListProducto() {
		return listProducto;
	}
	
	public List<Cliente> getListCliente() {
		return listCliente;
	}

	public List<Carrito> getListCarrito() {
		return listCarrito;
	}

	public void ordenarId() {
		for(int i = 0;i<this.listProducto.size();i++) {
			this.listProducto.get(i).setId(i+1);
		}
	}
	
	public boolean agregarCliente(String nombre,long dni,String direccion) {
		for(int i = 0;i<this.listCliente.size();i++) {
			if(this.listCliente.get(i).getDni()==dni) {
				throw new IllegalArgumentException("\nYa exites el cliente ingresado!!!");
				}
		}
		Cliente aux = new Cliente(this.listCliente.size()+1,nombre,dni,direccion);
		
		this.listCliente.add(aux);
				
		return true;
	}
	
	public boolean agregarCarrito(Cliente cliente) {
		for(int i = 0;i<this.listCarrito.size();i++) {
			if(this.listCliente.get(i).getDni()==cliente.getDni()) {
				throw new IllegalArgumentException("\nYa exites el cliente ingresado para el carrito!!!");
				}
		}
		Carrito aux = new Carrito(this.listCarrito.size()+1,cliente);
		
		this.listCarrito.add(aux);
				
		return true;
	}
	
	//metodos a implementar
	public void mostrarGondola() {
		System.out.println("\nCantidad de productos en gondola: "+this.getListProducto().size());
		for(int i = 0;i<this.listProducto.size();i++)
		{
			System.out.println(this.listProducto.get(i).toString());
		}
	}
	
	public boolean agregarProducto(String producto,float precio)throws IllegalArgumentException {
		
		for(int i = 0;i<this.listProducto.size();i++) {
			if(this.listProducto.get(i).getProducto().equals(producto)) {
				throw new IllegalArgumentException("\nYa exites el producto ingresado!!!");
				}
		}
		Productos aux = new Productos(this.listProducto.size()+1,producto,precio);
		
		this.listProducto.add(aux);
				
		return true;
	}
	
	public Productos traerProducto(int idProducto) {
		for(int i = 0;i<this.listProducto.size();i++) {
			if(this.listProducto.get(i).getId()==idProducto) {
				return this.listProducto.get(i);
			}
		}
		return null;
	}
	
	public boolean verificar(Productos producto) {
		for(int i = 0;i<this.listCarrito.size();i++) {
			for(int j = 0;j<this.listCarrito.get(i).getListItem().size();j++) {
				if(this.listCarrito.get(i).getListItem().get(j).getProducto().getProducto().equals(producto.getProducto())) {
					return true;
				}
			}
			
		}
		
		return false;
	}
	
	public boolean modificarProducto(int idProducto, String producto, float precio)throws IllegalArgumentException {
		
			if(this.traerProducto(idProducto)==null) {
				throw new IllegalArgumentException("\nNO exites el id ingresado!!!");
			}
			
			this.listProducto.get(idProducto-1).setProducto(producto);
			this.listProducto.get(idProducto-1).setPrecio(precio);
			
		return true;
	}

	public boolean eliminarProducto(int id) throws IllegalArgumentException{
		if(this.traerProducto(id)==null) {
			throw new IllegalArgumentException("\nNO exites el ID ingresado!!!");
		}
		
		if(this.verificar(this.traerProducto(id))==true)
		{	
			throw new IllegalArgumentException("\nEl producto ingresado esta en un carrito!!!");
		}
		
		this.listProducto.remove(id-1);
		this.ordenarId();
		
		return true;
	}


}
