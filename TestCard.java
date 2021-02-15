package Inheritance_Abstraction;

public class TestCard {

	public static void main(String[] args) {
			
			TravelCard c=new TravelCard();
			System.out.println("The reward points you earned are "+c.getRewardPoints(100));
			System.out.println("Congratulations,you have successfully recharged with "+c.rechargeCard(20000));
			System.out.println(c.swipeCard(20));
			System.out.println(c.travelSwipe(10));
			
			c.setCardNo(123456789);
			c.setSwipeLimit(49000);
		
			System.out.println("Your Card Number is "+c.getCardNo());
			System.out.println("Your Daily Swipe limit is "+c.getSwipeLimit());	

	}

}
