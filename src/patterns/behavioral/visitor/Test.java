package patterns.behavioral.visitor;

public class Test {

	public static void main(String[] args) {
		Feeder dogFeeder = new DogFeeder();
		Feeder catFeeder = new CatFeeder();
		
		Animal a = new Dog("karabas");
		a.accept(dogFeeder);
//		a.accept(catFeeder);

		a = new Cat("sarman");
//		a.accept(dogFeeder);
		a.accept(catFeeder);
	}
}
