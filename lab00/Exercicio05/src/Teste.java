
public class Teste {
	public static void main(String[] args) {
		int n = 100;
		for(int i=2; i<=n; ++i) {
			if(isPrimo(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean isPrimo(int n) {
		for(int i=2; i<n; ++i) {
			if(n%i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
