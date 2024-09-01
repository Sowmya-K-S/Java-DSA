
// Given an array of (n-1) distinct numbers in the range of 1 to n, find the missing number in it.

public class MissingNum 
{
    public static void main(String[] args) 
    {
        int[] a={1,2,3,4,5,7,8,9}; 
        
        int n = a.length + 1;

        int missed = (n*(n+1))/2;

        for(int i=0;i<a.length;i++)
            missed = missed - a[i];
        
        System.out.println(missed);
        
    }    
}
