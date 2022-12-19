import java.io.*;
class arr1
{
    public static void rotate(int a[],int n)
    {
        int b;
        b= a[n-1];
        for(int i=n-1;i>0;i--)
        {
            a[i]=a[i-1];
        }
        a[0]= b;
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter the size of the array");
        int n = Integer.parseInt(in.readLine());
        System.out.println("Enter the elements of array");
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(in.readLine());
        }
        rotate(a,n);
        for(int j=0;j<n;j++)
        {
            System.out.print(a[j]+" ");
        }
    }
}
