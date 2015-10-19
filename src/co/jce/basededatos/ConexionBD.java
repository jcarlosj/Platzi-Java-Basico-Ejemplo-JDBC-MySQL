package co.jce.basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

	//-> Atributos (Constantes)
	private final String URL 	       = "jdbc:mysql://localhost:3306/",
			             BASE_DE_DATOS = "db-platzi-transporte",
			             USUARIO       = "usuario-platzi",
			             CLAVE         = "Q2VPdCBDBamd2xSN";
	
	//-> Atributos (Especiales)
	private Connection conexion = null;	//: Recomendado inizializar en null.
	
	//-> Agregamos una excepción de tipo SQL al método para poder capturar los
		//   errores que puedan ocasionarse en su ejecución (throws SQLException)
	public Connection conectar() throws SQLException {  
		                                                 
		//-> Usamos una excepción por si se genera algún error de conexión
		try {
			//-> Carga el "package" del Driver de JDBC para MySQL.
			Class .forName( "com.mysql.jdbc.Driver" ); 
			
			//-> Realiza la conexión con MySQL pasandole los 3 parámetros requeridos
			//   el primer parámetro es la URL concatenada al nombre de la Base de datos
			this .conexion = DriverManager .getConnection( URL + BASE_DE_DATOS, USUARIO, CLAVE );	
			                                                       
			//-> Validamos si la conexión se realizó
			if( this .conexion != null ) {
				System .out .println( "La conexión a la base de datos se realizó exitosamente" );
			}
			else {
				System .out .println( "La conexión a la base de datos falló" );
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e .printStackTrace();	//: Imprime la excepción (ERROR).
		}
		finally {
			return this .conexion;		//: Si se realiza exitosamente devuelve la conexión
		}
	}
	
}
