import java.util.Scanner;
public class Main {
    public static void main(String args[] ) throws Exception {
        for(int i=1;i<3;i++){
	Scanner scanner = new Scanner(System.in);
        System.out.print("�g������͂��Ă�������(m):");
        double height = scanner.nextDouble();
        System.out.print("�̏d����͂��Ă�������(kg):");
        double weight = scanner.nextDouble();
        double bmi = weight / (height * height);
        double a = ((double)Math.round(bmi * 100))/100;
        System.out.println("bmi:"+a);
	}
	}
}
