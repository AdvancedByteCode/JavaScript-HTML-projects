package math;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci
{

    public static void main(String[] args)
    {
        int stairs = 6;
        System.out.println("There are "+stairs(stairs)+" possibilities!");
    }

    static int stairs(int n)
    {
        int[] fibonacciNums = new int[n];
        fibonacciNums[0] = 1;
        fibonacciNums[1] = 1;
        fibonacciNums[2] = 2;

        int findNum = 4;

        while (findNum < n + 1)
        {
            fibonacciNums[findNum-1] = fibonacciNums[(findNum-1) - 1] + fibonacciNums[(findNum-1) - 2];
            findNum++;
        }

        return fibonacciNums[(n-1)];
    }

}
