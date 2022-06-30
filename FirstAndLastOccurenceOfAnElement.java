import java.util.*;
public class FirstAndLastOccurenceOfAnElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements in an array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search: ");
        int search = sc.nextInt();
        int firstIndex = 0;
        int lastIndex = 0;
        for(int i=1; i<n-1; i++)
        {
            if((a[i] == search) && (a[i-1] != search))
            {
                firstIndex = i;
            }
            else
            {
                if(a[0] == search)
                {
                    firstIndex = 0;
                }
            }
            if((a[i] == search) && (a[i+1] != search))
            {
                lastIndex = i;
            }
            else
            {
                if(a[n-1] == search)
                {
                    lastIndex = n-1;
                }
            }
        }
        System.out.println("First occurrence of element is: " + firstIndex);
        System.out.println("Last occurrence of element is: " + lastIndex);
        sc.close();
    }
}
