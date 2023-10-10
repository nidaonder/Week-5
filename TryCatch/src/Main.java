import java.util.Scanner;

public class Main {

    public static void print(int[] arrayList){
        Scanner input = new Scanner(System.in);
        System.out.print("Ulaşmak istediğiniz elemanın index numarasını yazınız: ");
        int indexNo = input.nextInt();
        System.out.println(arrayList[indexNo]);
    }

    public static void main(String[] args) {

        int[] arrayList = {1,2,3,4,5,6,7,8,9,10};

        try {
            print(arrayList);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getCause());

        } finally {
            System.out.println("Program tamamlandı!");
        }
    }
}