package l12HWQ1;

public class Thread2 {
	public class t2 extends Thread {
		public void run() {
			long n = 0;
			for (int i = 0; i < 1000; ++i) {
				n *= i;
			}
			System.out.println(n);
		}
	}
}
