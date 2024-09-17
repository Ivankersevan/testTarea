package Supermercado;

public class Cliente {
	
	//atributos
	private int idCliente;
	private String cliente;
	private long dni;
	private String direccion;
	
	//constructor
	public Cliente(int id,String cliente,long dni,String direccion) {
		this.idCliente = id;
		this.cliente = cliente;
		this.dni = dni;
		this.direccion = direccion;
	}

	//metodos setter y getter
	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	

}
