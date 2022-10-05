package baseball;

import java.util.Scanner;

public class User {
    Scanner scn = new Scanner(System.in);
    Check check;
    public User(){}


    public String restartOrExit() throws IllegalStateException{

        return scn.next();
    }

    public Numbers requestNumber() {
        return check.checkNumber(scn.next());
    }
}
