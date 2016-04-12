/*
Demonstrate the for loop.
Call this file ForDemo.java
*/
class ForDemo{
  public static void main(String [] args){
    int count;
    System.out.println("Increment");
    for(count = 0; count <5; count = count +1)
      System.out.println("This is count "  + count);

    System.out.println("Decrement");
    for(count = 5; count >0; count--)
     System.out.println("This is count "  + count);
    System.out.println("Done");
  }
}
