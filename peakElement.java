import java.util.*;
public class peakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int peakElement = 0;
        int index = 0;
        System.out.println("Enter the elements in an array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        if(n == 1)
        {
            System.out.println("Peak Element is: " + a[0] + " and is at index 0");
            sc.close();
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if(i == 0)
            {
                if(a[i] > a[i+1])
                {
                    peakElement = a[i];
                    index = i;
                }
            }
            else
            {
                if(i == (n-1))
                {
                    if(a[i] > a[i-1])
                    {
                        peakElement = a[i];
                        index = i;
                    }
                }
                else
                {
                    if((a[i] > a[i-1]) && (a[i] > a[i+1]))
                    {
                        peakElement = a[i];
                        index = i;
                    }
                }
            }
        }
        System.out.println("Peak element is " + peakElement + " and is at index " + index);
        sc.close();
    }
}
