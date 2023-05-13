import java.util.Scanner;

public class CelciusAndFahrenheitConvert{
    public static void main(String[] args) {
        System.out.println( celciusToFahrenheit(32));
        System.out.println( fahrenheitToCelcius(45));
    }

    public static double celciusToFahrenheit(double celcius){
    double fahrenheit;
    return fahrenheit=(9.0/5)*celcius+32;
    }
    public static double fahrenheitToCelcius(double fahrenheit){
    double celcius;
    return celcius=(5.0/9)*(fahrenheit-32);
    }
}
