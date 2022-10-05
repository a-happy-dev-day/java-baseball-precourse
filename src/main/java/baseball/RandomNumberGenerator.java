package baseball;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RandomNumberGenerator {
    HashSet<Integer> hash = new HashSet<>();
    final int MAX = 9;
    final int MIN = 1;
    final int NUMBER_SIZE = 3;

    public Numbers requestRandomNumber() {
        while(hash.size() != NUMBER_SIZE) {
            hash.add((int) Math.floor(Math.random() * (9 - 1)) + 1);
        }
        List<Integer> list = new ArrayList<>(hash);
        ArrayList<Number> number = new ArrayList<>();

        for(int l : list) {
            number.add(new Number(l));
        }
        return new Numbers(number);
    }
}
