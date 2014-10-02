
public class WrapperClass {
	
	private State mState;

	public void pushTheBar() {
		mState.pushTheBar(this);
	}

	public void insertCoin() {
		mState.insertCoin(this);
	}
	
	public WrapperClass() {
		mState = StateEnum.LOCKED;
	}
	
	public void setStateLocked(){mState = StateEnum.LOCKED;}
	public void setStateUnlocked(){mState = StateEnum.UNLOCKED;}

}
