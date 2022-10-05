package baseball;

import java.util.ArrayList;
import java.util.HashSet;

import static baseball.RandomNumberGenerator.NUMBER_SIZE;

public class Check {

    public Numbers checkNumber(String numbers) {
        String[] array = numbers.split("");
        ArrayList<Number> number = new ArrayList<>();
        checkSize(array);
        checkRedundancy(array);
        checkDigit(array);
        for(String arr : array) {
            number.add(new Number(Integer.parseInt(arr)));
        }
        return new Numbers(number);
    }

    private void checkRedundancy(String[] array) {
        HashSet<String> hash = new HashSet<>();
        for (String arr : array) {
            hash.add(arr);
        }
        if(hash.size() != NUMBER_SIZE) {
            throw new IllegalArgumentException();
        }
    }

    private void checkSize(String[] array) {
        if(array.length != NUMBER_SIZE) {
            throw new IllegalArgumentException();
        }
    }

    private void checkDigit(String[] array) {
        for(String arr : array) {
            if(!(Integer.parseInt(arr) >= 0 && Integer.parseInt(arr) <= 9)) {
                throw new IllegalArgumentException();
            }
        }
    }
}
