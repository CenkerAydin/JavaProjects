public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(50));
    }
    public static boolean isPrime(int number){
        for (int i=2;i<=number;i++){
            if (number%i==0){
                return false;
            }
        }

        return true;
    }
}
