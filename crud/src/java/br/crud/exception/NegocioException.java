
package br.crud.exception;

/**
 * Classe responsável por gerenciar as exceções da camada de negócio
 * @author jaoli
 */
public class NegocioException extends Exception {
    public NegocioException(Exception e) {
        super(e);
    }
}
