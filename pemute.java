import java.util.Scanner;


public class permute {

	public void permut(StringBuilder a, int i, int n){
		int j;
		if(i==n){
			System.out.println(a);
		}
		else{
			for(j=i;j<=n;j++){
				swap(a, i, j);
				permut(a, i+1, n);
				swap(a, i, j);
				
			}
		}
	}

	private void swap(StringBuilder b, int i, int j) {
		// TODO Auto-generated method stub
		
		char t=b.charAt(i);
		b.setCharAt(i, b.charAt(j));
		b.setCharAt(j, t);
	}
	public static void main(String ar[]){
		System.out.println();
		permute as=new permute();
		Scanner in=new Scanner(System.in);
		String a=in.nextLine();
		StringBuilder a1 = new StringBuilder(a);
		as.permut(a1,0,a1.length()-1);
	}
}
