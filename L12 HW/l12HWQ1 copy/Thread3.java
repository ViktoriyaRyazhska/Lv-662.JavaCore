package l12HWQ1;

public class Thread3 {
	public class t3 extends Thread {
		public void run () {
			long n = 0;
			for (int i = 0; i > -1000; --i) {
				n *= i;
			}
			System.out.println(n);
		}
	}
}
