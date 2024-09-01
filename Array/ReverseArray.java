
//To reverse array

public class ReverseArray {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        for(int i = 0;i<a.length;i++)
            System.out.print(a[i]+"\t");
        int start = 0;
        int end = a.length-1;
        int temp;
         while(start<end)
         {
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
         }
         System.out.println();
         for(int i = 0;i<a.length;i++)
            System.out.print(a[i]+"\t");
    }
    
}
