package personasAuto;

public class Auto {
	//Atributos
	String matricula;
	String modelo;
	String marca;
	String color;
	double precio;
	
	//Constructores
	public Auto() {}

	public Auto(String matricula, String modelo, String marca, String color, double precio) {
		super();
		this.matricula = matricula;
		this.modelo = modelo;
		this.marca = marca;
		this.color = color;
		this.precio = precio;
	}
	
	//toString
	
	@Override
	public String toString() {
		return "Auto [matricula=" + matricula + ", modelo=" + modelo + ", marca=" + marca + ", color=" + color
				+ ", precio=" + precio + "]";
	}
	
	//Encapsulamineto
	
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
