public class OddNumberCount {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 20, 10, 70, 66, 22, 10, 10, 70, 66, 22};
        int odd = 0;
        for(int element: arr)
        {
            odd = odd ^ element;
        }
        System.out.println("The number with odd occurence is: " + odd);
    }
}
