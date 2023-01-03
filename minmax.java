import java.io.*;
public class minmax 
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);                           
        System.out.println("Enter the size of array");
        int n= Integer.parseInt(in.readLine());
        int[] a;
        a= new int[n]; 
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(in.readLine());
        }
        int min=a[0];
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(min>a[i])
            {
                min=a[i];
            }
            if(max<a[i])
            {
                max=a[i];
            }
        }
        System.out.println("Minimum element in the array- is"+min);
        System.out.println("Maximum element in the array is"+max);
    }
}
