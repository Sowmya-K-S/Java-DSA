
public class ResizeArray 
{
    public static int[] resize(int a[], int capacity)
    {
        //create a temporary array with new required size
        int[] temp = new int[capacity];

        //copy elements of old array to new temporary array
        for(int i=0;i<a.length;i++)
            temp[i] = a[i];
        
        // assign temporary array to incoming array - this step is redundant
        a = temp;
        
        //return the array - we can directly return temp array only
        return a;
    }
    public static void main(String[] args) 
    {
        int[] a = new int[5];
        try
        {
            System.out.println(a[6]);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        int capacity = 7;
        a = resize(a,capacity);
        try
        {
            System.out.println(a[6]);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
