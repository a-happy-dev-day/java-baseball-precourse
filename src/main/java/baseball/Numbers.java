package baseball;

import java.util.List;

import static baseball.RandomNumberGenerator.NUMBER_SIZE;

public class Numbers {
    private List<Number> numbers;

    public Numbers(List<Number> numbers) {
        if(numbers.size() != NUMBER_SIZE) {
            throw new IllegalArgumentException();
        }
        this.numbers = numbers;
    }

    public List<Number> getNumber() {
        return numbers;
    }


}
