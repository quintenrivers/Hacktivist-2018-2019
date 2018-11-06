public class main {
	public static void main(String[] args) {
		Fruit lenny = new Fruit("Leonard");

		// CALLING A METHOD OF LENNY FRUIT OBJECT
		System.out.println(lenny.get_name());

		// CAN ACCESS THIS VARIABLE BECAUSE IT'S PUBLIC
		System.out.println(lenny.is_sweet);

		lenny.print_count();

		// System.out.println(lenny.name);
		// System.out.println(lenny.test);
		// THROWS ERROR BECAUSE NAME VARIABLE IS PRIVATE

		Fruit gerald = new Fruit("Young Gerald");
		gerald.print_count();


		lenny.print_count();
		// COUNT IS THE SAME FOR BOTH BECAUSE IT IS STATIC

		Apple applyrs = new Apple();
		applyrs.set_name("Applyrs");
		applyrs.print_count();
		applyrs.take_bite();
	}
}
