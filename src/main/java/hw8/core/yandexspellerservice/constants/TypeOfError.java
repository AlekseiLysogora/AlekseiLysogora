package hw8.core.yandexspellerservice.constants;

public enum TypeOfError {
    ERROR_CAPITALIZATION(3),
    ERROR_DIGITS(512);

    private int number;

    public String getNumber() {
        return String.valueOf(number);
    }

    TypeOfError(int errorNumber) {
        number = errorNumber;
    }
}