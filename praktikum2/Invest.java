public class Invest {
	public static void main(String[] argument) {
		float total = 14000;
		System.out.println("Original Investment: $" + total);

		//inceses by 40 perent the first year total = total + (total * .4F);
		total = total + (total * .4F);
		System.out.println("After one year : $" + total);

		//loses $1,500 the second year total = total - 1500F;
		total = total - 1500F;
		System.out.println("After two year: $" + total);

		//Increses by be 12 perent the third year total = total + (total * .12F);
		total = total + (total * .12F);
		System.out.println("After three year: $" + total);

	}
}