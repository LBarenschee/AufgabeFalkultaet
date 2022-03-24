public class Faculty {

    public static void main(String[] args) {
        //  System.out.println(faculty(10));
        facultyWhile(10);
    }

   /* public static int faculty(int z){
        int result = 1;
       for(int i = 2; i <= z; i++){
           result = result * i;
       }
       return result;
    } */

    public static int facultyWhile(int number) {
        int result = 1;
        int i = 1;
        while (i <= number) {
            result = result * i; //result *= i;
            i++;
        }
        System.out.println("Factorial of " + number + " is: " + result);
        return result;
    }
}
