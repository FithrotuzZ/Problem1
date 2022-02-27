import java.util.Random;

public class ComputeMethods5026211045 {

    //temperature
    public double fToC (double degreesF) {
        double degreeC = 5./9. * (degreesF-32);
        return (degreeC);
    }

    //hypotenuse
    public double hypotenuse (int x, int y){
        double r = (Math.pow(x, 2)) + (Math.pow(y, 2));
        return (Math.sqrt(r));
    }
      
    //dice
    public int roll(){
        Random rnd = new Random();
        int dice1 = rnd.nextInt(7)+1;
        int dice2 = rnd.nextInt(7)+1;
        return  dice1 + dice2;
    }
}
