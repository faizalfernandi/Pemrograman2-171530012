public class ExContinueUnlabel {
    public static void main(String[] args) {
        String nama[] = {"Beah","Bianca","Lance","Beah","Beah"};
        int count = 0;
        for ( int i=0; i<nama.length; i++ ) {
        	if (!nama[i].equals("Beah")) {
        		continue;
        	}
        	count++;
        }
        System.out.println("Thre are" +" "+ count +" "+ "Beahs in the list");
    }
} 