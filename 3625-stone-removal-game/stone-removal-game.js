/**
 * @param {number} n
 * @return {boolean}
 */
var canAliceWin = function(n) {
        if(n<10) return false;
        let stonesToRemove = 10;
        let aliceTurn=1;
        
        while (n >= stonesToRemove) {
            n -= stonesToRemove;
            stonesToRemove--;
            aliceTurn = -1*aliceTurn; // Switch turn to the other player
        }
        return aliceTurn==-1;
};