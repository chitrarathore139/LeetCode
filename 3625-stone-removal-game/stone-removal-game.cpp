class Solution {
public:
    bool canAliceWin(int n) {
        if(n<10) return false;
        int stonesToRemove = 10;
        bool aliceTurn = true; // Alice goes first
        
        while (n >= stonesToRemove) {
            n -= stonesToRemove;
            stonesToRemove--;
            aliceTurn = !aliceTurn; // Switch turn to the other player
        }
        return !aliceTurn;
    }
};