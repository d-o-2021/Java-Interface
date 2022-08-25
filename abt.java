abstract class Demo2{
    Demo2(){System.out.println("abts class");}
}
class Z extends Demo2
{
    Z(){System.out.println("class Z");}
}
class abt {
    public static void main(String[] args) {
        Z z=new Z();
    }
    
}

