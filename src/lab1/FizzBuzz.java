package lab1;

/**
 * Solve the lab1.FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            // Find out which numbers divide i.
            extracted(i);
        }
    }

    private static void extracted(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        String output = "";

        // Print our appropriate result.
        if (divisibleBy3) {
            output += "Fizz";
        }

        if (divisibleBy5) {
            output += "Buzz";
        }

        if (!divisibleBy3 && !divisibleBy5) {
            output += Integer.toString(i);
        }

        System.out.println(output);
    }
}
