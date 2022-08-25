// How can we access static method of an interface 
interface inter1
{
  static void show()
  {
    System.out.println("Static Method");
  }
}
class A implements inter1
{
}
class case2
{
  public static void main(String []ar)
  {
//     inter1 i;
//     i.show();            //wrong way    ERROR : illegal static interface method call
    inter1.show();
  }
}
