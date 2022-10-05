package baseball;

import java.util.Scanner;

public class User {
    private Scanner scn = new Scanner(System.in);
    private Check check = new Check();

    public String restartOrExit() {
        return scn.next();
    }

    public Numbers requestNumber() {
        return check.checkNumber(scn.next());
    }
}
