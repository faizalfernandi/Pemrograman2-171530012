public class Penjualan {
	public static void main(String[] args) {

		short a = 10000;
		short b = 12000;
		short c = 13000;
		short d = 10000;
		short e = 5000;

		double hasil = a+b+c+d+e;

		System.out.println("Total Penjualan = " + hasil);
		
		int uang = 100000;

		float kembalian = (float)uang - (float)hasil;

		System.out.println("kembalian adalah = " + kembalian);

	}
}