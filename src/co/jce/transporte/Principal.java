package co.jce.transporte;

import java.sql.SQLException;

import co.jce.basededatos.ConexionBD;

public class Principal {

	//-> Agregamos una excepción de tipo SQL al método para poder capturar los
	//   errores que puedan ocasionarse en su ejecución (throws SQLException)
	public static void main(String[] args) throws SQLException {

		//-> Probamos la conexión
		ConexionBD bd = new ConexionBD();
		bd .conectar();		//: Realiza la conexión.

	}

}
