//Can we create reference of an interface?
interface inter1
{
  void show();
}
class A implements inter1
{
  public void show()
  {
    System.out.println("Class A");
  }
}
class case1
{
  public static void main(String ar[])
  {
    inter1 i=new A();   // we can create refrence of an interface.
    i.show();
  }
}

// output
// Class A
