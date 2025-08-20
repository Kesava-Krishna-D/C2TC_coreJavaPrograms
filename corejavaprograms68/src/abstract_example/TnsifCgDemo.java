package abstract_example;

public class TnsifCgDemo {
	public static void main(String[] args)
	{
		Trainer t=new TechTrainer();
		
		t.session();
		t.session();
		
		t=new SoftSkillTrainer();
		
		t.session();
		t.session();
	}
}
