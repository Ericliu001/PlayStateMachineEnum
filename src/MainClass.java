
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WrapperClass stateMachine = new WrapperClass();
		
		stateMachine.insertCoin();
		stateMachine.pushTheBar();
		
		stateMachine.pushTheBar(); // to be rejected
		
		stateMachine.insertCoin(); // now you can pass
		stateMachine.insertCoin(); // too many coins!
		
		stateMachine.pushTheBar();
	}

}
