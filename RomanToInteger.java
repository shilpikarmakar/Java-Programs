import java.util.*;
public class RomanToInteger {
    static int Roman(char ch)
    {
        switch(ch)
        {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default  : return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();
        int result = 0;
        if(str.length() == 1)
        {
            result += Roman(str.charAt(str.length()-1));
        }
        else
        {
            for (int i = 0; i < str.length()-1; i++) {
                if(Roman(str.charAt(i)) >= Roman(str.charAt(i+1)))
                {
                    result += Roman(str.charAt(i));
                }
                else
                {
                    result += Roman(str.charAt(i+1)) - Roman(str.charAt(i));
                    i++;
                }
            }
            int j = str.length()-1;
            if(Roman(str.charAt(j)) <= Roman(str.charAt(j-1)))
            {
                result += Roman(str.charAt(j));
            }
        }
        System.out.println("Answer is: " + result);
        sc.close();
    }
}
