package shiyan;
import java.util.Random;
public class BuildMath {
		Random random=new Random();
		public int number1=random.nextInt(101);//���������number1
		public int number2=random.nextInt(101);//���������number2
		public int prep=random.nextInt(101);//��������������Ƽӷ��ͼ��������ɸ���
	public String build()
	{
		if(prep<=50&&(number1+number2)<=100) 
		{
		return number1+"+"+number2+"=";
		}
		else if(prep>50&&(number1-number2)>=0)
		{
			return number1+"-"+number2+"=";
		}
		return null;
	}
	public int answer() 
	{
		if(prep<=50)
		return (number1+number2);
		else
			return(number1-number2);
		
	}
}
