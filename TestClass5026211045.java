public class TestClass5026211045 {
    public static void main(String[] args) {
        ComputeMethods5026211045 temp = new ComputeMethods5026211045();

        //temperature
        double degreesC = temp.fToC(100.4);
        System.out.println("Temp in celcius is " +degreesC);

        //hypotenuse
        double r = temp.hypotenuse(9,6);
        System.out.println("Hypotenuse is " +r);

        //dice
        int sumOfDice = temp.roll();
        System.out.println("The sum of dice values is " +sumOfDice);
    }
}
