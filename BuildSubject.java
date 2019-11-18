package shiyan;

public class BuildSubject {
	public static int number;//控制生成算式的数量
	BuildMath[] buildMath=new BuildMath[number];//构造对象数组来存储算式信息
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
			i--;//释放原有对象，为p[i]建立新对象
	}
	count=0;
	for(int i=0;i<number;i++)
	{
		System.out.printf("%-10s",buildMath[i].answer()+"    ");
		count++;
		buildMath[i]=null;//释放对象占用堆内存
		if(count%5==0)
			System.out.println();
	}
}
	public BuildMath[] kk() {
		return buildMath;
	}
}