
public class Rysowanie {
	private int len;

	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public Rysowanie(int len) {
		this.len = len;
	}
	int zmienna1;
	int zmienna2;
	public void funkcja() {
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - i; j++) {
				System.out.print(' ');
			}
			for(int j = 0; j <= i * 2; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
	}

}
