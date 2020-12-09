package libreta_Array;

import java.util.ArrayList;

public class Libreta {
	
	//Atributos
	ArrayList<String> LibretaFacu;
	
	//Constructor
	public Libreta() {
		LibretaFacu = new ArrayList<>();
	}
	
	//Metodos
	public void agregarPersona(String pers) {
		
		//Metodo para evitar que no se agregue
		//una persona que ya esta en el grupo
		if ( ! LibretaFacu.contains(pers) ) {
		
		LibretaFacu.add(pers);
		}
	}
	
	public void listarLibreta() {
		//System.out.println("--listarLibreta() -->[LibretaFacu]");
		for(int i=0; i< LibretaFacu.size(); i++) {
			
			//le ponemos i+1 para que el primer registro sea 1 y no 0
			System.out.println((i+1) + "-->" + LibretaFacu.get(i));
		} 
	}
	
	public void posicionAremover(int pos) {
		
		//le ponemos -1 porque el usuario tiene dif numeros del registro
		pos = pos - 1;
							
		//condicional para delimitar tamaño
		if((pos >= 0) && (pos < LibretaFacu.size() )) {
			
			//Metodo para eliminar posicion
			LibretaFacu.remove(pos);
					
		}
	}		
		
	public void nombreAremover(String nom) {
			
		//Metodo para eliminar registro si es que ya esta.
			LibretaFacu.remove(nom);
	
	}	
	
	
}


