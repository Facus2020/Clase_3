package clase_03_foro_1;

public class Grado extends Escuela {
	private String nom;
	private int Alum;
	
	public Grado(String nombre, String nivel, String nom, int Alum) {
		super(nombre, nivel);
		
		this.nom = nom;
		this.Alum = Alum;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getAlum() {
		return this.Alum;
	}
	
	public String toString() {
		return "NOMBRE: " + super.getNombre() +" -- " + "NIVEL: " + super.getNivel() +" -- " + "GRADO: " + this.nom +" -- " + "ALUMNOS: " + this.Alum;
	}

}
