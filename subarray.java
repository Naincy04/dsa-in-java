import java.io.*;
public class subarray 
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
        System.out.println("Enter the value of sum");
        int s= Integer.parseInt(in.readLine());
        int k=0,p=0,m=0,c=0,b=0;
        for(int i=0;i<n;i++)
        {
            p=p+a[i];
            if(p==s)
            {
                m=i;
                c=m-1;
                b=m+1;
                break;
            }
            else if(p>s)
            {
                i=k++;
                p=0;
            }
        }
        
        System.out.println("index from where it started"+c);
        System.out.println("index from where it stop"+b);
    }
}
