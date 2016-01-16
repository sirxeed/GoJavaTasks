public class IllegalCharException extends RuntimeException {
    String string;
    public IllegalCharException (String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
