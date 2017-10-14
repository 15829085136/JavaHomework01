package bank;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DepositAccount {
	private int account;
	private String userName;
	private String password;
	private double balance;//余额
	private static double interestRate;//年利率
	private double yearInterest;//年利息
	private double monthInterest;//月利息
	private double time;//存款时间
	
	public DepositAccount(int account, String userName, double balance,double time) {
		this.account = account;
		this.userName = userName;
		this.balance = balance;
		this.time=time;
	}
	public DepositAccount(int account, String userName,String password, double balance,double time) {
		this.account = account;
		this.userName = userName;
		this.password=password;
		this.balance = balance;
		this.time=time;
	}
	//开户
	public DepositAccount newUser(int account,String userName,String password,double balance,int time){
		DepositAccount a=new DepositAccount(account,userName,password,balance,time);
		return a;
	}
	//存款
	public void deposit(double money){
		this.balance+=money;
	}
	//查询
	public String select(){
		return "账户"+this.account+"--"+"储户姓名"+this.userName+"--"+"账户余额"+this.balance+"--"+"年利率"+interestRate;
	}
	//设置年利率
	public void setInterestRate(double interestRate){
		DepositAccount.interestRate=interestRate/100;
	}
	//计算年利息
	public double countYearInterest(){
		
		return this.yearInterest=interestRate*balance;
	}
	//计算月利息
	public double countMonthInterest(){
		return this.monthInterest=interestRate/12*balance;
	}

}
