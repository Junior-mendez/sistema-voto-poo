package clasePadre;

public class Persona{
	protected int departamento,dni,edad,provincia;
	protected String nombre,apellido,sexo;
	
	public Persona(int dni, String nombre, String apellido, int edad, String sexo ) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.edad = edad;
		
	}
	public Persona( ) {

		
	}


	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	

}
