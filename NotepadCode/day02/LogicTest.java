/*
�����֮�ģ��߼������
&   &&   |   ||   !   ^

˵����
1.�߼�����������Ķ���boolean���͵ı���






*/




class LogicTest {
	public static void main(String[] args) {
		/*
		
		����&  ��   &&
		��ͬ��1��&  ��  && ����������ͬ
		��ͬ��2�������������trueʱ�����߶���ִ�з�����ߵ�
		����
		��ͬ�㣺���������Ϊfalseʱ��&����ִ�з����ұߵ����㡣


		*/
		boolean b1 = true;
		int num1 = 10;
		if(b1 & (num1++ > 0)){
			System.out.println("�������ڱ���");
		}else{
			System.out.println("���������Ͼ�");
		}
		System.out.println("num1:" + num1);
		
		boolean b2 = true;
		int num2 = 10;
		if(b2 && (num2++ > 0)){
			System.out.println("������������");
		}else{
			System.out.println("�������ڶ���");
		}
		System.out.println("num2:" + num2);
		
System.out.println();
System.out.println();

		/* 
		���֣� |  ��   ||
		��ͬ��1��|  ��  || ����������ͬ
		��ͬ��2�������������falseʱ�����߶���ִ�з�����ߵ�
		����
		��ͬ�㣺���������Ϊtrueʱ��&����ִ�з����ұߵ����㡣
		�������Ƽ���·�� 
		*/

		boolean b3 = true;
		int num3 = 10;
		if(b3 | (num3++ > 0)){
			System.out.println("�������ڱ���");
		}else{
			System.out.println("���������Ͼ�");
		}
		System.out.println("num3 = "+ num3);



		boolean b4 = true;
		int num4 = 10;
		if(b4 || (num4++ > 0)){
			System.out.println("�������ڱ���");
		}else{
			System.out.println("���������Ͼ�");
		}
		System.out.println("num4 = "+ num4);



	}
}
