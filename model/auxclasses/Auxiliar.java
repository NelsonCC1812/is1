package model.auxclasses;

import java.util.regex.Pattern;

public class Auxiliar {

    public static double round(double num) {
        return round(num, 100);
    }

    public static double round(double num, double base) {
        return (double) Math.round(base * num) / base;
    }

    public static boolean isEmail(String email) {
        return Pattern
                .compile(
                        "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$")
                .matcher(email).find();
    }
}