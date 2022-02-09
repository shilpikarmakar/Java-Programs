/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

/**
 *
 * @author Shilpi
 */
import java.util.*;
public class Pattern {
    
    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    int a[] = new int[100];
    int n, i, j;
    int size;
    Pattern()
    {
        n = 0;
        size = 0;
    }
    void input()
    {
        System.out.println("Enter the size of array: ");
        size = sc.nextInt();
        System.out.println("Enter the elements in array: ");
        for(i=0; i<size; i++)
        {
            a[i] = sc.nextInt();
        }
    }
    void display1()
    {
        n = size;
        System.out.println("The output is: ");
        for(i=1; i<=n ;i++)
        {
            for(j=1; j<=n; j++)
            {
                if(j<=i)
                {
                    System.out.print(j);
                }
                else
                {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
    void display2()
    {
        n = size;
        System.out.println("Another Output: ");
        for(i=1; i<=n; i++)
        {
            for(j=1; j<=(n-i+1); j++)
            {
                System.out.print(j);
            }
            for(j=1; j<i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Pattern p = new Pattern();
        p.input();
        p.display1();
        p.display2();
    }
    
}
