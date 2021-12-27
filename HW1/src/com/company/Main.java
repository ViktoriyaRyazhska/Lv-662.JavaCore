package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введіть першу цифру: ");
        double a = Integer.parseInt(br.readLine());
        System.out.println("Введіть другу цифру відмінну від нуля: ");
        double b = Integer.parseInt(br.readLine());
        double sum = a + b;
        double diff = a - b;
        double multi = a * b;
        double div = a / b;
        System.out.println("Сума: " + '\n' + sum + '\n'+
        "Різниця: " + '\n' + diff + '\n' +
        "Добуток: " + '\n' + multi + '\n' +
        "Ділення: " + '\n' + div);

        System.out.println("How are you?");
        String mood =  br.readLine();
        String result = mood.toLowerCase();
        System.out.println("You are " + result);
    }
}
