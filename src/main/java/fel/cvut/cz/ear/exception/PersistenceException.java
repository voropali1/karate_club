package fel.cvut.cz.ear.exception;

public class PersistenceException extends EarException {

    public PersistenceException(String message, Throwable cause) {
        super(message, cause);
    }

    public PersistenceException(Throwable cause) {
        super(cause);
    }
}

