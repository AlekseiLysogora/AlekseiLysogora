package hw8.core.constants;

public enum TypeOfError {
    ERROR_DIGITS(2),
    ERROR_CAPITALIZATION(512);

    private int number;

    public String getNumber() {
        return String.valueOf(number);
    }

    TypeOfError(int errorNumber) {
        number = errorNumber;
    }
}