package JavaSE8;

interface Eatable {
	abstract public void eat();
}

class AnnonymousInnerDemo {
	public static void main(String args[])

	{

		Eatable e = new Eatable()

		{

			public void eat() {

				System.out.println("Nice fruits");

			}

		};
		e.eat();
	}
}
