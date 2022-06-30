public class GasFillingStation {
    public static void main(String[] args) {
        int gas[] = {1,2,3,4,5};
        int cost[] = {3,4,5,1,2};
        int surplus = 0;
        int deficient = 0;
        int startingPoint = 0;
        for (int i = 0; i < gas.length; i++) {
            deficient += gas[i] - cost[i];
            surplus = deficient;
            if(surplus < 0)
            {
                surplus = 0;
                startingPoint++;
            }
        }
        if(deficient >= 0)
        {
            System.out.println("Starting Point is: " + startingPoint);
        }
        else
        {
            System.out.println("No Starting Point found");
        }
       }
}