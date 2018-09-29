public class ExContinueLabel {
    public static void main(String[] args) {
        outerloop;
        for ( int i=0; i<5; i++ ) {
        	for ( int j=0; j<5; j++ ) {
        		
        		System.out.println("Inside for (j) Loop");
        		if ( j==2 ) continue outerloop;
        	}

        	System.out.println("Inside for (i) Loop");
        }
    }
} 