package libreta_Array;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Leer = new Scanner(System.in);
		
		Libreta miLibretita = new Libreta();
 		
		miLibretita.agregarPersona("Daniela");
		//miLibretita.listarLibreta();
		miLibretita.agregarPersona("Osvaldo");
		//miLibretita.listarLibreta();
		miLibretita.agregarPersona("Juampi");
		//miLibretita.listarLibreta();
		miLibretita.agregarPersona("Emir");
		//miLibretita.listarLibreta();
		miLibretita.agregarPersona("Matias");
		//miLibretita.listarLibreta();
		 
		//miLibretita.listarLibreta();
		
		int opciones;
		
		do {
			System.out.println("_________________MENU PRINCIPAL_________________");
			System.out.println("                                                ");
			System.out.println("          Elija una opción numérica:            ");
			System.out.println("                                                ");
						
			System.out.println("    Opción 1. ¿Qué posición desea eliminar?     ");
			System.out.println("                                                ");
			System.out.println("    Opción 2. ¿Qué nombre desea eliminar?       ");
			System.out.println("                                                ");
			System.out.println("    Opción 3. Mostrar la libreta?               ");	
			System.out.println("                                                ");
			System.out.println("    Opción 4. Salida                            ");
			System.out.println("                                                ");
			System.out.println("________________________________________________");
			opciones = Leer.nextInt();
									
			if (opciones == 1) {
				
				System.out.println("Escriba la posición que quiere eliminar: ");
				int posicionaeliminar = Leer.nextInt();
				
				miLibretita.posicionAremover(posicionaeliminar);
				System.out.println("                                                ");
				miLibretita.listarLibreta();
			
			} 
			
			if (opciones == 2) {
				
				System.out.println("Escriba el nombre que quiere eliminar: ");
				String nombreaeliminar = Leer.next();
				
				miLibretita.nombreAremover(nombreaeliminar);
				System.out.println("                                                ");
				miLibretita.listarLibreta();
			}
			
			if (opciones == 3) {
				
				System.out.println("La lista completa quedará asi: ");
				System.out.println("                                                ");
				miLibretita.listarLibreta();
			}					
			
			if (opciones == 4) {
				
				System.out.println("Hasta luegos - Vuelva Prontos -");
				break;
				
			}
		} while (opciones != 0);
				
		
			
	}		

}

