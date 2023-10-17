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
            System.out.println("Yapmak istediginiz islemi seciniz: " +
                    "\n " +
                    "\n1-Notebook Islemleri." +
                    "\n2-Cep Telefonu Islemleri." +
                    "\n3-Marka Listele." +
                    "\n0-Cikis Yap." +
                    "\n ");
            System.out.print("Seciminiz : ");
            int selectMenu = input.nextInt();
            switch (selectMenu){
                case 0:
                    flag = false;
                    break;
                case 1:
                    notebookOperation.notebookMenu();
                    break;
                case 2:
                    smartPhoneOperation.smartPhoneMenu();
                    break;
                case 3:
                    Brand.printBrand();
                    break;
                default:
                    System.out.println("---- Lutfen gecerli bir secenek giriniz! ----");
                    break;
            }

        }
    }
}
