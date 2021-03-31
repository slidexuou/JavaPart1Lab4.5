package BraekContinue;

public class Lab10 {
	public static void main(String[] args) {
		for (int countdown = 1; countdown <= 10; countdown++) {
			for (int i = 1; i <= 10; i++) {
				if (i == 2)
					continue;
				System.out.println("Value is " + i);
			}
		}
	}
}