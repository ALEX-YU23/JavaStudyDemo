/*
String���ͱ�����ʹ��
1.String���������������ͣ�����Ϊ���ַ���
2.����String���ͱ���ʱ��ʹ��һ��""
3.String���Ժ�8�ֻ����������ͱ��������㣬������ֻ�����������㣺+
4.��������Ȼ��String




*/





class StringTest {
	public static void main(String[] args) {
		
		String s1 = "Hello World!";

		System.out.println(s1);
		
		//char c = '';//���벻ͨ��
		//********************
		int number = 1001;
		String numberStr = "ѧ�ţ�";
		String info = numberStr + number;
		//System.out.println(info);
		boolean b1 = true;
		String info1 = info + b1;
		System.out.println(info1);
		//**********************
		//��ϰ1
		char c = 'a';//97  A:65
		int num = 10;
		String str = "hello";
		System.out.println(c + num + str);//107hello
		System.out.println(c + str + num);//ahello10
		System.out.println(c + (num + str));//a10hello
		System.out.println((c + num) + str);//107hello
		System.out.println(str + num + c);//hello10a



		//��ϰ2
		//*	*
		System.out.println("*	*");
		System.out.println("*"+'\t'+"*");
		System.out.println('*'+'\t'+'*');
		System.out.println("*"+"\t"+'*');





	}
}
