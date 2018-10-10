import java.io.*;

public class Percobaan2 {
    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader ( new InputStreamReader(System.in));

        String nim = "", nama="", tempat="", tglLahir="";
        System.out.print("Masukn Nama Anda : ");
        	nama = dataIn.readLine();
        System.out.println("Masukan NIM Anda : ");
        	nim = dataIn.readLine();
        System.out.println("Masukan Tempat Lahir Anda : ");
        	tempat = dataIn.readLine();
        System.out.println("Masukan Tanggal Lahir Anda : ");
        	tglLahir = dataIn.readLine();


        System.out.println("");
        System.out.println("______________________________________");
        System.out.println("______________________________________");

        System.out.println("Selamat Datan" + nama );
        System.out.println("NIM : " + nim);
        System.out.println("Tempat Lahir :" + tempat);
        System.out.println("Tanggal Lahir :" + tglLahir);
    }
} 