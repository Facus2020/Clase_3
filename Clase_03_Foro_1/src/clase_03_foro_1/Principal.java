package clase_03_foro_1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		//hacemos casting ahora de grado
		Grado GradoDos = (Grado) miEscuela;
		System.out.println(GradoDos);

	}

}
