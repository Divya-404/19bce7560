import java.util.*;
class efficient {

	static int fibs(int n1) {
		
		int f[]=new int[n1+2];
		int i;
		
		f[0]=0;
		f[1]=1;
		for(i=2;i<=n1;i++) {
			f[i]=f[i-1]+f[i-2];
		}
		
		return f[n1];
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int N1=sc.nextLong();
		
		System.out.print("fibonacci of 10 is :-");
		for(int i=0;i<N1;i++) {
			System.out.print(fibs(i)+" ");
		

	}

}
}
