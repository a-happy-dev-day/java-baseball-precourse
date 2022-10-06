package baseball;

import java.util.List;

public class Computer {
    private List<Integer> numbers;

    public Computer() {
        numbers = RandomNumberGenerator.makeRandomNumbers();
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
