import java.util.Scanner;

public class PlaneTickets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the the Km:");
        double km=sc.nextDouble();

        if (km<=0){
            System.out.println("Invalid Enter!.Try Again");
            return;
        }

        System.out.print("Enter the age:");
        int age=sc.nextInt();

        if (age<=0){
            System.out.println("Invalid Enter!.Try Again");
            return;
        }

        System.out.println("Enter the trip type " +
                "\n1-One direction trip \n2-Round trip");
        int trip=sc.nextInt();



        if (!(trip==1 || trip==2)){
            System.out.println("Invalid Enter!.Please enter the 1 or 2");
            return;
        }

        double costToKm=km*0.10;

        if (trip==1){
            costToKm=costToKm;
        }else {
            costToKm=costToKm*2;
        }



        if (age<12){
            if (trip==2) {
                System.out.println("Normal Total:" + costToKm);
                double discountAge = costToKm * 0.5;
                costToKm=costToKm-discountAge;
                double discountTrip=costToKm*0.20;
                costToKm=costToKm-discountTrip;
                System.out.println("Total with discount:" + costToKm);
            }else {
                System.out.println("Normal Total:" + costToKm);
                double discountAge = costToKm * 0.5;
                costToKm=costToKm-discountAge;
                System.out.println("Total with discount:"+costToKm);
            }
        }else if (age>=12 &&age<=24){
            if (trip==2) {
                double discountAge=costToKm*0.10;
                costToKm=costToKm-discountAge;
                double discountTrip=costToKm*0.20;
                costToKm=costToKm-discountTrip;
                System.out.println("Total with discount:" + costToKm);
            }else{
                double discountAge=costToKm*0.10;
                costToKm=costToKm-discountAge;
                System.out.println("Total with discount:" + costToKm);
            }
        }else if (age>65){
            if (trip==2){
                double discountAge=costToKm*0.30;
                costToKm=costToKm-discountAge;
                double discountTrip=costToKm*0.20;
                costToKm=costToKm-discountTrip;
                System.out.println("Total with discount:" + costToKm);
            }else{
                double discountAge=costToKm*0.30;
                costToKm=costToKm-discountAge;
                System.out.println("Total with discount:" + costToKm);
            }
        }else {
            if (trip==2){
                double discountTrip=costToKm*0.20;
                costToKm=costToKm-discountTrip;
                System.out.println("Total with discount:" + costToKm);
            }else{
                System.out.println("Total:" +costToKm);
            }
        }





    }
}
