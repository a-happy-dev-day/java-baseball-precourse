package baseball;

import java.util.HashSet;
import java.util.List;

public class BallNumbers {
    private List<BallNumber> numbers;
    private static final int NUMBER_SIZE = 3;

    public BallNumbers(List<BallNumber> numbers) {
        HashSet<String> duplicationCheck = new HashSet<>();

        if (numbers.size() != NUMBER_SIZE) {
            throw new IllegalArgumentException();
        }
        for (BallNumber n : numbers) {
            duplicationCheck.add(n.getNumber());
        }
        if (duplicationCheck.size() != numbers.size()) {
            throw new IllegalArgumentException();
        }
        this.numbers = numbers;
    }

    public List<BallNumber> getNumbers() {
        return numbers;
    }


}
