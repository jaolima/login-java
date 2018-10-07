package br.crud.dao;

import br.crud.dto.UsuarioDTO;
import br.crud.exception.PersistenciaException;
import br.crud.util.ConexaoUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
	/*
            método para autenticar o usuário 
            obviamente é necessario conectar com o BD
            Fazer a consulta e retornar se valida ou não (booleano)
        */
	public boolean validarUsuario(UsuarioDTO usuarioDTO) throws  PersistenciaException {
		try {
                //1° passo para fazer a consulta: conectar com o banco de dados 
		Connection conexao = ConexaoUtil.getConexao(); 
		
		//2° passo = Criar a String sql para fazer a consulta
                //sql.append = utilizada para colar pedaços na string
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM tb_usuario ");
		sql.append(" WHERE usuario = ? AND senha = ?");
               
		//PreparedStatement = estabelece uma comunicação com o banco de dados 
		PreparedStatement statement = conexao.prepareStatement(sql.toString());
		statement.setString(1, usuarioDTO.getUsuario());
		statement.setString(2, usuarioDTO.getSenha());
		
                //resultSet = guarda o conjunto de resultados que vieram da consulta 
		ResultSet resultSet = statement.executeQuery();
		
                 
//                while(resultSet.next()) {
//                        System.out.println("ID:" + resultSet.getInt("id_usuario"));
//                        System.out.println("Usuário:" + resultSet.getString("usuario"));
//                        System.out.println("senha:" + resultSet.getString("senha"));
//                }
                return resultSet.next();
		}catch (ClassNotFoundException | SQLException e) {
                    e.printStackTrace();
			throw new PersistenciaException(e);
		}
	}
      
}
