class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        
        while(d>0){
            int temp = arr[0];
            for(int i=0; i<n-1; i++){
                arr[i] = arr[i+1];
            }
            arr[n-1] = temp;
            d--;
        }
    }
}

// Time complexity = O(m*d)

