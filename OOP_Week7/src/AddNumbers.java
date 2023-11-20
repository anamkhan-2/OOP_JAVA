import java.util.InputMismatchException;

public class AddNumbers {
//    int[] array = {1,2,3,4,5,6,7,8};
    public int arithmeticOperations(int a,int b) {
int result = 0;

        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Can not divide a number by 0");
            result=0;
            return result;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The array address does not exist!");
        } catch (ClassCastException e) {
            System.out.println("Recheck the typecasting!");
        }
        return result;

    }


    }

