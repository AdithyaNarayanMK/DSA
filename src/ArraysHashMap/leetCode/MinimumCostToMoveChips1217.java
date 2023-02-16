package ArraysHashMap.leetCode;

public class MinimumCostToMoveChips1217 {
    //Position array elements i.e, ith element is in position[i]th position
    public int minCostToMoveChips(int[] position) {
        //As the cost of moving the chip by +2 or -2 cost 0 from problem statement
        //So move all odd elements(i.e, position of the chip is odd index) to 1
        //So move all even elements(i.e, position of the chip is even index) to 2
        int costEven = 0;
        int costOdd = 0;
        for(int i=0;i<position.length;i++){
            if(position[i] % 2 == 0)
                costEven++;
            else
                costOdd++;
        }
        //As the cost of moving the chip by +1 or -1 cost 1 from problem statement
        //So find the minimum off costEven and costOdd
        return Math.min(costEven,costOdd);
    }
}
