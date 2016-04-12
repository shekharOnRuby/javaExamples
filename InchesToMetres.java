class InchesToMetres{
  public static void main(String [] args){
    double  metres;
    int counter = 0;

    for (metres =1; metres <=36; metres++){
      System.out.println(metres + " metres is "+(metres * 39.37) + " inches");
      counter++;

      if (counter == 12){
        System.out.println(" ");
        counter = 0 ;
      }
    }
  }
}
