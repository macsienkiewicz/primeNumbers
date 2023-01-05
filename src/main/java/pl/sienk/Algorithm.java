package pl.sienk;

public class Algorithm {
    static boolean isPrime(int number) {
        if(number > 2147483629) {
            throw new IllegalArgumentException("Too big number!");
        }
        if(number <= 1) {
            return false;
        }
        for(int i = 2; number >= i * i; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int findNextPrime(int number) {
        if(number < 0) {
            throw new IllegalArgumentException("The number must be higher than 0!");
        }
        boolean numberIsPrime = false;
        while(!numberIsPrime) {
            number += 1;
            numberIsPrime = isPrime(number);
        }
        return number;
    }
}
