package cl.desafiolatam;

import java.util.Scanner;

import cl.desafiolatam.exceptions.MenuInvalidoException;

public class Menu {

	private Scanner sc;
	private static Menu menu;

	private Menu() {
		super();
		this.sc = new Scanner(System.in);
	}

	private void imprimirMenuPrincipal() {
		System.out.println("1. Listar Productos");
		System.out.println("2. Agregar Producto");
		System.out.println("3. Exportar Datos");
		System.out.println("4. Salir");
	}

	public static Menu getInstance() {
		if (menu == null) {
			menu = new Menu();
		}

		return menu;
	}

	public int getOpcionMenuPrincipal() throws MenuInvalidoException {
		this.imprimirMenuPrincipal();
		int opcion = 0;

		try {
			opcion = Integer.parseInt(sc.next());

			if (opcion > 4 || opcion < 1) {
				throw new MenuInvalidoException();
			}

		} catch (NumberFormatException e) {
			throw new MenuInvalidoException();
		}

		return opcion;
	}
}
