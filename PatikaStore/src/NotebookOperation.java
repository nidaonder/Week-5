
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class NotebookOperation {

    public static Scanner input = new Scanner(System.in);
    static List<Notebook> notebookList = new ArrayList<>();
    static {
        notebookList.add(new Notebook(1,7000.0, 0.0,5,
                "HUAWEI Matebook 14", "HUAWEI", 14.0, 16,512));
        notebookList.add(new Notebook(2,3699.0, 0.1, 2,
                "LENOVO V14 IGL", "LENOVO", 14.0, 8, 1024));
        notebookList.add(new Notebook(3,8199.0,0.0, 1,
                "ASUS Tuf Gaming","ASUS", 15.6, 32, 2048));
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
                    addNotebookList();
                    break;
                case 3:
                    deleteNotebook();
                    break;
                case 4:
                    System.out.println("Filterelemek istediginiz turu seciniz.\n1-ID\n2-Marka");
                    System.out.print("Seciminiz: ");
                    int select = input.nextInt();
                    switch (select){
                        case 1:
                            filterNotebooksById();
                            break;
                        case 2:
                            filterNotebooksByBrand();
                            break;
                        default:
                            System.out.println("Gecerli bir secim yapiniz.");
                            break;
                    }
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
        for (Notebook notebook : notebookList) {
            System.out.format("%-5s %-20s %20s %15s %8s %8s", notebook.getIdNo(), notebook.getProductName(), notebook.getPrice(),
                    notebook.getBrand(), notebook.getStorage(), notebook.getScreenSize(),notebook.getRam());
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------------------------------");
    }


    void addNotebookList(){
        System.out.println();
        System.out.println("Notebook ekleme paneline hosgeldiniz! Eklemek istediginiz urunun; ");
        System.out.print("Urunun ID No'su: ");
        int addID = input.nextInt();
        System.out.print("Urunun fiyati: ");
        double addPrice = input.nextDouble();
        System.out.print("Indırım Oranı: ");
        double addRateOfDiscount = input.nextDouble();
        System.out.print("Stok miktari: ");
        int addAmountOfStock = input.nextInt();
        input.nextLine();
        System.out.print("Urunun adi: ");
        String addName = input.next();
        System.out.print("Markasi: ");
        input.nextLine();
        String addBrand = input.nextLine();
        System.out.print("Ekran boyutu: ");
        double addScreenSize = input.nextDouble();
        System.out.print("RAM: ");
        int addRam = input.nextInt();
        System.out.print("Depolama Alani: ");
        int addStorage = input.nextInt();

        notebookList.add(new Notebook(addID,addPrice,addRateOfDiscount,addAmountOfStock,addName,addBrand,addScreenSize,addRam,addStorage));
        printNotebookList();
    }

    void deleteNotebook() {
        System.out.print("Urun silme paneline hosgeldiniz! Silmek istediginiz urunun ID No'sunu giriniz: ");
        int removeID = input.nextInt();
        Iterator<Notebook> iterator = notebookList.iterator();
        while (iterator.hasNext()) {
            Notebook notebook = iterator.next();
            if (removeID == notebook.getIdNo()) {
                notebookList.remove(notebook);
                printNotebookList();
                break;
            }
        }
    }
     void filterNotebooksById(){
         printNotebookList();
         System.out.println("Filtrelemek istediginiz urunun ID No'sunu giriniz: ");
         int filterID = input.nextInt();
         System.out.println(filterID + " id numarali notebook = " + notebookList.get(filterID-1).getProductName()); // IndexOutOfBound almamamak icin filterID-1.
     }

     void filterNotebooksByBrand(){
         printNotebookList();
         System.out.print("Filtrelemek istediginiz urunun markasini giriniz: ");
         String filterBrand = input.next();
         filterBrand = filterBrand.toUpperCase();
         for (Notebook notebook : notebookList){
             if (notebook.getBrand().equals(filterBrand)){
                 System.out.println(filterBrand + " marka notebook = " + notebook.getProductName());
             }
         }
     }
}
