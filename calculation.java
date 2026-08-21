import java.util.Scanner;
public class calculation {
    public static void main(String[] args) {
        Scanner Sc= new Scanner (System.in);
        System.out.println("Enter a number A:");
        float A =Sc.nextFloat();
        System.out.println("Select the operator ");
        char ch =Sc.next().charAt(0);
        System.out.println("Enter a number b:");
        float B= Sc.nextFloat();
        switch (ch){
            case '+':
                System.out.println("sum ="+(A+B));
                break;
                case'-':
                System.out.println("sub ="+(A-B));
                break;
                case'*':
                System.out.println("mult ="+(A*B));
                break;
                case'/':
                System.out.println("div ="+(A/B));
                break;
        }
Sc.close();
        
    }
    
}
