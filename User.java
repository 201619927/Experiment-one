package shiyan;
import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入您需要的算式个数");
			Scanner scanner=new Scanner(System.in);
			BuildSubject.number=scanner.nextInt();
			BuildSubject buildSubject=new BuildSubject();
			buildSubject.getDate();
			
	}

}
