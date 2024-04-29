package ejercicio1;

public class Alumno {
	String numCuenta;
	String nombre;
	String apellidoPaterno;
	String apellidoMaterno;
	String carrera;
	int numSemestre;
	
	public Alumno() {}

	public Alumno(String numCuenta, String nombre, String apellidoPaterno, String apellidoMaterno, String carrera,
			int numSemestre) {
		super();
		this.numCuenta = numCuenta;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.carrera = carrera;
		this.numSemestre = numSemestre;
	}

	@Override
	public String toString() {
		return "Alumno [numCuenta=" + numCuenta + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno
				+ ", apellidoMaterno=" + apellidoMaterno + ", carrera=" + carrera + ", numSemestre=" + numSemestre
				+ "]";
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getNumSemestre() {
		return numSemestre;
	}

	public void setNumSemestre(int numSemestre) {
		this.numSemestre = numSemestre;
	}
	
	 
}
