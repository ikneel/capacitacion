package firstProject;

public class Auto {
	String matricula;
	String modelo;
	String marca;
	String color;
	int numPuertas;
	double precio;
	
	public Auto() {}

	public Auto(String matricula, String modelo, String marca, String color, int numPuertas, double precio) {
		super();
		this.matricula = matricula;
		this.modelo = modelo;
		this.marca = marca;
		this.color = color;
		this.numPuertas = numPuertas;
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Auto [matricula=" + matricula + ", modelo=" + modelo + ", marca=" + marca + ", color=" + color
				+ ", numPuertas=" + numPuertas + ", precio=" + precio + "]";
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
