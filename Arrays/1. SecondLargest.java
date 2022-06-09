class Solution
{ 
    public static int print2largest(int A[],int N) 
    {
        
        //CODE HERE
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0; i<N; i++){
            if(A[i]>first){    
                second = first; //swap both numbers
                first = A[i];
            }
            else if(A[i]>second && A[i] != first)  // This is used for finding the element between first and second 
                second = A[i];
        }
        
        if(second == Integer.MIN_VALUE) // if there is no second largest it simply returns to -1
            return -1;
        return second;
    }
}
        
