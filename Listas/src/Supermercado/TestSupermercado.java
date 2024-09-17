package Supermercado;

public class TestSupermercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supermercado family = new Supermercado();
		
		try{
			family.agregarProducto("Harina", 20);
			family.agregarProducto("Pan", 30);
			family.agregarProducto("Arroz", 10);
			family.agregarProducto("Miel", 15);
			family.agregarProducto("Coca-Cola", 32);
			family.agregarProducto("Agua", 12);
			family.modificarProducto(3, "Leche", 50);
			family.agregarCliente("Bebecito", 41854724, "25 de Mayo");
			family.agregarCarrito(family.getListCliente().get(0));
			family.getListCarrito().get(0).agregarProducto(family.getListProducto().get(5),5);
			family.getListCarrito().get(0).agregarProducto(family.getListProducto().get(5),3);
			family.getListCarrito().get(0).agregarProducto(family.getListProducto().get(3),4);
			family.getListCarrito().get(0).agregarProducto(family.getListProducto().get(2),7);
			family.getListCarrito().get(0).mostrarCarrito();
			family.getListCarrito().get(0).eliminarItem(family.getListProducto().get(3), 4);
			family.mostrarGondola();
			family.eliminarProducto(6);
			
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		
		family.mostrarGondola();
		family.getListCarrito().get(0).mostrarCarrito();
		System.out.println("Subtotal: $"+family.getListCarrito().get(0).calcularSubTotal());
		System.out.println("Total: $"+family.getListCarrito().get(0).calcularTotal());
			
	}
}
