package ar.edu.unju.fi.poo.ecommerce.manager;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.poo.ecommerce.model.Producto;

public class ManagerProducto{
	private List<Producto> productos = new ArrayList<>();
	
	public void inicializarProductos () {
		Producto producto1 = new Producto("75731","Gafas", 20999);
		Producto producto2 = new Producto("48324","Pantalon", 35999);
		Producto producto3 = new Producto("38714","Gorra", 14999);
		Producto producto4 = new Producto("48143","Remera", 45999);
		Producto producto5 = new Producto("12742","Conjunto", 72999);
		
		productos.add(producto1);
		productos.add(producto2);
		productos.add(producto3);
		productos.add(producto4);
		productos.add(producto5);
	}
	
	public Producto buscarPorCodigo (String codigo) {
		for (Producto producto : productos) {
			if (producto.getCodigo().equals(codigo)) {
				return producto;
			}
		}
		return null;
	}
	
	public Producto buscarPorNombre (String nombre) {
		for (Producto producto : productos) {
			if (producto.getNombre().equals(nombre)) {
				return producto;
			}
		}
		return null;
	}
	
	public void agregarProducto(Producto producto) {
		//if (buscarPorNombre(producto.getNombre())!=null && buscarPorCodigo(producto.getCodigo())!=null){
		if (productos.contains(producto)) {
			System.out.println("El producto ya está registrado.");
		}
		else {
			productos.add(producto);
		}
	}
	
	public List<Producto> listarProductos () {
		return productos;
	}
	
	public void mostrarProducto (Producto producto) {
		producto.toString(); 
	}
	 
	public void eliminarProducto (Producto producto) {
		productos.remove(producto);
	}
	
}