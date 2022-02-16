package com.softserve.Lv_662.JavaCore.myProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public enum Task11 {
    UNKNOWN,
    VISA("^4[0-9]{12}(?:[0-9]{3}){0,2}$"),
    MASTERCARD("^(?:5[1-5]|2(?!2([01]|20)|7(2[1-9]|3))[2-7])\\d{14}$"),
    AMERICAN_EXPRESS("^3[47][0-9]{13}$"),
    DINERS_CLUB("^3(?:0[0-5]\\d|095|6\\d{0,2}|[89]\\d{2})\\d{12,15}$"),
    DISCOVER("^6(?:011|[45][0-9]{2})[0-9]{12}$"),
    JCB("^(?:2131|1800|35\\d{3})\\d{11}$"),
    CHINA_UNION_PAY("^62[0-9]{14,17}$");

    private Pattern pattern;

    Task11() {
        this.pattern = null;
    }

    Task11(String pattern) {
        this.pattern = Pattern.compile(pattern);
    }

    public static Task11 detect(String cardNumber) {
        String patterCard = cardNumber.replaceAll("-","");
        for (Task11 cardType : Task11.values()) {
            if (null == cardType.pattern) continue;
            if (cardType.pattern.matcher(patterCard).matches()) return cardType;
        }

        return UNKNOWN;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        System.out.println("Enter card number in format [xxxx-xxxx-xxxx-xxxx] to validate");
        try {
            input = br.readLine();
        } catch (IOException e) {
            System.out.println("Wrong input, please enter number only");
        }
        System.out.println(detect(input));
    }
}