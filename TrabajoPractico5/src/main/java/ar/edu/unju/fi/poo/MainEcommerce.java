package ar.edu.unju.fi.poo;

import ar.edu.unju.fi.poo.ecommerce.manager.ManagerProducto;
import ar.edu.unju.fi.poo.ecommerce.model.Producto;
import ar.edu.unju.fi.poo.ecommerce.model.Usuario;

public class MainEcommerce {
	public static void main(String[] args) {
		ManagerProducto managerProducto = new ManagerProducto();
		
		// Instanciar a un usuario con su correspondiente carrito de compras.		
		Usuario usuario1 = new Usuario("001", "Fabiana Barrionuevo", "fabi@gmail.com");
		
		//Buscar productos y agregarlos al carrito. 
		managerProducto.inicializarProductos();
		String codigo1 = "75731";
		String nombre2 = "Conjunto";
		
		Producto producto1 = managerProducto.buscarPorCodigo(codigo1);
		Producto producto2 = managerProducto.buscarPorNombre(nombre2);
		Producto producto3 = managerProducto.buscarPorNombre("Gorra");
		
		usuario1.agregarAlCarrito(producto1, 5);
		usuario1.agregarAlCarrito(producto2, 8);
		usuario1.agregarAlCarrito(producto3, 7);
		
		
		//Mostrar el importe total.
		System.out.println("Total: "+usuario1.verTotalCarrito()+"\n");
		
		//Mostrar el carrito.
		usuario1.mostrarCarrito();
		
		//Buscar un producto y removerlo del carrito. 
		Producto aRemover = managerProducto.buscarPorNombre("Gorra");
		usuario1.removerDelCarrito(aRemover);
		
		//Mostrar el importe total. 
		System.out.println("Total: "+usuario1.verTotalCarrito());
		usuario1.mostrarCarrito();
				
		//Vaciar el carrito. 
		System.out.println();
		usuario1.getCarrito().vaciar();
		usuario1.mostrarCarrito();
	}
}
