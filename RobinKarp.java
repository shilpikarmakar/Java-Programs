import java.util.ArrayList;

public class RobinKarp {
    static ArrayList<Integer> robinKarp(String pattern, String str)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int n = str.length();
        int p = pattern.length();
        int d = pattern.length();
        int x = 1;
        int q = 13;
        int stringHash = 0;
        int patternHash = 0;
        for (int i = 0; i < p-1; i++) {
            x = (x * d) % q;
        }
        for (int i = 0; i < p; i++) {
            patternHash = (patternHash * d + (pattern.charAt(i))) % q;
            stringHash = (stringHash * d + (str.charAt(i))) % q;
        }
        for (int i = 0; i <= (n-p); i++) {
            if(patternHash == stringHash)
            {
                int j = 0;
                for(j = 0; j < p; j++)
                {
                    if(pattern.charAt(j) != str.charAt(i+j))
                    {
                        break;
                    }
                }
                if(j == p)
                {
                    list.add(i+1);
                }
            }
            if(i < n-p)
            {
                stringHash = stringHash - (str.charAt(i) * x);
                stringHash = ((stringHash * d + str.charAt(i+p))) % q;
                if (stringHash < 0) {
                    stringHash = stringHash + q;
                }
            }
        }
        if(list.size() == 0)
        {
            list.add(-1);
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(robinKarp("abc", "abcvgdhsjdabcgsh"));
    }
}
