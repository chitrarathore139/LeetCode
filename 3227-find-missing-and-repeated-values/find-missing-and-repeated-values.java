
class Solution {
  public int[] findMissingAndRepeatedValues(int[][] grid) {
    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        list.add(grid[i][j]);
      }
    }

    Collections.sort(list);

    int missing = 0;
    int twice = 0;

    for (int i = 0; i < list.size() - 1; i++) {
      if (list.get(i).equals(list.get(i + 1))) {
        twice = list.get(i);
      }
      else if (list.get(i + 1) != list.get(i) + 1) {
        missing = list.get(i) + 1;
      }
    }

    if (list.get(0) != 1) {
      missing = 1;
    }

    if (list.get(list.size() - 1) != list.size()) {
      missing = list.size();
    }

    return new int[]{twice, missing};
  }
}