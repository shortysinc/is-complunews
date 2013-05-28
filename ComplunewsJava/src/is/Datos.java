package is;



public class Datos {
	private int edad;
	private String nombre;
	private String apellidos;
	private String fechaNac;
	private String descripcion;
	private String sexo;
	

	public Datos(int edad, String nombre, String apellidos, String fechaNac, String descripcion, String sexo)
	{
		this.edad=edad;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.fechaNac=fechaNac;
		this.descripcion=descripcion;
		this.sexo=sexo;
	}


	public int getEdad() 
	{
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


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getFechaNac() {
		return fechaNac;
	}


	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
