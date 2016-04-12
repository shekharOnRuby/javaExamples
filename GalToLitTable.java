/*
This 1-2
This program displays a conversion table of Gallons to Litres/

*/

class GalToLitTable{
  public static void main(String [] args){
    int gallons, litres;

    int counter;

    counter = 0;

    for (gallons = 1; gallons <= 100; gallons ++){
      litres = gallons * (int) 3.7854;
      System.out.println(gallons + " gallons is " + litres + " liters");

      counter++;

      if (counter ==10){
        System.out.println();
        counter = 0;
      }
    }
  }
}
