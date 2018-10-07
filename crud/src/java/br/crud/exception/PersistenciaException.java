/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.crud.exception;

/**
 * Classe responsável por encapsular todas as exceções de banco de dados 
 * @author jaoli
 */
public class PersistenciaException extends Exception {

    private static final long serialVersionUID = 1L;
    
    public PersistenciaException(String erro) {
        super(erro);
    }
    
    public PersistenciaException(Exception e) {
        super(e);
    }
    
    public PersistenciaException(String erro, Exception e) {
        super(erro, e);
    }
    
}
