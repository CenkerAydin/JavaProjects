import java.util.Scanner;

public class Horoscopes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of month between 1 and 12:");
        int month = sc.nextInt();

        if (!(month>=1 &&month<=12)){
            System.out.println("Invalid Number.Try Again");
            return;
        }

        System.out.println("Enter the number of day:");
        int day = sc.nextInt();

        if (!(day <= 31 && day >= 1)) {
            System.out.println("Invalid Number.Try Again");
            return;
        }
        if (month == 1) {
            if (day >= 1 && day <= 22) {
                System.out.println("You are the Capricorn");
            } else {
                System.out.println("You are the Aquarius");
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 19) {
                System.out.println("You are the Aquarius");
            } else {
                System.out.println("You are the Pisces");
            }
        } else if (month == 3) {
            if (day >= 1 && day <= 20) {
                System.out.println("You are the Pisces");
            } else {
                System.out.println("You are the Aries");
            }
        } else if (month == 4) {
            if (day >= 1 && day <= 20) {
                System.out.println("You are the Aries");
            } else {
                System.out.println("You are the Taurus");
            }
        } else if (month == 5) {
            if (day >= 1 && day < 21) {
                System.out.println("You are the Taurus");
            } else {
                System.out.println("You are the Gemini");
            }
        } else if (month == 6) {
            if (day >= 1 && day < 22) {
                System.out.println("You are the Gemini");
            } else {
                System.out.println("You are the Crab");
            }
        } else if (month == 7) {
            if (day >= 1 && day < 22) {
                System.out.println("You are the Crab");
            } else {
                System.out.println("You are the Leo");
            }
        } else if (month == 8) {
            if (day >= 1 && day < 22) {
                System.out.println("You are the Leo");
            } else {
                System.out.println("You are the Virgo");
            }
        } else if (month == 9) {
            if (day >= 1 && day < 22) {
                System.out.println("You are the Virgo");
            } else {
                System.out.println("You are the Libra");
            }
        } else if (month == 10) {
            if (day >= 1 && day < 22) {
                System.out.println("You are the Libra");
            } else {
                System.out.println("You are the Scorpion");
            }
        } else if (month == 11) {
            if (day >= 1 && day < 21) {
                System.out.println("You are the Scorpion");
            } else {
                System.out.println("You are the Sagittarius");
            }
        } else if (month == 12) {
            if (day >= 1 && day < 19) {
                System.out.println("You are the Sagittarius");
            } else {
                System.out.println("You are the Capricorn");
            }
        }
    }
}

