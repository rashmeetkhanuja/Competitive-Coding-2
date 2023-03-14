public class KnapsackRecursive{
  public int knapsack(int[] profits, int[] weights, int capacity) {
      return helper(0, profits, weights, capacity, 0);
  }
      private int helper(int idx, int[] profits, int[] weights, int capacity, int profitTillNow){
      //base
      if(capacity<=0 || idx>=profits.length) return profitTillNow;

      //logic
      int case0 = helper(idx+1, profits, weights, capacity,profitTillNow);
      int case1 = 0;
      if(weights[idx] <= capacity) {
           case1 = helper(idx + 1, profits, weights, capacity - weights[idx], profitTillNow + profits[idx]);
      }
      return Math.max(case0, case1);
  }

    public static void main(String[] args) {
        KnapsackRecursive obj = new KnapsackRecursive();
        int[] profits = new int[]{60,100,120};
        int[] weights = new int[]{10,20,30};
        int capacity = 50;
        int res = obj.knapsack(profits, weights, capacity);
        System.out.println("res -- " + res);
    }

}
