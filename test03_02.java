package test03;
import java.util.Date;
import java.util.Scanner;

class Account{
	private int id;
	private double balance;
	private double annualInterestRate = 0;//当前利率
	private Date dateCreated;//开户日期
	Account(){//创建默认账户的无参构造方法
	}
	Account(int id,double balance){//创建带id和balance参数的账户
	}
	int Getid(){//id访问器
		return id;
	}
	int Changeid(int new_id) {//id修改器
		this.id = new_id;
		return id;
	}
	double Getbalance() {//balance获取器
		return balance;
	}
	double Changebalance(double new_balance) {//balance修改器
		this.balance=new_balance;
		return balance;
	}
	double GetannualInterestRate() {//annualInterestRate获取器
		return annualInterestRate;
	}
	//annualInterestRate修改器
	double ChangeannualInterestRate(double new_annualInterestRate) {
		this.annualInterestRate=new_annualInterestRate;
		return annualInterestRate;
	}
	//创建时间获取器
	String GetdateCreated(Date dateCraeted) {
		return dateCraeted.toString();
	}
	//月利率获取器
	double GetMonthlyInterestRate(double annualInterestRate) {
		return annualInterestRate/12;
	}
	//取钱，余额不够则输出提示
	void withDraw(double money) {
		if(money>balance) 
			System.out.println("余额不足，当前余额为："+balance);
		else {
			balance = balance - money;
			System.out.println("当前余额为："+balance);
		}
	}
	//存钱
	void deposit(double money) {
		balance = balance+money;
		System.out.println("您已存入"+money+"元，当前余额为："+balance);
	}
}
public class test03_02 {
	public static void main(String[] args) {
		System.out.println("请问您选择：1.创建默认账户。2.创建id账户");
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		Account a = new Account();
		Date dateCreated = new Date();
		//构造无参账户
		if(count==1) {
			Account acc = new Account();
			Date date1 = new Date();
			dateCreated = date1;
			a = acc;
			System.out.println("已创建好账户");
		}
		//构造有参账户
		else if (count==2) {
			System.out.println("请输入id:");
			int id = input.nextInt();
			System.out.println("请输入账户余额：");
			double balance = input.nextDouble();
			//Account acc = new Account(id,balance);
			Date date2 = new Date();
			dateCreated = date2;
			a.Changeid(id);
			a.Changebalance(balance);
			System.out.println("已创建好账户。");
		}
		//输入有误则直接退出
		else {
			System.out.println("请输入正确选项。");
			return;
		}
		//账户操作提示语句
		System.out.println("0：查看当前id;1:修改当前id;2:查看当前余额；"
				+ "3：修改当前余额；4：查看当前利率；5：修改当前利率"+"\n"
				+ "6:查看账户创建时间；7：查看月利率；8：取钱；9：存钱;-1:退出");
		int temp = input.nextInt();
		String status = "moving";//操作控制器
		while(status=="moving") {
			if(temp==0) {//查看当前id
				System.out.println("当前id："+a.Getid());
				status = "moving";
				System.out.println("请继续输入：");
				temp = input.nextInt();
			}
			if(temp==1) {//修改当前id
				System.out.println("请输入新id");
				int new_id = input.nextInt();
				a.Changeid(new_id);
				System.out.println("当前id为："+a.Getid());
				status = "moving";
				System.out.println("请继续输入：");
				temp = input.nextInt();
			}
			if(temp==2) {//查看当前余额
				System.out.println("当前余额："+a.Getbalance());
				status="moving";
				System.out.println("请继续输入：");
				temp = input.nextInt();
			}
			if(temp==3) {//修改当前余额
				System.out.println("请输入新余额");
				double new_balance = input.nextDouble();
				a.Changebalance(new_balance);
				System.out.println("当前余额为："+a.Getbalance());
				status = "moving";
				System.out.println("请继续输入：");
				temp = input.nextInt();
			}
			if(temp==4) {//查看当前利率
				System.out.println("当前利率："+a.GetannualInterestRate());
				status="moving";
				System.out.println("请继续输入：");
				temp = input.nextInt();
			}
			if(temp==5) {//修改当前利率
				System.out.println("请输入新利率");
				double new_annualInterestRate = input.nextDouble();
				a.ChangeannualInterestRate(new_annualInterestRate);
				System.out.println("当前利率为："+a.GetannualInterestRate());
				status = "moving";
				System.out.println("请继续输入：");
				temp = input.nextInt();
			}
			if(temp==6) {//查看创建时间
				System.out.println("创建时间："+a.GetdateCreated(dateCreated));
				status="moving";
				System.out.println("请继续输入：");
				temp = input.nextInt();
			}
			if(temp==7) {//计算月利率
				double an = a.GetannualInterestRate();
				System.out.println("月利率为："+a.GetMonthlyInterestRate(an));
				status = "moving";
				System.out.println("请继续输入：");
				temp = input.nextInt();
			}
			if(temp==8) {//取钱
				System.out.println("请问您要取多少？");
				double money = input.nextDouble();
				a.withDraw(money);
				status = "moving";
				System.out.println("请继续输入：");
				temp = input.nextInt();
			}
			if(temp == 9 ) {//存钱
				System.out.println("请问您要存多少？");
				double money = input.nextDouble();
				a.deposit(money);
				status = "moving";
				System.out.println("请继续输入：");
				temp = input.nextInt();
			}
			if(temp==-1) {//结束
				System.out.println("结束");
				status = "stop";
			}
		}
	}
}
