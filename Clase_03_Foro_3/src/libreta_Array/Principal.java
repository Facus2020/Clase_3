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
			System.out.println("          Elija una opci�n num�rica:            ");
			System.out.println("                                                ");
						
			System.out.println("    Opci�n 1. �Qu� posici�n desea eliminar?     ");
			System.out.println("                                                ");
			System.out.println("    Opci�n 2. �Qu� nombre desea eliminar?       ");
			System.out.println("                                                ");
			System.out.println("    Opci�n 3. Mostrar la libreta?               ");	
			System.out.println("                                                ");
			System.out.println("    Opci�n 4. Salida                            ");
			System.out.println("                                                ");
			System.out.println("________________________________________________");
			opciones = Leer.nextInt();
									
			if (opciones == 1) {
				
				System.out.println("Escriba la posici�n que quiere eliminar: ");
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
				
				System.out.println("La lista completa quedar� asi: ");
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

