
package br.crud.dto;

//permite trafegar entre camadas e ser serializavel.
import java.io.Serializable;


public class UsuarioDTO implements Serializable {
    
    private Integer id_usuario;
    
    private String usuario;
    
    private String senha;

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
