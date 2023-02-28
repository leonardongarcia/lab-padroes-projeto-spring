package one.dio.gof.exception;

public class ClientNotFoundException extends RuntimeException{
    public ClientNotFoundException(Long id) {
        super(String.format("O cliente com id %d não foi encontrado.", id));
    }
}
