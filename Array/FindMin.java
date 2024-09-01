
//to find minimum in an array

public class FindMin 
{
    public static void findMin(int a[])
    {
        //enhancement to handle null and empty array arguments
        if(a == null || a.length == 0)
            throw new IllegalArgumentException("Invalid Input");
        
        
        int min;
        
        min = a[0];

        for(int i=1;i<a.length;i++)
        {
            if(a[i]<min)
                min = a[i];
        }

        System.out.println(min);
    }
    public static void main(String[] args) 
    {
        int [] a = {4,6,8,3,2,1};
        int [] b = {};
        findMin(a);
        // findMin(null);
        findMin(b);
    }   
}
