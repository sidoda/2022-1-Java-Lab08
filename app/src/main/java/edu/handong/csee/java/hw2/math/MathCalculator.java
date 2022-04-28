package edu.handong.csee.java.hw2.math;

public class MathCalculator
{
    private String name;
    /**
     * Set a name variable to given driver name
     */
    public void setName(String gettedName)
    {
        name = gettedName;
    }

    /**
     * Return a name information 
     */
    public String getName()
    {
        return name;
    }

    /**
     * Compare the size of two integers and return the bigger one
     */
    public int getMax(int a, int b)
    {
        if(a > b)
            return a;
        else
            return b;
    }
    /**
     * Compare the size of two integers and return the smaller one
     */
    public int getMin(int a, int b)
    {
        if(a < b)
            return a;
        else 
            return b;
    }

    /**
     * Return the absolute value
     */
    public int getAbs(int a)
    {
        if (a < 0)
            return a * (-1);
        else    
            return a;
    }

    /**
     * Return the sum of two integers
     */
    public int getSum(int a, int b)
    {
        return a + b;
    }

    /**
     * Return the difference between the two integers
     */
    public int getDiff(int a, int b)
    {
        return a-b;
    }

    /**
     * Return the product of two integers
     */
    public int getProduct(int a, int b)
    {
        return a*b;
    }

    /**
     * Return the quotient of two integers
     */
    public int getQuotient(int a, int b)
    {
        return a/b;
    }

    /**
     * Return the Remainder of two integers
     */
    public int getRemainder(int a ,int b)
    {
        return a%b;
    }
    /**
     * Return the value of a^b
     */
    public int getPower(int a, int b)
    {
        int result = 1;

        for(int i = 0; i < b; i++)
        {
            result = result * a;
        }

        return result;
    }

    /**
     * Return the value of a!
     */
    public int getFactorial(int a)
    {
        int result = 1;

        for(int i = 1; i < a + 1; i++) 
        {
            result = result * i;
        }

        return result;
    }

    /**
     * Return the greatest common divisor between a and b
     */
    public int getGcd(int a, int b)
    {
        while(b != 0)
        {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }

    /**
     * Return the minimum common divisor between a and b
     */
    public int getLcm(int a, int b)
    {
        return a*b/getGcd(a, b);
    }

    /**
     * Return the square of a
     */
    public int getSquare(int a)
    {
       return a*a;
    }
}