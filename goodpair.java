package sample;
public class goodpair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		int max =a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]>max)
				max=a[i];
			if (a[i]<min) 
				min=a[i];
	     }
			System.out.println("max element"+max);
			System.out.println("min element"+min);
		    System.out.println(max+min);
		}
	

	}


