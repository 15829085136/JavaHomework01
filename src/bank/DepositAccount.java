package bank;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DepositAccount {
	private int account;
	private String userName;
	private String password;
	private double balance;//���
	private static double interestRate;//������
	private double yearInterest;//����Ϣ
	private double monthInterest;//����Ϣ
	private double time;//���ʱ��
	
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
	//����
	public DepositAccount newUser(int account,String userName,String password,double balance,int time){
		DepositAccount a=new DepositAccount(account,userName,password,balance,time);
		return a;
	}
	//���
	public void deposit(double money){
		this.balance+=money;
	}
	//��ѯ
	public String select(){
		return "�˻�"+this.account+"--"+"��������"+this.userName+"--"+"�˻����"+this.balance+"--"+"������"+interestRate;
	}
	//����������
	public void setInterestRate(double interestRate){
		DepositAccount.interestRate=interestRate/100;
	}
	//��������Ϣ
	public double countYearInterest(){
		
		return this.yearInterest=interestRate*balance;
	}
	//��������Ϣ
	public double countMonthInterest(){
		return this.monthInterest=interestRate/12*balance;
	}

}
