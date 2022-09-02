public class loops {
    public static void main(String[] args) {
       int numbers [] = { 7 , 1, 5 , 3 , 6 , 4};
       rotate(numbers , 3);
       for (int i = 0 ; i<numbers.length ; i++) {
           System.out.print(numbers[i]);
       }
        //System.out.println(buyAndSell(prices));
      // int height[] = {1,0,2,1,0,1,3,2,1,2,1};
       // System.out.println(trappedWater(height));
        //System.out.println(trappedWater(height));
        //System.out.println(getLargest(numbers));
        //subArrays(numbers);
        //pairs(numbers);
      //  kadane(numbers);
        //appearsTrue(numbers);
    }

    public static int getLargest(int num[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
                if (smallest > num[i]) {
                    smallest = num[i];
                }
            }
        }
        System.out.println(smallest);
        return largest;
    }

    public static void subArrays(int numbers[]) {
       int ts= 0;
       int sum = 0;
       int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            for (int j = i; j < numbers.length ; j++ ) {
                int end = j;
sum = 0;
            for (int k = start ; k <= end ; k++){
              //sum += numbers[k];
                //System.out.println(sum);
                 //if (maxSum < sum ) {
                //maxSum = sum ; }
                System.out.print(numbers[k] + " ");
                sum = sum + numbers[k];

            }
                System.out.println("total = " + sum);
               ts ++;
                System.out.println();
        }
            System.out.println();
    }
        System.out.println("total subarrays = " + ts);
       // System.out.println( " sum = " + sum);
}

public static void pairs(int numbers []) {
        for (int i = 0 ; i < numbers.length ; i++) {
            int current = numbers[i];
            for (int j = i + 1 ; j < numbers.length ; j++ ) {
                System.out.print( "(" + current + "," + numbers[j] + ")" + " ");
            }
            System.out.println();
        }
}
public static void kadane ( int numbers []) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for ( int i = 0 ; i < numbers.length ; i++) {
            currSum += numbers[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);

        }  System.out.println(maxSum);
}
public static boolean appearsTrue (int[] numbers) {
        for (int i = 0 ; i< numbers.length - 1; i++){
            for (int j = i +1; j< numbers.length; j++) {
                if ( numbers[i] == numbers[j]) {
                    return true;
                }

            }
        }
    return false;
}
public static int trappedWater(int height[] ) {
        int leftMax [] = new int [height.length];
         leftMax[0] = height[0];
        for(int i = 1 ; i < height.length; i++)  {
            leftMax[i] = Math.max(height[i] , leftMax[i-1]) ;
        }
        int rightMax [] = new int [height.length] ;
        rightMax[height.length-1] = height[height.length-1];
        for ( int i = height.length-2 ; i >= height.length - 1 ; i--) {
            rightMax[i]= Math.max(height[i] , rightMax[i+1] );
        }
                int trappedWater = 0 ;
        for (int i = 0 ; i < height.length ; i++) {
            int waterLevel = Math.min(leftMax[i] , rightMax[i] );
            trappedWater += waterLevel-height[i];
        }
        return trappedWater;
}
public static int buyAndSell (int prices[] ) {
        int buyPrices = Integer.MAX_VALUE;
        int maxProfit = 0;
        for ( int i = 0; i< prices.length ; i++) {
            if (buyPrices < prices[i]) {
                int profit = prices[i] - buyPrices;
                maxProfit = Math.max(maxProfit , profit);
            }
            else {
                buyPrices= prices[i];
            }
        }
        return maxProfit;
}
public static void reverse(int[] numbers , int start , int end) {
       // int start = 0 , end = numbers.length-1;
         while ( start < end ){
             int temp = numbers[end];
             numbers[end] = numbers[start];
             numbers[start] = temp;

             start++;
             end--;
         }

}
public static void rotate(int numbers[] , int key) {
       key = key%numbers.length;
       reverse(numbers , 0 , numbers.length-1);
       reverse(numbers , 0 , key-1);
       reverse(numbers , key , numbers.length-1);
}

}
