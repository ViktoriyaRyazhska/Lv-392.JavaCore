package task1;

public class Main {
	public static void main(String[] args) {
		Bird[] bird = new Bird[4];
		bird[0] = new Eagle("Eagles has Brown feathers", " and lay just 1 egg");
		bird[1] = new Penguin("Penguin has white feathers", " and lay just 1 egg");
		bird[2] = new Swallow("Swallow has black feathers", " and lay a couple eggs");
		bird[3] = new Chicken("Chicken has yellow feathers", " and lay 5 or more eggs");
		
		for (int i = 0; i < bird.length; i++) {
			if(bird[i] instanceof FlyingBird) {
				((FlyingBird) bird[i]).fly();
			} else if(bird[i] instanceof NonFlyingBird) {
				((NonFlyingBird) bird[i]).fly();
			}
			System.out.println(bird[i]);
		}
		
	}
}
