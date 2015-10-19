package co.jce.conductor;

public class Conductor {

	//-> Atributos (Comunes)
		private int id;
		private String nombre,
		               tipoLicencia;
		
		//-> Constructor
		public Conductor(int id, String nombre, String tipoLicencia) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.tipoLicencia = tipoLicencia;
		}

		//-> Getters & Setters
		public int getId() {
			return id;
		}
		
		public void setId( int id ) {
			this .id = id;
		}
		
		public String getNombre() {
			return nombre;
		}
		
		public void setNombre( String nombre ) {
			this .nombre = nombre;
		}
		
		public String getTipoLicencia() {
			return tipoLicencia;
		}
		
		public void setTipoLicencia( String tipoLicencia ) {
			this .tipoLicencia = tipoLicencia;
		}
		
		
	
}
