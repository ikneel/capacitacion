package firstProject;

public class principal {
	//Funcion main es el punto de arranque de cualquier aplicacion Java
	public static void main(String[] args) {
		//Instancia de un objeto con su constructor vacio
		Auto auto1 = new Auto();
		System.out.println(auto1);
		
		//Ingresar informacion a un objeto
		auto1.matricula = "rtx-12";
		auto1.modelo = "Mazda 3";
		auto1.marca = "Mazda";
		auto1.color = "Rojo";
		auto1.numPuertas = 4;
		auto1.precio = 350000; 
		System.out.println(auto1);
		
		//Ingresar informacion usando setters
		auto1.setMatricula("tgh-674");
		auto1.setModelo("Mazda 2");
		auto1.setMarca("Mazda");
		auto1.setColor("Rojo");
		auto1.setNumPuertas(4);
		auto1.setPrecio(150000);
		System.out.println(auto1);
		
		//Obtener informacion usando getters
		
		//Instanciar e inicializar un objeto con un constructor con todos los parametros
		
		
		//Editar el atributo de un objeto

	}
}
