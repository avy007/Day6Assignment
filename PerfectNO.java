package Day6Assingment;

public class PerfectNO {
	
    public static void main(String[] args) {
    	
    	

        System.out.println("perfect numbers :");
        for (int i = 1; i < 10; i++) {

            checkPerfectNumber(i);
        }

    }
    static void checkPerfectNumber(int n){
        int sum=0;
        for (int i = 1; i < n; i++) {
            if (n%i == 0) {
                sum=sum+i;
            }
        }

        if (sum == n) {
            System.out.println(n);
        }
    }

}
