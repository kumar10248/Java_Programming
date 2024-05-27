import java.util.Scanner;
public class prac {
    public static void main(String[] args) {

      Operation op=new Operation();
      op.getdata();
      op.add();
      op.sub();
      op.mul();
      op.div();
      op.modu();


    }
}
class Operation{
    long  a,b;
    void getdata(){
        Scanner scanner=new Scanner(System.in);


        System.out.println("Enter the integer value for a: ");
       a = scanner.nextInt();
        System.out.println("Enter the integer value for b: ");
          b= scanner.nextInt();
    }
    void add(){
        System.out.println("Add: "+(a+b));

    }
    void sub(){
        System.out.println("Sub: "+(a-b));

    }
    void mul(){
        System.out.println("Mul: "+(a*b));

    }
    void div(){
        System.out.println("Div: "+(a/b));

    }
    void modu(){
        System.out.println("Modulo: "+(a%b));

    }

}