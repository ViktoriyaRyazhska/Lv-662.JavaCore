package prTask_9_p3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {

    public static boolean checkForValidity(String userName){
        String pattern = "^[a-zA-Z0-9_]{3,15}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(userName);
        return m.matches();

    }

    public static void main(String[] args) {
        String[] userNames = new String[5];
        userNames[0] = "Oleg";
        userNames[1] = "nina10";
        userNames[2] = "Yana.8";
        userNames[3] = "victor-95";
        userNames[4] = "Maria_20";

        for (int i = 0; i < userNames.length; i++) {
            System.out.println(checkForValidity(userNames[i]));

        }

    }
}
