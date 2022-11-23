import java.util.Scanner;

public class FahrenheitToCelsiusConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit, celsius;
        System.out.println("Enter Fahrenheit number: ");
        fahrenheit = input.nextDouble();
        celsius = (fahrenheit - 32) * 5 / 9;
        
        System.out.println("Given number is converted to Celsius: " + celsius + "°C");
        }
    }