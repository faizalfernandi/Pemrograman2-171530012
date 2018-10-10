public class DemoArray {
    public static void main(String[] args) {
        System.out.println("\nContoh 1\n");

        String nama[] = new String[5];
        nama[0] = "Andi Novianto";
        nama[1] = "Zidha Aisya";

        System.out.println("\n\nContoh2\n");
        int nilai[] = {75,80,90,100};
        System.out.println("Cetak Nilai Element 0 : " + nilai[0]);
        System.out.println("Cetak Nilai Element 1 : " + nilai[1]);
        System.out.println("Cetak Nilai Element 2 : " + nilai[2]);
        System.out.println("Cetak Nilai Element 3 : " + nilai[3]);
        int jumlah = nilai[1] + nilai[2] + nilai[3];
        System.out.println("jumlah Nilai Element ( 1 + 2 + 3 ) : " + jumlah);

    }
} 

/*
	1.Membuat class baru dengan nama DemoArray dengan modifier public
	2.Membuat method main yang berfungsi sebagai method yang pertama kali dijalankan
	5.Deklarasi variabel array dengan nama nama,tipe data string, dan panjangnya 5
	6.Memberikan nilai pada array nama.
	10.Mendeklarasikan variabel array dengna nama nilai,tipe data int dan panjangnya 4 yang langsung diinisialisasikan
	15.Penjumlahan array.

*/