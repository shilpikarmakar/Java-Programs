import java.util.*;
public class EqualNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int m = sc.nextInt();
        System.out.println("Enter the second number: ");
        int n = sc.nextInt();
        if((m^n) == 0)
        {
            System.out.println("Equal Numbers");
        }
        else
        {
            System.out.println("Not Equal");
        }
        sc.close();
    }
}
