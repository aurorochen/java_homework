package test03;
import java.util.Date;
import java.util.Scanner;

class Account{
	private int id;
	private double balance;
	private double annualInterestRate = 0;//��ǰ����
	private Date dateCreated;//��������
	Account(){//����Ĭ���˻����޲ι��췽��
	}
	Account(int id,double balance){//������id��balance�������˻�
	}
	int Getid(){//id������
		return id;
	}
	int Changeid(int new_id) {//id�޸���
		this.id = new_id;
		return id;
	}
	double Getbalance() {//balance��ȡ��
		return balance;
	}
	double Changebalance(double new_balance) {//balance�޸���
		this.balance=new_balance;
		return balance;
	}
	double GetannualInterestRate() {//annualInterestRate��ȡ��
		return annualInterestRate;
	}
	//annualInterestRate�޸���
	double ChangeannualInterestRate(double new_annualInterestRate) {
		this.annualInterestRate=new_annualInterestRate;
		return annualInterestRate;
	}
	//����ʱ���ȡ��
	String GetdateCreated(Date dateCraeted) {
		return dateCraeted.toString();
	}
	//�����ʻ�ȡ��
	double GetMonthlyInterestRate(double annualInterestRate) {
		return annualInterestRate/12;
	}
	//ȡǮ�������������ʾ
	void withDraw(double money) {
		if(money>balance) 
			System.out.println("���㣬��ǰ���Ϊ��"+balance);
		else {
			balance = balance - money;
			System.out.println("��ǰ���Ϊ��"+balance);
		}
	}
	//��Ǯ
	void deposit(double money) {
		balance = balance+money;
		System.out.println("���Ѵ���"+money+"Ԫ����ǰ���Ϊ��"+balance);
	}
}
public class test03_02 {
	public static void main(String[] args) {
		System.out.println("������ѡ��1.����Ĭ���˻���2.����id�˻�");
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		Account a = new Account();
		Date dateCreated = new Date();
		//�����޲��˻�
		if(count==1) {
			Account acc = new Account();
			Date date1 = new Date();
			dateCreated = date1;
			a = acc;
			System.out.println("�Ѵ������˻�");
		}
		//�����в��˻�
		else if (count==2) {
			System.out.println("������id:");
			int id = input.nextInt();
			System.out.println("�������˻���");
			double balance = input.nextDouble();
			//Account acc = new Account(id,balance);
			Date date2 = new Date();
			dateCreated = date2;
			a.Changeid(id);
			a.Changebalance(balance);
			System.out.println("�Ѵ������˻���");
		}
		//����������ֱ���˳�
		else {
			System.out.println("��������ȷѡ�");
			return;
		}
		//�˻�������ʾ���
		System.out.println("0���鿴��ǰid;1:�޸ĵ�ǰid;2:�鿴��ǰ��"
				+ "3���޸ĵ�ǰ��4���鿴��ǰ���ʣ�5���޸ĵ�ǰ����"+"\n"
				+ "6:�鿴�˻�����ʱ�䣻7���鿴�����ʣ�8��ȡǮ��9����Ǯ;-1:�˳�");
		int temp = input.nextInt();
		String status = "moving";//����������
		while(status=="moving") {
			if(temp==0) {//�鿴��ǰid
				System.out.println("��ǰid��"+a.Getid());
				status = "moving";
				System.out.println("��������룺");
				temp = input.nextInt();
			}
			if(temp==1) {//�޸ĵ�ǰid
				System.out.println("��������id");
				int new_id = input.nextInt();
				a.Changeid(new_id);
				System.out.println("��ǰidΪ��"+a.Getid());
				status = "moving";
				System.out.println("��������룺");
				temp = input.nextInt();
			}
			if(temp==2) {//�鿴��ǰ���
				System.out.println("��ǰ��"+a.Getbalance());
				status="moving";
				System.out.println("��������룺");
				temp = input.nextInt();
			}
			if(temp==3) {//�޸ĵ�ǰ���
				System.out.println("�����������");
				double new_balance = input.nextDouble();
				a.Changebalance(new_balance);
				System.out.println("��ǰ���Ϊ��"+a.Getbalance());
				status = "moving";
				System.out.println("��������룺");
				temp = input.nextInt();
			}
			if(temp==4) {//�鿴��ǰ����
				System.out.println("��ǰ���ʣ�"+a.GetannualInterestRate());
				status="moving";
				System.out.println("��������룺");
				temp = input.nextInt();
			}
			if(temp==5) {//�޸ĵ�ǰ����
				System.out.println("������������");
				double new_annualInterestRate = input.nextDouble();
				a.ChangeannualInterestRate(new_annualInterestRate);
				System.out.println("��ǰ����Ϊ��"+a.GetannualInterestRate());
				status = "moving";
				System.out.println("��������룺");
				temp = input.nextInt();
			}
			if(temp==6) {//�鿴����ʱ��
				System.out.println("����ʱ�䣺"+a.GetdateCreated(dateCreated));
				status="moving";
				System.out.println("��������룺");
				temp = input.nextInt();
			}
			if(temp==7) {//����������
				double an = a.GetannualInterestRate();
				System.out.println("������Ϊ��"+a.GetMonthlyInterestRate(an));
				status = "moving";
				System.out.println("��������룺");
				temp = input.nextInt();
			}
			if(temp==8) {//ȡǮ
				System.out.println("������Ҫȡ���٣�");
				double money = input.nextDouble();
				a.withDraw(money);
				status = "moving";
				System.out.println("��������룺");
				temp = input.nextInt();
			}
			if(temp == 9 ) {//��Ǯ
				System.out.println("������Ҫ����٣�");
				double money = input.nextDouble();
				a.deposit(money);
				status = "moving";
				System.out.println("��������룺");
				temp = input.nextInt();
			}
			if(temp==-1) {//����
				System.out.println("����");
				status = "stop";
			}
		}
	}
}
