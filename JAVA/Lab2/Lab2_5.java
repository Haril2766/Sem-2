 import java.util.Scanner;
public class Lab2_5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter fehrenhait vaule:");

        double vaule=sc.nextDouble();
        double vauleFinal=(vaule-32)*5/9;

        
        System.out.println("Temperature in celsius is: " + vaule);
        

    }
    
}

