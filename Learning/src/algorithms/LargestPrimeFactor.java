package algorithms;

public class LargestPrimeFactor {
	public static void main(String[] args) {
		LargestPrimeFactor l = new LargestPrimeFactor();
		System.out.println(l.compute(600851475143L));
	}
	
	private long compute(long num) {
		
		try {
			
			if(num%2L == 0){
				
			}
			
			for (long i = 3L; i < Math.sqrt(num); i++) {
				if ((num % i) == 0) {
					num = num/i;
				}
			}
		} catch (ArithmeticException e) {
			System.out.println(e);
		}catch(Exception e1){
			System.out.println(e1);
		}
		return num;
		
	}
}