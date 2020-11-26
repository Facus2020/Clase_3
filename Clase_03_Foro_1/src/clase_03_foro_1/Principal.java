package clase_03_foro_1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean C;
		
		//Instancio Escuela
		Escuela miEscuela = new Escuela("Graciela Ferrer de Moretti","Primario");
		
		System.out.println(miEscuela);
		
		//Instancio Grado
		Grado miGrado = new Grado("Virginia Correa","Primario","Séptimo Año",15);
		
		System.out.println(miGrado);
		
		//Hacemos casting
		//a miGrado lo voy a parsear en un objeto de la clase Escuela
		Escuela Escuelita = (Escuela) miGrado;		
		System.out.println(Escuelita);
						
		//instancio dos objetos iguales de la clase Escuela
		Escuela Escuela_A = new Escuela("Jose Fuchs", "Primario");
		Escuela Escuela_B = new Escuela("Jose Fuchs", "Primario");
		
		C = Escuela_A.equals(Escuela_B);
		System.out.println(C);

	}

}
