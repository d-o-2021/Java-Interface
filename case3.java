//can we create method with body inside interface?

interface inter1
{
  void show()
  {
    System.out.println("Interface abstract method!!");
  }
}
class case3
{
  public static void main(String ar[])
  {
    System.out.println("Hello");
  }
}
//compile and run in jdk version 1.7 and lower version
//Error  :  Interface abstract method can't have body!!

// Note : we can create method with body(i.e default method by using default keyword) inside interface from version 1.8 and above
