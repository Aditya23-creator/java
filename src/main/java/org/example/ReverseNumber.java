package org.example;

public class ReverseNumber {


    public static void main(String[] args) {
        int  num = 1998;
      num =   reverse(num);
        System.out.println(num);
    }
    private static int reverse(int n) {
        int  d = 0;

        long s = 0;

        while(n  != 0) {

            d =   n  %10;
            s =  s *10  + d;
            n =  n/10;
          //  System.out.println(n);
        }

      //  System.out.println(s);
      // corner case if input int value goes out of range
        if(s <  Integer.MIN_VALUE  ||   s> Integer.MAX_VALUE) {
            return 0;
        }

        return  (int) s;
    }
}



