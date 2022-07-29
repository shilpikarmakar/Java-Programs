import java.util.*;
public class CountSetBitBrianKernigham {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int count = 0;
        while(num > 0)
        {
            num = num & (num -1);
            count++;
        }
        System.out.println("The number of Set Bits are: " + count);
        sc.close();
    }
}
