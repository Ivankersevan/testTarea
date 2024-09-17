package Incaa;

public class TestPelicula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Genero genero1 = new Genero(0,"Accion");
		Genero genero2 = new Genero(1,"Suspenso");
		Genero genero3 = new Genero(2,"Terror");
		Genero genero4 = new Genero(3,"Romance");
		Genero genero5 = new Genero(4,"Comedia");
		
		Incaa cine = new Incaa();
		cine.agregarPelicula("AltaPeli",genero1);
		cine.agregarPelicula("AltaPeli 2",genero2);
		cine.agregarPelicula("AltaPeli",genero3);
		cine.agregarPelicula("Terminator",genero4);
		cine.agregarPelicula("Terminator",genero5);
		cine.agregarPelicula("Messi",genero3);
		cine.buscar("AltaPeli");
		cine.modificarPelicula(1,"AltaPeli 3");
		cine.mostrar();
		cine.eliminarPelicula(1);
		cine.mostrar();
		cine.agregarPelicula("Volvere",genero1);
		cine.mostrar();
		cine.buscarGenero(genero1);
		
		
		//syso 
		
		
		
	}

}
