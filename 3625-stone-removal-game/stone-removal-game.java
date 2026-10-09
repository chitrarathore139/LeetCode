class Solution {
    public boolean canAliceWin(int n) {
        if(n<10) return false;
        int stonesToRemove = 10;
        boolean aliceTurn = true; // Alice goes first
        
        while (n >= stonesToRemove) {
            n -= stonesToRemove;
            stonesToRemove--;
            aliceTurn = !aliceTurn; // Switch turn to the other player
        }
        
        // If the loop ends and it's Alice's turn, it means Alice didn't have 
        // enough stones to make her move, so she loses (returns false).
        // If it's Bob's turn, Bob couldn't make his move, so Alice wins (returns true).
        return !aliceTurn; 
    }
}