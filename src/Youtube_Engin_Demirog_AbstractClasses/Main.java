package Youtube_Engin_Demirog_AbstractClasses;

public class Main {
    public static void main(String[] args) {
     //2. Way
       /* GameCalculator[] gameCalculators = new GameCalculator[] {new ManGameCalculator(), new WomanGameCalculator(), new KidsGameCalculator(), new ElderGameCalculator()};

      for (GameCalculator gameCalculator: gameCalculators ){
          System.out.println(gameCalculators.length);
      }*/



      // 1. Way
       GameCalculator gameCalculator = new WomanGameCalculator();
        gameCalculator.gameOver();
        gameCalculator.calculate();



        // *** Important= Abstact Classes can never be called by ""new""
 /* GameCalculator gameCalculator = new GameCalculator() {
      @Override
      public void calculate( ) {

      }
  } ("";"" you have to use this end of the curly bracket if you want to call method */


        // 1. Way This is overide is one of the method to run these classes
        /*WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
    ElderGameCalculator elderGameCalculator = new ElderGameCalculator();
    KidsGameCalculator kidsGameCalculator = new KidsGameCalculator();
    ManGameCalculator manGameCalculator = new ManGameCalculator();

    womanGameCalculator.calculate();
    womanGameCalculator.gameOver();
    elderGameCalculator.calculate();
    elderGameCalculator.gameOver();
    kidsGameCalculator.calculate();
    kidsGameCalculator.gameOver();
    manGameCalculator.calculate();
    manGameCalculator.gameOver();*/







    }
}
