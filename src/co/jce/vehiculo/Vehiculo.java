package co.jce.vehiculo;

public class Vehiculo {

	//-> Atributos (Comunes)
	private int id;
	private String matricula,
	               marca,
	               modelo,
	               anio;
	
	//-> Constructor
	public Vehiculo( String matricula, String marca, String modelo ) {
		super();
		this .matricula = matricula;
		this .marca = marca;
		this .modelo = modelo;
	}
	
	//-> Getters & Setters
	public int getId() {
		return id;
	}
	
	public void setId( int id ) {
		this .id = id;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula( String matricula ) {
		this .matricula = matricula;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca( String marca ) {
		this .marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo( String modelo ) {
		this .modelo = modelo;
	}
	
	public String getAnio() {
		return anio;
	}
	
	public void setAnio( String anio ) {
		this .anio = anio;
	}
	
}
