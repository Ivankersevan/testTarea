package Incaa;

public class Pelicula {

	//atributos
	private int idPelicula;
	private String pelicula;
	private Genero genero;
	
	//constructor
	public Pelicula(int id,String nombre,Genero genero){
		this.idPelicula = id;
		this.pelicula = nombre;
		this.genero = genero;
	}

	//los metodos getter y setter
	public int getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getPelicula() {
		return pelicula;
	}

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	} 
	
	public Genero getGenero(){
		return genero;
	}
	
	public void setGenero(Genero generos){
		this.genero = generos;
	}
	
	@Override
	public String toString(){
		return "id: "+this.getIdPelicula()+" Peli: "+this.getPelicula()+" Genero: "+this.genero.toString();
	}
	
	
	
	
	
}
