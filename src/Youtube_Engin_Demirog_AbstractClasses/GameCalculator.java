package Youtube_Engin_Demirog_AbstractClasses;

public abstract class GameCalculator { // For GameCalculator whoever inherit it (extend it) must to use it by its own parameters (overriding by its own parameters)
    public abstract void calculate(); // There is no curly brackets for abstract method.

    /*{   // Before making abstract class
        System.out.println("Puaniniz: 100");
    }*/



    public final void gameOver(){ // This by final means everyone whoever would like to use this method can use bu can not change it
        System.out.println("Game Over");
    }


}
