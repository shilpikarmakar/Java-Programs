import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements in an array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        int majorityElement = 0;
        int majcount = n/2;
        for (int i = 0; i < a.length; i++) {
            if(count == 0)
            {
                majorityElement = a[i];
            }
            if(majorityElement == a[i])
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        count = 0;
        for (int element : a) {
            if(element == majorityElement)
            {
                count++;
            }
        }
        if(count > majcount)
        {
            System.out.println("Majority Element is: " + majorityElement);
        }
        else
        {
            System.out.println("No majority element found");
        }
        sc.close();
    }
}
