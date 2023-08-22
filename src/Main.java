import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int testCase= sc.nextInt();
        for(int i=0;i<=testCase;i++)
        {
            String input=sc.nextLine();
            if(i!=0)
            {
                String[] inputArr= input.split("\\s");
                int l=Integer.parseInt(inputArr[0]);
                int w=Integer.parseInt(inputArr[1]);
                int h=Integer.parseInt(inputArr[2]);
                if(l<=20&&w<=20&&h<=20)
                System.out.println("Case "+i+": good");
                else
                System.out.println("Case "+i+": bad");
            }
        }
    }
}
