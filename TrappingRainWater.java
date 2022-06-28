import java.util.*;
public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in bars: ");
        int n = sc.nextInt();
        int bars[] = new int[n];
        System.out.println("Enter the elements in bars: ");
        for (int i = 0; i < bars.length; i++) {
            bars[i] = sc.nextInt();
        }
        int leftBarsMax[] = new int[n];
        int rightBarsMax[] = new int[n];
        leftBarsMax[0] = bars[0];
        rightBarsMax[n-1] = bars[n-1];
        for (int i = 1; i < leftBarsMax.length; i++) {
            leftBarsMax[i] = Math.max(bars[i], leftBarsMax[i-1]);
        }
        for (int i = rightBarsMax.length-2; i >= 0; i--) {
            rightBarsMax[i] = Math.max(bars[i], rightBarsMax[i+1]);
        }
        int amountOfWater = 0;
        for (int i = 0; i < bars.length; i++) {
            int currentPillar = bars[i];
            int barsMinHeight = Math.min(leftBarsMax[i], rightBarsMax[i]);
            if(barsMinHeight > currentPillar)
            {
                amountOfWater += barsMinHeight-currentPillar;
            }
        }
        System.out.println("Amount of Water: " + amountOfWater);
        sc.close();
    }
}
