
import java.util.*;

class Solution {
  public int twoCitySchedCost(int[][] costs) {
    int n = costs.length / 2;
    int[] A = new int[costs.length];
    int[] B = new int[costs.length];
    for (int i = 0; i < costs.length; i++) {
      A[i] = costs[i][0];
      B[i] = costs[i][1];
    }
    int[] diff = new int[A.length];
    Integer[] index = new Integer[A.length];
    for (int i = 0; i < diff.length; i++) {
      diff[i] = B[i] - A[i];
      index[i] = i;
    }
    Arrays.sort(index, (a, b) ->
      Integer.compare(diff[a], diff[b])
    );
    int cost = 0;
    for (int i = 0; i < index.length; i++) {
      int emp = index[i];
      if (i < n) {
        cost += B[emp];
      } else {
        cost += A[emp];
      }
    }
    return cost;
  }
}