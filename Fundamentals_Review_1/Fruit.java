public class Fruit {
	public    boolean is_sweet = true;
	static    int     count    = 0;
	protected String  name     = "Fruit";
	private   String  test     = "Dis Ain't It Chief";

	public Fruit() {
		count++;
	}

	public Fruit(String name) {
		this.name = name;
		count++;
	}

	public int get_count() {
		return count;
	}

	public void print_count() {
		System.out.println("There are " + count + " total fruit including " + name);
	}

	public String get_name() {
		return name;
	}

	public void set_name(String name) {
		this.name = name;
	}
}
