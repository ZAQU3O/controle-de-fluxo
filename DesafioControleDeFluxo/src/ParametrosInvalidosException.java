public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException() {
        super("O valor inicial não pode ser maior que o valor final.");
    }
}
