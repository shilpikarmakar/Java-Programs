import java.util.*;
public class CountSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int countSetBit = 0;
        while(num > 0)
        {
            if((num & 1) != 0)
            {
                countSetBit++;
            }
            num = num >> 1;
        }
        System.out.println("Number of Set Bits are: " + countSetBit);
        sc.close();
    }
}
