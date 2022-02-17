class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    int first = a[0];
	    int second = Integer.MIN_VALUE;
	    int third = Integer.MIN_VALUE;
	    
	    for(int i=1; i<a.length; i++){   
	        if(a[i]>first){
	            third = second;
	            second = first;
	            first = a[i];
	        }
	        
	        else if(a[i]>second){  // check for element greater than second but less than first
	            third = second;
	            second = a[i];
	            }
	            
            else if(a[i]>third){   // check for element greater than third but less than first and second
                third = a[i];
                }
	   }
	   
	   if(third == Integer.MIN_VALUE)  // if third largest not exits simply return -1
	        return -1;
	    
	    return third;
    }
}

// Time complexity => O(n^2)
// Space complexity => O(1)
