
//To find second maxximum

public class FindSecondMax 
{
    //approach one

    // public static int max(int a[])
    // {
    //     int max = a[0];
    //     for(int i=0;i<a.length;i++)
    //     {
    //         if(a[i]>max)
    //             max = a[i];
    //     }
    //     return max;
    // }
    // public static void main(String[] args) 
    // {
    //         int[] a = {1,2,3,4,5};
    //         int max_val = max(a);

    //         for(int i=0;i<a.length;i++)
    //         { 
    //             if(a[i]==max_val)
    //                 a[i]= Integer.MIN_VALUE; 
    //         }
    //         int sec_max_val = max(a);
    //         System.out.println(sec_max_val);

    // }

    //approach two
    public static void main(String[] args) {
        
        int[] a = {1,2,3,4,5};
        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;

        for(int i =0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                sec_max = max;
                max = a[i];
            }
            else if(a[i]>sec_max && a[i]!=max)
            {
                sec_max = a[i];
            }
        }

        System.out.println(sec_max);
    }
}
