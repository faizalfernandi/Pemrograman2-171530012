public class ExBreakUnlabel {
    public static void main(String[] args) {
        String names[] = {"Beah", "Bianca", "Lance", "Bellee", "Belle",
    						"Nico", "Yza", "Gem", "Ethan"};
    	String searchName = "yza";
    	Boolean foundName = false;
    	for ( int i=0; i < names.length; i++ ) {
    		if ( names[i].equals( searchName )) {
    			foundName = true;
    			break;
    		}
    	}
    	if ( foundName ) {
    		System.out.println( searchName + " found.");
    	}else{
    		System.out.println( searchName + " not found.");
    	}
    }
} 