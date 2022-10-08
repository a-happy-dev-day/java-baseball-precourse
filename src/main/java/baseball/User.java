package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class User {

    public String inputRestartOrExit() {
        return Console.readLine();
    }

    public Numbers createNumbers() {
        List<Number> number = new ArrayList<>();
        for (String s : Console.readLine().split("")) {
            number.add(new Number(s));
        }
        return new Numbers(number);
    }
}
