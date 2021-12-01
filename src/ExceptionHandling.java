import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int arr[] = {12, 21, 34, 54, 45};
        int index = s.nextInt();
//         arthematic exception
        try {
            System.out.println(a / b);
            System.out.println(arr[index]);
        }// we can use finallly block for resorces clean up operztion perform
        catch (ArrayIndexOutOfBoundsException obj) {
            System.out.println(obj);
        } catch (ArithmeticException obj) {
            System.out.println(obj);// or we can write it as obj only it will givre the discription and definition
        } catch (Exception obj) {
            System.out.println(obj);
        }
        System.out.println("end of the main.");
        //  catch() to initilize the single catch
//        catch(ArithmeticException | ArrayIndexOutOfBoundsException | IllegalAccessException){
//
//        }

    }
}