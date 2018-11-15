package ch4.bird;

public class Application {
	
	public static void main(String[] args) {
		AngryBird bird = new AngryBird();
		BadPig pig = new BadPig();
		
		bird.forward();
		bird.forward();
		bird.turnRight();
		bird.forward();
		
		pig.sound();		
	}

}
