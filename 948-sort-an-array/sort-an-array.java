class Solution {
    public int[] sortArray(int[] arr) {
        int max = arr[0] ;
        int min = arr[0] ;
        for(int num : arr){
            max = Math.max(num , max);
            min = Math.min(num , min) ;
        }
        int freq[] = new int[max-min+1] ;
        for(int numm : arr){
            int in = numm - min ;
            freq[in] ++ ;
        }

        int index = 0 ;
        for(int i=0 ; i<freq.length ; i++){
            while(freq[i] > 0){
                arr[index] = i+ min  ;
                index ++ ;
                freq[i]-- ;
            }
        }
        return arr ;
    }
}