package controller;

import java.util.ArrayList;
import java.util.Random;

public class PrimeNumber {

    public boolean isPrime(int num){
        boolean isPrime = true;
        for(int divisor = 2; divisor <= num / 2; divisor++) {
            if (num % divisor == 0) {
                isPrime = false;
                break; // num is not a prime, no reason to continue checking
            }
        }
        return isPrime;
    }

    public int [] getRandomNumberArray(int number){

        ArrayList<Integer> list = new ArrayList<Integer>(number);
        Random random = new Random();

        for (int i = 0; i < number; i++)
        {
            list.add(random.nextInt(1000));
        }

        int [] numbers= new int[number];

        for (int i = 0; i < list.size(); i++) {
            numbers[i] = list.get(i);
        }

        return numbers;

    }


    public int getNumPrime(int number){
        int arr[] = getRandomNumberArray(number);
        int result = 0;

        for(int i = 0; i<arr.length; i++){
            if(isPrime((arr[i]))){
                result++;
            }

        }

        return result;

    }
}
