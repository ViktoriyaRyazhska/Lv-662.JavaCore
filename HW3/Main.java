package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the first float number: ");
        float a = (float)Integer.parseInt(br.readLine());
        System.out.print("Enter the second float number: ");
        float b = (float)Integer.parseInt(br.readLine());
        System.out.print("Enter the third float number: ");
        float c = (float)Integer.parseInt(br.readLine());

        //RANGE [-5;5]

        if (a<=5 && a >= -5){
            if(b<=5 && b >= -5){
                if(c<=5 && c >= -5){
                    System.out.println("All numbers belong the range [-5;5]");
                }
            }
        }



        //MIN MAX

        float max;
        float min;

        if(a < b){
            if (b < c){
                max = c;
                min = a;
                System.out.println("min: " + min + " " + "max: " + max);
            } else if(b > c && a < c){
                max = b;
                min = a;
                System.out.println("min: " + min + " " + "max: " + max);
            } else{
                max = b;
                min = c;
                System.out.println("min: " + min + " " + "max: " + max);
            }
        } else if(b < a){
            if (a < c){
                max = c;
                min = b;
                System.out.println("min: " + min + " " + "max: " + max);
            }else if(a > c && b < c){
                max = a;
                min = b;
                System.out.println("min: " + min + " " + "max: " + max);
            } else {
                max = a;
                min = c;
                System.out.println("min: " + min + " " + "max: " + max);
            }
        }


        // HTTP ERROR


        System.out.print("Enter the number of HTTP Error(400-419): ");
        int numberOfError = Integer.parseInt(br.readLine());

        switch (numberOfError){
            case 400:
                System.out.println("HTTP ERROR: " + HTTPError.BAD_REQUEST);
                break;
            case 402:
                System.out.println("HTTP ERROR: " + HTTPError.UNAUTHORIZED);
                break;
            case 403:
                System.out.println("HTTP ERROR: " + HTTPError.PAYMENT_REQUIRED);
                break;
            case 404:
                System.out.println("HTTP ERROR: " + HTTPError.FORBIDDEN);
                break;
            case 405:
                System.out.println("HTTP ERROR: " + HTTPError.NOT_FOUND);
                break;
            case 406:
                System.out.println("HTTP ERROR: " + HTTPError.METHOD_NOT_ALLOWED);
                break;
            case 407:
                System.out.println("HTTP ERROR: " + HTTPError.NOT_ACCEPTABLE);
                break;
            case 408:
                System.out.println("HTTP ERROR: " + HTTPError.PROXY_AUTHENTICATION);
                break;
            case 409:
                System.out.println("HTTP ERROR: " + HTTPError.REQUEST_TIMEOUT);
                break;
            case 410:
                System.out.println("HTTP ERROR: " + HTTPError.CONFLICT);
                break;
            case 411:
                System.out.println("HTTP ERROR: " + HTTPError.GONE);
                break;
            case 412:
                System.out.println("HTTP ERROR: " + HTTPError.LENGTH_REQUIRED);
                break;
            case 413:
                System.out.println("HTTP ERROR: " + HTTPError.PRECONDITION_FAILED);
                break;
            case 415:
                System.out.println("HTTP ERROR: " + HTTPError.REQUEST_ENTITY_TOO_LARGE);
                break;
            case 416:
                System.out.println("HTTP ERROR: " + HTTPError.REQUEST_URI_TOO_LONG);
                break;
            case 417:
                System.out.println("HTTP ERROR: " + HTTPError.UNSUPPORTED_MEDIA_TYPE);
                break;
            case 418:
                System.out.println("HTTP ERROR: " + HTTPError.REQUESTED_RANGE_NOT_SATISFIABLE);
                break;
            case 419:
                System.out.println("HTTP ERROR: " + HTTPError.EXPECTATION_FAILED);
                break;
            default:
                System.out.println("Incorrect number!");
                break;
        }

        // Class Dog

        Dog dog1 = new Dog("Jesika", 5, Breed.AFADOR);
        Dog dog2 = new Dog("Riki", 9, Breed.AKITA);
        Dog dog3 = new Dog("Kiki", 12, Breed.BOXER);

        if(dog1.getName().equals(dog2.getName()) | dog3.getName().equals(dog2.getName()) | dog1.getName().equals(dog3.getName())){
            System.out.println("There is two dogs with the same name");
        } else System.out.println("There is no dogs with the same name");


        System.out.println();
        if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) System.out.println("The oldest dog: " + dog1.toString());
        if (dog2.getAge() > dog3.getAge() && dog2.getAge() > dog1.getAge()) System.out.println("The oldest dog: " + dog2.toString());
        if (dog3.getAge() > dog1.getAge() && dog3.getAge() > dog2.getAge()) System.out.println("The oldest dog: " + dog3.toString());

    }
}
