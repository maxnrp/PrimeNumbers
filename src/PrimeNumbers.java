public class PrimeNumbers{

    private static final int LIMIT = 30;

    public static void main(String[] args){
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.printPrimeNumbers(LIMIT);
    }

    public void printPrimeNumbers(int number) {
        int counter = 0;
        for (int i = 2; i <= LIMIT; i++) {
            counter = 0;
            for(int j = i; j >= 2; j--) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter == 1) {
                System.out.println(i);
            }
        }
    }
}