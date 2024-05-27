import java.net.SocketOption;

class Animal {
    public void makesound(){
        System.out.println("bark");
    }
}
class Cat extends Animal{
    public void makesound(){
        System.out.println("meow-meow");
    }
}
public class test {
    public static void main(String []args){
        Cat c = new Cat();
        c.makesound();
    }
}
