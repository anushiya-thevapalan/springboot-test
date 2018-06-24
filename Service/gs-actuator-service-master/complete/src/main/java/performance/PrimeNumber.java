package performance;

public class PrimeNumber {

    boolean isPrime(int num){
        boolean isPrime = true;
        for(int divisor = 2; divisor <= num / 2; divisor++) {
            if (num % divisor == 0) {
                isPrime = false;
                break; // num is not a prime, no reason to continue checking
            }
        }
        return isPrime;
    }


    int primesLessthan(int number){
        int result = 0;

        for(int i = 2; i<=number; i++){
            if(isPrime((i))){
                result++;
            }

        }

        return result;

    }
}
