import java.io.*;
public class missinf 
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);                           
        System.out.println("Enter the size of array");
        int n= Integer.parseInt(in.readLine());
        int c=0;
        int[] a;
        a= new int[n-1]; 
        System.out.println("Enter the elements of array continuously but miss one number");
        for(int i=0;i<n-1;i++)
        {
            a[i]=Integer.parseInt(in.readLine());
        }
        System.out.println("Enter the maximum number you have entered");
        int m= Integer.parseInt(in.readLine());
        for(int i=1;i<=m;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(i==a[j])
                {
                    c++;
                }
            }
            if(c==0)
            {
                System.out.println("Missinnumber is "+i);
            }
            else 
            {
                c=0;
            }
        }
    }
}