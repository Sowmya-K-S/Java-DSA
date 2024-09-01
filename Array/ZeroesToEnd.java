
//To move all zeroes to end maintaining the relative order of the non-zero elements

//one approach is shown in video

// this is another approach
public class ZeroesToEnd {
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 0, 0, 0, 3, 4};
        int i = 0, j = 0;

        while (j < a.length) 
        {
            if (a[j] != 0) 
            {
                if (i != j) 
                { // swap only if i and j are different
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

                i++; // move i forward
            }

            j++; // always move j forward
        }

        // Print the array
        for (i = 0; i < a.length; i++)
            System.out.print(a[i] + "\t");
    }
}
