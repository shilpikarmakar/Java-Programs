/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permutationofstring;

/**
 *
 * @author Shilpi
 */
import java.util.*;
public class PermutationofString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  //TODO code application logic here

        int n, i, j, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        System.out.println("Output: ");
        for(i =0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
                for(k=0; k<n; k++)
                {
                    int a = (i *10) + j;
                    int b = (a * 10) +k;
                    System.out.println(b);
                }
            }
        }
    }
}




