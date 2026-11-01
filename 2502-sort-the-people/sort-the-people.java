class Solution {
   	public static String[] sortPeople(String[] names, int[] heights) {
        if(names.length == 1) return names;
        for(int i = 0; i < heights.length-1; i++){
            for(int j = i+1; j < heights.length; j++) {
                if (heights[i] < heights[j]){
                    swapHeights(heights, i, j);
                    swapNames(names, i, j);
                }
            }
        }
        return names;
	}
    public static void swapNames(String[] names, int i, int j){
        String temp = names[i];
        names[i] = names[j];
        names[j] = temp;
    }
    public static void swapHeights(int[] heights, int i, int j){
        int temp = heights[i];
        heights[i] = heights[j];
        heights[j] = temp;
    }
}