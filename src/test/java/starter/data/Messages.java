package starter.data;

public enum Messages {

    SUCCESS("Your form has been successfully submitted.");

    private final String messages;

    Messages(String messages) {
        this.messages = messages;
    }

    public String getMessage() {
        return messages;
    }

}
