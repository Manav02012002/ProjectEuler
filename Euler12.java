import java.util.ArrayList;
import java.util.List;

public class Euler12 {

	public static void main(String[] args) 
    {
        
		int t = 500;
		long n = 1;
		long tn = 0;
		int c = 0;
		while (true)
        {
        	tn = (n) * (n + 1) / 2;
			c = getCountofDivisors(tn);

			if (c > t) {
				System.out.println(tn);
				break;
			}
			n++;
		}

	}

	private static int getCountofDivisors(long tn) {

		long limit = (long) Math.sqrt(tn);
		List<Long> list = new ArrayList<>();
		long temp = 0;
		for (long i = 1; i <= limit; i++) {
			if (tn % i == 0) {
				list.add(i);
				temp = tn / i;
				if (i != temp) {
					list.add(temp);
				}
			}
		}
		int divisors = list.size();
		return divisors;
	}

}