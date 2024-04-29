package ejercicio_2_CRUD;

public class Alumno {
	String matricula;
	String Nombre;
	String apellido;
	String genero;
	String colonia;
	int edad;
	double promedio;
	
	//Constructores
	
	public Alumno() {}

	public Alumno(String matricula, String nombre, String apellido, String genero, String colonia, int edad,
			double promedio) {
		super();
		this.matricula = matricula;
		Nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.colonia = colonia;
		this.edad = edad;
		this.promedio = promedio;
	}
	//toString
	
	@Override
	public String toString() {
		return "Alumno [matricula=" + matricula + ", Nombre=" + Nombre + ", apellido=" + apellido + ", genero=" + genero
				+ ", colonia=" + colonia + ", edad=" + edad + ", promedio=" + promedio + "]";
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	
	//Encapsulamiento
	
	
}
