public class SecondMissingUsingBitwise {
    static void findTwoMissingNumbers(int arr[], int n)
    {
    int XOR = arr[0];
        for (int i = 1; i < n-2; i++)
            XOR ^= arr[i];
        for (int i = 1; i <= n; i++)
            XOR ^= i;
        int set_bit_no = XOR & ~(XOR-1);
        int x = 0, y = 0;
        for (int i = 0; i < n-2; i++)
        {
            if ((arr[i] & set_bit_no) > 0)
                x = x ^ arr[i]; 
            else
                y = y ^ arr[i]; 
        }
          
        for (int i = 1; i <= n; i++)
        {
            if ((i & set_bit_no)>0)
                x = x ^ i; 
            else
                y = y ^ i; 
        }
       
        System.out.println("Second Missing Number is ");
        System.out.println(y);
    }
    public static void main(String[] args) 
    {
         int arr[] = {1, 3, 5, 6};
         int n = 2 +arr.length;
           
         findTwoMissingNumbers(arr, n);
      
        }
}
