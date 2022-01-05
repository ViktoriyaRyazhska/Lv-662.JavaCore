package Task_3HM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HM3_HTTPError {

        //(Section 3) read number of HTTP Error(400,401,402,....)and write the name of this error (Declare enum HTTPError);

        public enum HTTPError {
            HTTPError400, HTTPError401, HTTPError402
        }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter error code");
        int errorcode = Integer.parseInt(br.readLine());
        HTTPError error = null;
    switch(errorcode){
        case 400:
            error = HTTPError.HTTPError400;
            break;
        case 401:
            error = HTTPError.HTTPError401;
            break;
        case 402:
            error = HTTPError.HTTPError402;
            break;
        default:
            System.out.println("Error");

}
        System.out.println(error);
    }
}