public class DemoArray3 {
    public static void main(String[] args) {
        // Contoh Program Pencarian

        String names[] = {"Ai","Aji","Abbi","Abdul","Hasif"};
        String searcName = "Abbi";
        boolean foundName = false;

        for ( int i = 0; i<names.length ; i++ ) {
        	if (names[i].equals( searcName )) {
        		foundName = true;
        		break;
        	}
        }

        if ( foundName ) {
        	System.out.println( searcName + " " + "Found!");
        }else{
        	System.out.println( searcName + " Not Found!");
        }
    }
} 