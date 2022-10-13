package baseball;

public class Number {
    private String number;

    public Number(String number) {
        if (!number.chars().allMatch(Character::isDigit)) {
            throw new IllegalArgumentException();
        }
        int num = Integer.parseInt(number);
        if (num < 1 || num > 9) {
            throw new IllegalArgumentException();
        }
        this.number = number;
    }

    public Number(int number) {
        this(String.valueOf(number));
    }

    public String getNumber() {
        return number;
    }
}
