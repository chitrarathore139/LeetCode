/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(arr) {
    let xor = arr.length;
        for(let i=0;i<arr.length;i++) {
            xor = xor ^ i ^ arr[i];
        }
        return xor;
};