import java.util.*;
public class SubSequenceOfAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        ArrayList<String> subSeqList = new ArrayList<>();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char firstChar = str.charAt(i);
            if(subSeqList.size() == 0)
            {
                subSeqList.add("");
                subSeqList.add("" + firstChar);
                continue;
            }
            int subLen = subSeqList.size();
            for (int j = 0; j < subLen; j++) {
                String temp = subSeqList.get(j) + firstChar;
                subSeqList.add(temp);
            }
        }
        System.out.println("Subsequences are: " + subSeqList);
        sc.close();
    }
}
