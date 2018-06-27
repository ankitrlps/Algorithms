package algorithms;

public class MultiplesOf3And5 {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		int sum = 0;
		for(int i = 0; i<1000; i++){
			if((i%x)==0 || (i%y)==0){
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
