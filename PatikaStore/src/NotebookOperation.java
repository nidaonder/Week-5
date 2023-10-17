
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NotebookOperation {

    public static Scanner input = new Scanner(System.in);
    static List<Notebook> notebookList = new ArrayList<>();
    static {
        notebookList.add(new Notebook(1,7000.0, 0.0,5,
                "HUAWEI Matebook 14", "Huawei", 14.0, 16,512));
        notebookList.add(new Notebook(2,3699.0, 0.1, 2,
                "LENOVO V14 IGL", "Lenovo", 14.0, 8, 1024));
        notebookList.add(new Notebook(3,8199.0,0.0, 1,
                "ASUS Tuf Gaming","Asus", 15.6, 32, 2048));
    }

    void notebookMenu(){
        boolean flag = true;
        while (flag){
            System.out.println();
            System.out.println("NOTEBOOK ISLEMLERİ");
            System.out.println("-------------------------");
            System.out.println("Yapmak istediginiz islemi seciniz:" +
                    "\n1-Notebook listele," +
                    "\n2-Notebook Ekle," +
                    "\n3-Notebook Sil," +
                    "\n4-Notebook Filtrele," +
                    "\n5-Cikis Yap.");
            System.out.println("Seciminiz: ");
            int selectMenu = input.nextInt();
            switch (selectMenu){
                case 1:
                    printNotebookList();
                    break;
                case 2:
                    // notebook ekle
                    break;
                case 3:
                    // notebook sil
                    break;
                case 4:
                    // filtrele
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Lutfen gecerli bir secim yapiniz!");
                    break;
            }
        }
    }
    void printNotebookList(){
        System.out.println("NOTEBOOK LISTESI");
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.format("%-5s %-20s %20s %15s %8s %8s %8s", "| ID |", " Urun Adı ", "| Fiyat |","Marka |", "Depolama |", "Ekran |", "Ram |");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------");
        for (Notebook nb : notebookList) {
            System.out.format("%-5s %-20s %20s %15s %8s %8s", nb.getIdNo(), nb.getProductName(), nb.getPrice(),
                    nb.getBrand(), nb.getStorage(), nb.getScreenSize(),nb.getRam());
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------------------------------");
    }


    void addNotebookList(Notebook notebook){

    }

    void deleteNotebook(int id){

    }
}
