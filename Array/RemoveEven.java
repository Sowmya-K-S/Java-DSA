
//Remove even numbers from array

public class RemoveEven
{
    public static void main(String[] args) 
    {
        int [] num = {1,2,3,4,5,6,7,8,9,10};
        int oddCount = 0;

        // find odd count
        for(int i=0;i<num.length;i++)
        {
            if(num[i] % 2 != 0)
                oddCount++;
                
        }

        //
        int[] oddArray = new int[oddCount];
        int index = 0;
        for(int i=0;i<num.length;i++)
        {
            if(num[i] % 2 != 0)
                oddArray[index++] = num[i]; 
        }

        for(int i = 0; i<oddArray.length;i++)
            System.out.print(oddArray[i]+"\t");
        

    }
}