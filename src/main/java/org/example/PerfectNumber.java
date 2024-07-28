package org.example;

public class PerfectNumber {
    public static void main(String[] args) {
        //Defn: A number is perfect if sum of factorial of its digit is equal to the given number.
        int number = 28;
        System.out.println(" " + isPerfectNumber(number));
    }

    private static String isPerfectNumber(int n) {
        int sum = 1;

        for (int i = 2; i * i <= n; i++)
        {
            if (n % i==0)
            {
                if(i * i != n)
                    sum = sum + i + n / i;
                else
                    sum = sum + i;
            }
        }
        // If sum of divisors is equal to
        // n, then n is a perfect number
        if (sum == n && n != 1)
            return "YES";

        return "NO";
    }
}


