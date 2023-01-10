package arrays_string;
public class rs {
	public static void main(String[] args)
	{
		int[] a = { 1, 2, 3, 4, 5 };
		for (int n = 1; n >0; n--) 
		{
			int temp = a[4];
			for (int i = 3; i >=0; i--) 
			{
				a[i+1] = a[i];
			}
			a[0] = temp;
		}
		for (int b : a)
			System.out.println(b);
	}
}
