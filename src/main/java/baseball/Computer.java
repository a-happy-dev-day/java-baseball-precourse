package baseball;

import java.util.List;

public class Computer {
    private List<Integer> numbers;

    public List<Integer> getNumbers() {
        numbers = RandomNumberGenerator.makeRandomNumbers();
        return numbers;
    }
}
