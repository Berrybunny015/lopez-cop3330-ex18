package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //variable declarations
        String celsiusCAPS = "C"; //representation of celsius as a capital letter
        String celsiusLow = "c"; //representation of celsius as a lowercase letter
        String fahrenheitCAPS = "F"; //representation of fahrenheit as a capital letter
        String fahrenheitLow = "f"; //representation of fahrenheit as a lowercase letter

        System.out.println("\nPress C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour choice: "); //ask the temperature type
        Scanner temperatureTypeInput = new Scanner(System.in); //scan for the temperature type
        String temperatureType = temperatureTypeInput.next();

        if (temperatureType.equals(celsiusCAPS) || temperatureType.equals(celsiusLow)) { //if the user selects celsius to fahrenheit temperature conversion
            System.out.println("\nPlease enter the temperature in Fahrenheit: "); //ask for specific fahrenheit temperature
            Scanner fahrenheitTempInput = new Scanner(System.in); //scan for the specific fahrenheit temperature
            double fahrenheitTemp = fahrenheitTempInput.nextDouble();

            //double as to keep any numbers that may occur after the decimal
            double celsiusTemp = (fahrenheitTemp - 32) * 5 / 9; //calculate the temperature in celsius

            System.out.println("\nThe temperature in Celsius is " + celsiusTemp + "."); //output the calculated temperature
        }
        else if (temperatureType.equals(fahrenheitCAPS) || temperatureType.equals(fahrenheitLow)) { //if the user selects fahrenheit to celsius temperature conversion
            System.out.println("\nPlease enter the temperature in Celsius: "); //ask for the specific celsius temperature
            Scanner celsiusTempInput = new Scanner(System.in); //scan for the specific celsius temperature
            double celsiusTemp = celsiusTempInput.nextDouble();

            //double as to keep any numbers that may occur after the decimal
            double fahrenheitTemp = (celsiusTemp * 9 / 5) + 32; //calculate the temperature in fahrenheit

            System.out.println("\nThe temperature in Fahrenheit is " + fahrenheitTemp + "."); //output the calculated temperature
        }
    }
}
