/*
��δӼ��̻�ȡ��ͬ���͵ı���:��Ҫʹ��Scanner��

����ʵ�ֲ���:
1.����: import java.util.Scanner;
2.Sacnner��ʵ����:		Scanner scan = new Scanner(System.in);
3.����Scanner�����ط���,��ָ�����͵ı���.

ע��:
��Ҫ������Ӧ�ķ���,������ָ�����͵�ֵ.������������������Ҫ������Ͳ�ƥ��ʱ,
�ᱨ�쳣:InputMisMatchExcetion ���³�����ֹ.

*/

//1.����: import java.util.Scanner;
import java.util.Scanner;

class ScannerTest{
	public static void main(String[] args){
		
		//2.Sacnner��ʵ����:
		Scanner scan = new Scanner(System.in);
		//3.����Scanner�����ط���
		System.out.println("�������������:");
		String name = scan.next();
		System.out.println(name);

		System.out.println("�������������:");
		int age = scan.nextInt();
		System.out.println(age);

		System.out.println("�������������:");
		double weight = scan.nextDouble();
		System.out.println(weight);

		System.out.println("���Ƿ�����������?(ture/false)");
		boolean isLove = scan.nextBoolean();
		System.out.println(isLove);


		//����char�͵Ļ�ȡ,Scannerû���ṩ��صķ���,ֻ�ܻ�ȡһ���ַ���
		System.out.println("����������Ա�:(��/Ů)");
		String gender = scan.next();//"��"
		char genderChar = gender.charAt(0);//��ȡ����Ϊ0λ���ϵ��ַ�
		System.out.println(genderChar);



	}
}