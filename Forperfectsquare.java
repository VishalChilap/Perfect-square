package Demo16jan.Forloops;

public class Forperfectsquare {

	public static void main(String[] args) {
		int num = 25;
		int count = 0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count = count+1;
			}
		}if (count%2==0) {
			System.out.println(" Not Perfect square");
		}else {
			System.out.println("Perfect square");
		}

	}

}
