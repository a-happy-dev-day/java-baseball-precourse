package baseball;

import java.util.List;

public class User {
    private List<Integer> numbers;

    public User() {
        numbers = NumberScanner.inputNumber();
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
