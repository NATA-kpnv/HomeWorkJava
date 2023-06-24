package homeWork6.CustomException;

public class CreateFileException extends Exception {
    public CreateFileException() {
        super();
    }

    public CreateFileException(String message) {
        super(message);
    }

    public CreateFileException(String message, Throwable cause) {
        super(message, cause);
    }

    public CreateFileException(Throwable cause) {
        super(cause);
    }
}