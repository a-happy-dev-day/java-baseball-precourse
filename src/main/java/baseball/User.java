package baseball;

import java.util.*;

public class User {
    private Scanner scn = new Scanner(System.in);


    public String restartOrExit() {
        return scn.next();
    }

    public Numbers requestNumber() {
        List<Number> number = new ArrayList<>();
        for(String s : scn.next().split("")) {
            number.add(new Number(Integer.parseInt(s)));
        }
        return new Numbers(number);
    }
}
