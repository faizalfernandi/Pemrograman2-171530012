public class DemoCasting{
    public static void main(String[] args){
        // class implisit
        byte b = 100;
        int i = b;

        // casting eksplisit
        int x = 1000;
        byte y = (byte) x;
        System.out.println("Casting byte :" + y);

        double j = 10.5;
        int k = (int) j;
        System.out.println("Casting byte :" + k);

         j = 10.2;
        int l = (int) j;
        System.out.println("Casting byte :" + l);

         j = 10.8;
        short m = (short) j;
        System.out.println("Casting byte :" + m);
    }
}