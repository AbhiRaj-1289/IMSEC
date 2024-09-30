class ExceptionCheck {
    public ExceptionCheck(String message) {
        System.out.println("Caught the custom exception: " + message);
    }
}

class Main {
    public static void main(String[] args) {
        try {
            throw new ExceptionCheck("This is a custom exception.");
        } catch (ExceptionCheck e) {
            // Custom exception is caught here
        }
    }
}
