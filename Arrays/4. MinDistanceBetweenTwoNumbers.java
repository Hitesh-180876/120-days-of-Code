class Solution {
    int minDist(int a[], int n, int x, int y) {
        // code here
        int minDistt = Integer.MAX_VALUE;
                                                                
        int p = -1;                                          //       | 1 | 2 | 4| 6| 10|   x = 1, y=6
        for(int i =0; i<a.length; i++){                     //  p = -1; take pointer intitialize to -1
            if(a[i] == x || a[i] == y){
                if(p!=-1 && a[i]!=a[p]){
                    minDistt = Math.min(minDistt,i-p);     // take minimum distance using inbuilt Math.min function
                }
                p = i;                                      // update pointer if pointer not equals to -1
            }
            
        }
        if(minDistt == Integer.MAX_VALUE)           // if minDistance not exists simply returns to -1;
            return -1;
        return minDistt;
    }
}
