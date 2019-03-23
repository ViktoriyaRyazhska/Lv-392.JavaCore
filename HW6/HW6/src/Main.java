
public class Main {

	public static void main(String[] args) {
		
		Bird bird [] = new Bird[4];
		
		bird[0] = new Eagle(true, true);
		bird[1] = new Swallow(true, true);
		bird[2] = new Penguin(false, true);
		bird[3] = new Chicken(true, true);
		
		for(int i = 0; i<bird.length; i++) {
			if (bird[i] instanceof FlyingBird) {
				((FlyingBird) bird[i]).fly();
			}
			else if(bird[i] instanceof NonFlyingBird) {
				((NonFlyingBird) bird[i]).fly();
				}
		}

	}
}




