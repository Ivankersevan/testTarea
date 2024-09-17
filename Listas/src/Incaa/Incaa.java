package Incaa;

import java.util.List;
import java.util.ArrayList;
//import java.time.*; Practicar este paquete para la Clase 4


public class Incaa {

	//atributos
	private List <Pelicula> catalogo;
	
	//constructor
	public Incaa(){
		this.catalogo = new ArrayList <Pelicula>();
	}

	//los metodos getter y setter
	public List<Pelicula> getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(List<Pelicula> catalogo) {
		this.catalogo = catalogo;
	}
	
	public void mostrar(){
		System.out.println("\n------Mostrar------");
		for(int i = 0;i<this.catalogo.size();i++){
			System.out.println(this.catalogo.get(i).toString());
		}
	}
	
	public void buscar(String pelicula){
		System.out.println("\n---Resultado de busqueda---");
		for(Pelicula p : this.traerPelicula(pelicula)) {
			System.out.println(p.toString());
		}
	}
	
	public void buscarGenero(Genero genero){
		System.out.println("\n---Resultado de busqueda---");
		for(Pelicula p : this.traerPelicula(genero)) {
			System.out.println(p.toString());
		}
	}
	
	public void actualizar(){
		for(int i = 0;i<this.catalogo.size();i++){
			this.catalogo.get(i).setIdPelicula(i);
		}
	}
	
	//metodos a implementar: 
	public boolean agregarPelicula(String pelicula,Genero genero){
	
		int contador = this.catalogo.size();
		Pelicula peli = new Pelicula(contador,pelicula,genero);
		/*
		for(Iterator <Pelicula> iter = this.catalogo.iterator();iter.hasNext();){
			if(iter.equals(pelicula)){
				return false;
			}
			contador++;
		}
		peli.setIdPelicula(contador);
		this.catalogo.add(peli);
		
		return true;
		*/
		for(int i = 0;i<this.catalogo.size();i++){
			if(this.catalogo.get(i).getPelicula().equals(pelicula)){
				System.out.println("\nError: Ya existe la pelicula: '"+pelicula+"'\n");
				return false;
			}
		}
		
		this.catalogo.add(peli);
		
		return true;
	}
	
	public Pelicula traerPelicula(int id){
		
		for(int i = 0;i<this.catalogo.size();i++){
			if(this.catalogo.get(i).getIdPelicula()==id)return this.catalogo.get(i);
		}
		
		return null;
	}
	
	public List <Pelicula> traerPelicula(String partePelicula){
		
		List <Pelicula> aux = new ArrayList <Pelicula>();
		
		for(int i = 0;i<this.catalogo.size();i++){
			if(this.catalogo.get(i).getPelicula().contains(partePelicula)){
				aux.add(this.catalogo.get(i));
			}
		}
		
		return aux;
	}
	
	public List <Pelicula> traerPelicula(Genero genero){
		List <Pelicula> aux = new ArrayList <Pelicula>();
		
		for(int i = 0;i<this.catalogo.size();i++){
			if(this.catalogo.get(i).getGenero().getGenero().equals(genero.getGenero())){
				aux.add(this.catalogo.get(i));
			}
		}
		
		return aux;
	}

	public void modificarPelicula(int idPelicula, String pelicula){
		for(int i = 0;i<this.catalogo.size();i++){
			if(this.catalogo.get(i).getIdPelicula()==idPelicula)this.catalogo.get(i).setPelicula(pelicula);;
		}
	}
	
	public boolean eliminarPelicula(int idPelicula){
		boolean aux = false;
			for(int i = 0;i<this.catalogo.size();i++){
				if(this.catalogo.get(i).getIdPelicula()==idPelicula){
					this.catalogo.remove(i);
					aux=true;
				}
			}
			this.actualizar();
		return aux;
	}
	
}
