public class SubArray {

	public static void main(String[] args) {
		int arr[]= {2,4,6,8,10,12,14};
		
		for(int k=0;k<arr.length;k++)
		{
		for(int i=k;i<arr.length;i++)
		{
			for(int j=k;j<=i;j++)
			{
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		}
		
	}

}
