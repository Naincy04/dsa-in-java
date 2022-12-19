import java.io.*;
public class binary_search 
{
    public static int binarysearch(int a[],int n,int x)
    {
        int low=0;
        int high= n-1;
        int pos=-1;
        while(low<=high)
        {
            int mid= (low+high)/2;
            if(a[mid]==x)
            {
                pos=mid;
                break;
            }
            else if(a[mid]<x)
            {
                low=mid+1;
            }
            else 
            {
                high=mid-1;
            }
        }
        return pos;
    }

    public static void main(String args[])throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter the element to be found");
        int x= Integer.parseInt(in.readLine());
        System.out.println("Enter the size of the array");
        int n = Integer.parseInt(in.readLine());
        System.out.println("Enter the elements of array");
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(in.readLine());
        }
        int k = binarysearch(a,n,x);
        System.out.println("Index of the element in array is "+k);
    }
}
