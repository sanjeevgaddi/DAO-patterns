import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int arr[]= {4,5,2,-2,-8,-1,10};
		Arrays.sort(arr);
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				count++;
				continue;
			}
			
		}
		int temp[]=new int[count];

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				temp[i]=arr[i];
			}
		}
		Arrays.sort(temp);
		for(int i=temp.length-1;i>=0;i--)
		{
			//System.out.print(temp[i]+" ");
			int j=0;
			System.out.print(arr[j]=temp[i]);
			j++;
		}
		
		for(int i=temp.length-1;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				continue;
			}
			else
			{
				arr[i]=arr[i];
				//System.out.print(arr[i]+" ");
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.print(arr[i]+" ");
		}
	}

}
