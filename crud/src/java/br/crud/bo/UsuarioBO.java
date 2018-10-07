
package br.crud.bo;

import br.crud.dao.UsuarioDAO;
import br.crud.dto.UsuarioDTO;
import br.crud.exception.NegocioException;
import br.crud.exception.PersistenciaException;
import javax.servlet.http.HttpServletRequest;

/**
 * Classe responsável por gerenciar os métodos de negócio do usuário
 * @author jaoli
 */
public class UsuarioBO {
    
    public boolean validarUsuario(HttpServletRequest request) throws NegocioException {
        boolean isValido = true;
        try{
        String usuario = request.getParameter("login");
        String senha = request.getParameter("senha");
        
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setUsuario(usuario);
        usuarioDTO.setSenha(senha);
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        isValido = usuarioDAO.validarUsuario(usuarioDTO);
       } catch (PersistenciaException e) {
           e.printStackTrace();
           throw new NegocioException(e);
       }
        return isValido;
       
    }
    
}
