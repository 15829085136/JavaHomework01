package bank;

public class Test {
	public static void main(String[] args) {
		DepositAccount saver=new DepositAccount(1234567890,"Zhangsan",5000,1.5);
		saver.setInterestRate(2.3);
		saver.deposit(2000);
		System.out.println("�����Ϣ"+saver.select());
		System.out.println("������"+saver.countYearInterest());
	}
}
