import java.util.*;
public class Calc{
    static public void main(String[] args){
        Scanner read = new Scanner(System.in);
        Number n1 = new Number();
        Number n2 = new Number();
        Number soma = new Number();
        String i;
        do{
            System.out.printf("%nWhat is first number? ");
            n1.setValue(read.nextInt());
            System.out.printf("%nWhat is second number? ");
            n2.setValue(read.nextInt());
            soma.setValue(n1.getValue()+n2.getValue());
            System.out.printf("%nThe result between %d and %d is %d",n1.getValue(),n2.getValue(),soma.getValue());
            System.out.printf("%nDo you want to add it again? ");
            i = read.next();
        }while(i.equals("Yes") || i.equals("yes"));
    }
}