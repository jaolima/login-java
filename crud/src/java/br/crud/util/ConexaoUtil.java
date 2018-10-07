package br.crud.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConexaoUtil {
	/*
	 * Classe de Conexão
	 */
	
	private static ResourceBundle configDB = ResourceBundle.getBundle(Constantes.CONEXAO_BD_PROPERTIES);
	
	public static Connection getConexao() throws ClassNotFoundException, SQLException{
		//Cadastrando o Driver do Banco de dados 
		//Class = gerencia todas as  classes internas do JAVA 
		
		Class.forName(configDB.getString(Constantes.CONEXAO_BD_DRIVER));
		return DriverManager.getConnection(configDB.getString(Constantes.CONEXAO_BD_URL),
		configDB.getString(Constantes.CONEXAO_BD_USER),
		configDB.getString(Constantes.CONEXAO_BD_PASSWORD));
		
		
		//DriverManager gerenciadora de drivers do JDBC
		//É onde se passa o url, user, pass
		//return DriverManager.getConnection("");
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(getConexao());
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();  
		}
	}

}
