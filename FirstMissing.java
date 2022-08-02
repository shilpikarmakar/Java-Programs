public class FirstMissing {
    public static void main(String[] args) {
        int[] arr = {10,11,12,13,15,16};
        int totalXOR = 0, elementXOR = 0;
        int max = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        for(int i=arr[0]; i<=max; i++)
        {
            totalXOR ^= i;
        }
        for (int i = 0; i < arr.length; i++) {
            elementXOR ^= arr[i];
        }
        System.out.println(totalXOR^elementXOR);
    }
}
