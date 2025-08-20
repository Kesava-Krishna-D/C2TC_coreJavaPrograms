package abstract_example;

public class TechTrainer extends Trainer {
	
	@Override
	public void session() {
		System.out.println("Java session is going on");
	}
	
	@Override
	public void checks() {
		System.out.println("Assignment given from inheritence");
	}

}