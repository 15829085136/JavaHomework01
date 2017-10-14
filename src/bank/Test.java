package bank;

public class Test {
	public static void main(String[] args) {
		DepositAccount saver=new DepositAccount(1234567890,"Zhangsan",5000,1.5);
		saver.setInterestRate(2.3);
		saver.deposit(2000);
		System.out.println("余额信息"+saver.select());
		System.out.println("年利率"+saver.countYearInterest());
	}
}
