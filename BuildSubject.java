package shiyan;

public class BuildSubject {
	public static int number;//����������ʽ������
	BuildMath[] buildMath=new BuildMath[number];//��������������洢��ʽ��Ϣ
	public void getDate() {
		int count=0;
	for(int i=0;i<number;i++)
	{
		buildMath[i]=new BuildMath();
		if(buildMath[i].build()!=null) 
		{
			count++;
			System.out.printf("%-10s",buildMath[i].build()+"    ");
			if(count%5==0)
			System.out.println();
		}
		else
			i--;//�ͷ�ԭ�ж���Ϊp[i]�����¶���
	}
	count=0;
	for(int i=0;i<number;i++)
	{
		System.out.printf("%-10s",buildMath[i].answer()+"    ");
		count++;
		buildMath[i]=null;//�ͷŶ���ռ�ö��ڴ�
		if(count%5==0)
			System.out.println();
	}
}
	public BuildMath[] kk() {
		return buildMath;
	}
}