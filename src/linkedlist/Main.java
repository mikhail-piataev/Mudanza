package linkedlist;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
//		CRUD 
//		Create
//		Read
//		Update
//		Delete
		
		LinkedList<Producto> productos = new LinkedList<Producto>();
		Producto nuevo = new Producto("Coca cola",100,10);
		productos.add(nuevo);
		productos.add(new Producto("Pespi",200,20));
		String[] opciones = {
				"Guardar", "Ver", "Seleccionar", "Actualizar", "Salir"
		};
		int opcionElegida=JOptionPane.showOptionDialog(null, "Elegi opcion", null, 0, 0, null, opciones, opciones[0]);
		switch (opcionElegida) {
		case 0: 
			JOptionPane.showMessageDialog(null, "Producto " + opcionElegida + ": " + productos.get(opcionElegida));
			break;
			
		}
		
		boolean salir=false;
		do {
			String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del producto o \"no\" para salir");
			if (!nombre.equalsIgnoreCase("no")) {
				double precio = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el precio del producto"));
				int cantidad = (Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad del producto")));
				productos.add(new Producto(nombre, precio, cantidad));
		
			} else {
				JOptionPane.showMessageDialog(null, "Saliendo");
				salir = true;
			}
		} while (!salir);
		

		//JOptionPane.showMessageDialog(null, nuevo);
		for (int i=0; i<productos.size(); i++) {
			JOptionPane.showMessageDialog(null, "Producto " + i + ": " + productos.get(i));
		}
		
	}

}
