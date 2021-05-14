
public class PrimeNumbers {

	
	public static void generatePrime(int num) {
	
		//boolean array
		boolean prime[] = new boolean[num + 1];
		
		/** Generate all numbers from 2 to N,
		 * And mark all as prime for a start
		 */
		for(int i = 2; i <= num; i++) {
			prime[i] = true;
		}
		
		/** Run a loop from 2 to N/2
		 */
		for( int p = 2; p<= num/2; p++) {
			
			if(prime[p]) {
				
				for(int j = p; j * p <= num; j++) {
					prime[j * p] = false;
				}
			}
		}
		/** Run a loop from 2 to N and
		 *  print prime numbers
		 */
		for(int i = 2; i<= num; i++) {
			if(prime[i]) {
				System.out.println(i + " ");
			}
		}
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		generatePrime(30);
	}

}
