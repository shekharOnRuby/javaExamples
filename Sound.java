/*
2-1 Compute the distance to a lightning strike whose sound takes 7.2 seconds to
reach you.
*/

class Sound{
  public static void main(String [] args){
    double dist;

    dist = 7.2 *1100;

    System.out.println("The lighining is " +dist + "feet away");

    System.out.println( "calculating the distance of echo, it is " +(dist/2));

  }
}
