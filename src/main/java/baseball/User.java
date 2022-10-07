package baseball;

import java.util.List;

public class User {
    private List<Integer> numbers;

    public List<Integer> getNumbers() {
        numbers = NumberScanner.inputNumber();
        return numbers;
    }
}
