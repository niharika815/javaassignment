/*write a java program to calculate factorial of a number. 
(Input a number as a constant value, use member function for factorial computation and return the value). */
class FactorialProgram {

    int factorial(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        FactorialProgram obj = new FactorialProgram();
        int number = 5;
        int fact = obj.factorial(number);
        System.out.println("Factorial of " + number + " is " + fact);
    }
}
