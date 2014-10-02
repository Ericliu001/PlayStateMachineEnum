public enum StateEnum implements State {

	LOCKED {

		@Override
		public void pushTheBar(WrapperClass wrapper) {
			System.out.println("No use to push it, insert a coin, you fool");
		}

		@Override
		public void insertCoin(WrapperClass wrapper) {
			System.out.println("Thank you, you can push the bar now");
			wrapper.setStateUnlocked();
		}

	},

	UNLOCKED  {

		@Override
		public void pushTheBar(WrapperClass wrapper) {
			System.out.println("Only you can pass, not the next one.");
			wrapper.setStateLocked();
		}

		@Override
		public void insertCoin(WrapperClass wrapper) {
			System.out.println("You've already inserted one, how much do you want to pay?");
		}
	};
	
	
	
	
}
