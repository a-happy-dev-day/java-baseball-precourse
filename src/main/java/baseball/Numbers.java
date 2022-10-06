package baseball;

import java.util.HashSet;
import java.util.List;
import static baseball.RandomNumberGenerator.NUMBER_SIZE;

public class Numbers {
    private List<Number> numbers;

    public Numbers(List<Number> numbers) {
        HashSet<String> duplicationCheck = new HashSet<>();
        if(numbers.size() != NUMBER_SIZE) {
            throw new IllegalArgumentException();
        }
        for(Number n : numbers) {
            duplicationCheck.add(n.getNumber());
        }
        if(duplicationCheck.size() != numbers.size()) {
            throw new IllegalArgumentException();
        }
        this.numbers = numbers;
    }

    public List<Number> getNumbers() {
        return numbers;
    }


}
