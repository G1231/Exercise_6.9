class Main {
  public static void main(String[] args) {
    double feet = 1; // starting point for feet to meter side of table
    double meters = 20; // starting point for meter to feet side of table
    System.out.println("feet  Meters   |   Meters  Feet"); //printing unit names
    System.out.println("- - - - - -  - | - - - - - - - -");
    for (int i = 0; i<10; ++i) { //looping for numbers up to ten
      System.out.printf("%3.1f   %5.3f    |   %4.1f   %7.3f \n", feet, footToMeter(feet), meters, meterToFoot(meters) ); // table with formatting
      feet += 1.0; //adding increments of 1 to feet
      meters += 5.0; //adding increments of  5 to meters
    }
  }


// feet to meter conversion method
  public static double footToMeter(double foot) {
    return 0.305 * foot;

  }

//meter to feet conversion method
  public static double meterToFoot(double meter) {
    return 3.279 * meter;
  }
}

