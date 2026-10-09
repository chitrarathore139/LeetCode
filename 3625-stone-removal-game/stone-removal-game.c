bool canAliceWin(int n) {
        if(n<10) return false;
        int stonesToRemove = 10;
        int aliceTurn=1;
        
        while (n >= stonesToRemove) {
            n -= stonesToRemove;
            stonesToRemove--;
            aliceTurn = -1*aliceTurn; // Switch turn to the other player
        }
        return aliceTurn==-1;
}