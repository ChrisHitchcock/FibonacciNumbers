/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonaccinumbers;

/**
 *
 * @author chhit5249
 */
public class FibonacciNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] fibNum = fib();
        for (int a=0;a<fibNum.length;a++)
        {
            System.out.print(fibNum[a]+" ");
        }
    }
    
    public static int[] fib()
    {
        int[] fibOut = new int[] {1,1,2,3,5,8,13,21,34};
        return fibOut;
    }
    
}
