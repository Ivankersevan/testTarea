package Incaa;

public class Genero {

	//atributos
	private int idGenero;
	private String genero;
	
	//constructor
	public Genero(int id,String nombre){
		this.idGenero = id;
		this.genero = nombre;
	}
	
	//los metodos getter y setter
		public int getIdGenero() {
			return idGenero;
		}

		public void setIdGenero(int idGen) {
			this.idGenero = idGen;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String nombre) {
			this.genero = nombre;
		} 
		
		@Override
		public String toString(){
			return this.getGenero();
		}
	
}
