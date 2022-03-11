package com.bridgelabz.basiccore;

public class PowerOf_2 {
    public static int Powerof2(int n)
    {
        int res = 0;
        for(int i = n; i >= 1; i--)
        {

            // If i is a power of 2
            if ((i & (i-1)) == 0)
            {
                res = i;
                break;
            }
        }
        return res;
    }

    // Driver code
    public static void main(String[] args)
    {
        int n = 31;

        System.out.print(Powerof2(n));
    }


}




