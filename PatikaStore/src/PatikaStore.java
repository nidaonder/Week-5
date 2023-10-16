import java.util.Scanner;

public class PatikaStore {

    Scanner input = new Scanner(System.in);
    void printMenu(){

        NotebookOperation notebookOperation = new NotebookOperation();
        SmartPhoneOperation smartPhoneOperation = new SmartPhoneOperation();

        boolean flag = true;

        while (flag){
            System.out.println("PATIKA STORE URUN YONETIM PANELI !");
            System.out.println("===================================");
            System.out.print("Yapmak istediginiz islemi seciniz; " +
                    "\n1-Notebook Islemleri." +
                    "\n2-Cep Telefonu Islemleri." +
                    "\n3-Marka Listele." +
                    "\n0-Cikis Yap.");
            int selectMenu = input.nextInt();
            switch (selectMenu){
                case 0:
                    flag = false;
                    break;
                case 1:
                    notebookOperation.run();
                    break;
                case 2:
                    smartPhoneOperation.run();
                    break;
                case 3:
                    System.out.println();
                    Brand.printBrand();
                    System.out.println();
                    break;
                default:
                    System.out.println("---- Lutfen gecerli bir secenek giriniz! ----");
                    break;
            }
        }
    }
}
