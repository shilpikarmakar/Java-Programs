import java.util.*;
public class PowerofTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        while(num > 0)
        {
            num = num & (num -1);
            count++;
        }
        if(count == 1)
        {
            System.out.println("It is in power of 2");
        }
        else
        {
            System.out.println("It is not in power of 2");
        }
        sc.close();
    }
}