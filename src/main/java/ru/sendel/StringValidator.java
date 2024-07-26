package ru.sendel;

public class StringValidator {

    private static final String regex = "\"\\d+\"";

    public static boolean isValid(String str) {
        if(str.isEmpty()){
            return false;
        }

        var elements = str.split(";");

        for (var element : elements) {
            if(element.isEmpty()){
                continue;
            }

            if(!element.matches(regex)){
                return false;
            }
        }

        return true;

    }
}
