package dhanu.study.medium;

public class Power10 {

    public static boolean isPowerOf10(int x)
    {
        // your code goes here
        while (x > 1 && x % 10 == 0) {
                x = x /10;
        }
        return  x == 1;
    }

    public static boolean doTestsPass()
    {
        int[] isPowerList = {10};
        int[] isNotPowerList = {3};

        for(int i : isPowerList)
        {
            if(!isPowerOf10(i))
            {
                System.out.println("Test failed for: " + i);
                return false;
            }
        }

        for(int i : isNotPowerList)
        {
            if(isPowerOf10(i))
            {
                System.out.println("Test failed for: " + i);
                return false;
            }
        }

        System.out.println("All tested passed");
        return true;
    };


    public static void main(String args[])
    {
        doTestsPass();
    }
}
