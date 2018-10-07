package br.crud.servlet;

import br.crud.bo.UsuarioBO;
import br.crud.exception.NegocioException;
import java.io.IOException;

import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/main")
 
public class MainServlet extends HttpServlet {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//criando uma estrutura para redirecionamento
		String acao = request.getParameter("acao");
		
		String proxima = null;
		
		if("sair".equals(acao)) {
			proxima = "logout.jsp";
                        
		}else if("login".equals(acao)) {
                    try{
                        proxima = "index.jsp";
                        if(!new UsuarioBO().validarUsuario(request)) {
                            request.setAttribute("msgErro", "Usuário/Senha inválidos!");
                            proxima = "login.jsp";
                        } else {
                        }
              
                    } catch (NegocioException e){
                        request.setAttribute("msgErro", e.getMessage());
                        proxima = "login.jsp";
                    }
                    
                }else if("consultas".equals(acao)) {
			proxima = "consulta.jsp";
		}
			
		
		request.getRequestDispatcher(proxima).forward(request, response);
	}
	
}
