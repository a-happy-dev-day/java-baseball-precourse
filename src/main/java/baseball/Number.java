package baseball;

public class Number {
    private int number;

    public Number(int number) {
        if(number < 1 || number > 9) {
            throw new IllegalArgumentException();
        }
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
