package Programs.com;

import java.util.Scanner;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public static void main( String[] args )
    {
        int r=0, c=0;
        System.out.println("Enter the number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int temp=num;
        while(num>0)
        {
        	r=num%10;
        	num=num/10;
        	c=c+(r*r*r);
     	}
        if(c==temp)
        {
        	System.out.println("Armstrong number");
        }
        else 
        {
        	System.out.println("Not an Armstrong");
        }
    }
}