package ejercicio1;

public class principal {
	public static void main(String[] args) {
		//Instancia de objeto alumno
		Alumno alumno1 = new Alumno();
		
		//Ingreso de informacion al objeto alumno
		alumno1.numCuenta = "3261657869";
		alumno1.nombre = "Jose";
		alumno1.apellidoPaterno = "Sanchez";
		alumno1.apellidoMaterno = "Marin";
		alumno1.carrera = "Ingenieria en Computacion";
		alumno1.numSemestre = 8;
		System.out.println(alumno1);
		
		//Ingreso de informacion con setters
		alumno1.setNumCuenta("3162654678");
		alumno1.setNombre("Luis");
		alumno1.setApellidoPaterno("Aguilar");
		alumno1.setApellidoMaterno("Vargas");
		alumno1.setCarrera("Ingenieria Mecanica");
		alumno1.setNumSemestre(9);
		System.out.println(alumno1);
		
		//Obtener informacion con getters
		
		System.out.println("Informacion alumno 2:");
		System.out.println("Numero de cuenta: " + alumno1.getNumCuenta());
		System.out.println("Nombre: " + alumno1.getNombre());
		System.out.println("Apellido Paterno: " + alumno1.getApellidoPaterno());
		System.out.println("Apellido Materno: " + alumno1.getApellidoMaterno());
		System.out.println("Carrera: " + alumno1.getCarrera());
		System.out.println("Numero de Semestre: " + alumno1.getNumCuenta());
		
		//Instanciar e inicializar objeto contodos los parametros
		
		Alumno alumno2 = new Alumno("3162679653", "Enrique", "Naves", "Gutierrez", "Ingenieria Quimica", 5);
		System.out.println(alumno2);
		
		//Editar un atributo del objeto
		
		alumno2.setNumSemestre(7);
		System.out.println(alumno2);
	}
}
