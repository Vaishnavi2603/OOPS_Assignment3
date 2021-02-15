package Inheritance_Abstraction;

abstract class PrepaidCard {
	
	int CardNo;
	double availableBalance = 0;
	double swipeLimit;
	abstract boolean swipeCard(int amount);
	
	public int getCardNo() {
		return CardNo;
	}

	public void setCardNo(int cardNo) {
		CardNo = cardNo;
	}

	public double getSwipeLimit() {
		return swipeLimit;
	}

	public void setSwipeLimit(double swipeLimit) {
		this.swipeLimit = swipeLimit;
	}

	@Override
	public String toString() {
		return "PrepaidCard [CardNo=" + CardNo + ", availableBalance=" + availableBalance + ", swipeLimit=" + swipeLimit
				+ "]";
	}
	public double rechargeCard(int amount) {
		return availableBalance+=amount;
	}

}
