public class exceptiondemo{
    public static void main(String[] args) {

        try {
            // int a = 10, b = 0;
            // int result = a / b;
            // String str = null;
            // System.out.println(str.length());

            // int arr[] = {1, 2, 3};
            // System.out.println(arr[5]); 
            int num=Integer.parseInt("abc");

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Cannot divide by zero");

        } catch(NumberFormatException e){
            System.out.println("invalid number format");
        } 
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: String is null");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception: Invalid index");

        } finally {
            System.out.println("Finally block always executes");
        }
    }
}