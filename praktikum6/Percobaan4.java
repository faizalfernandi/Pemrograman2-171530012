import javax.swing.JOptionPane;

public class Percobaan4 {
    public static void main(String[] args){
        

        String nim;
        String nama; 
        String tempat;
        String tglLahir;
        String msg;

       
       nama = JOptionPane.showInputDialog("Masukan Nama Anda :");
       nim = JOptionPane.showInputDialog("Masukan nim Anda :");
       tempat = JOptionPane.showInputDialog("Masukan tempat Anda :");
        tglLahir = JOptionPane.showInputDialog("Masukan tglLahir Anda :");
      msg = "hello" + " " + nama + "!" + "\n" + "NIM anda :" + nim + "\n"
      + "Tempat Lahir Anda :" + " " + tempat + "\n" + "Tanggal Lahir Anda :" + tglLahir;
       JOptionPane.showMessageDialog(null,msg);
      



    }
} 