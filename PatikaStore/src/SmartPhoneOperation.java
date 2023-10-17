
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmartPhoneOperation {

    public static Scanner input = new Scanner(System.in);
    static List<SmartPhone> smartPhoneList = new ArrayList<>();

    static {
        smartPhoneList.add(new SmartPhone(1,3199.0, 0.0, 3,
                "Samsung GALAXY A51", "Samsung", 6.5, 6,128,
                4000,"Black"));
        smartPhoneList.add(new SmartPhone(2,7379.0, 0.1,5,
                "IPhone 11 64 GB", "Apple", 6.1,6,64,
                4000,"Blue"));
        smartPhoneList.add(new SmartPhone(3,4012.0,0.0, 4,
                "Redmi Note 10 Pro 8 GB", "Xiaomi", 6.5, 12,128,
                4000, "White"));
    }


    void smartPhoneMenu(){
        boolean flag = true;
        while (flag){
            System.out.println();
            System.out.println("CEP TELEFONU ISLEMLERI");
            System.out.println("-------------------------");
            System.out.println("Yapmak istediginiz islemi seciniz:" +
                    "\n1-Telefonlari listele," +
                    "\n2-Telefon Ekle," +
                    "\n3-Telefon Sil," +
                    "\n4-Telefonlari Filtrele," +
                    "\n5-Cikis Yap.");
            System.out.println("Seciminiz: ");
            int selectMenu = input.nextInt();
            switch (selectMenu){
                case 1:
                    printSmartPhoneList();
                    break;
                case 2:
                    // add smartphone
                    break;
                case 3:
                    // delete smartphone
                    break;
                case 4:
                    // filter urun
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
    void printSmartPhoneList(){
        System.out.println("TELEFON LISTESI");
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        System.out.format("%-5s %-22s %20s %15s %8s %8s %8s %8s %10s", "| ID |", " Urun Adı ", "| Fiyat |","Marka |", "Depolama |", "Ekran |", "Pil |", "Ram | ", "Renk |");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        for (SmartPhone phone : smartPhoneList) {
            System.out.format("%-5s %-22s %20s %15s %8s %8s %8s %8s %10s", phone.getIdNo(), phone.getProductName(), phone.getPrice(),
                    phone.getBrand(), phone.getMemory(), phone.getScreenSize(), phone.getBatteryPower(), phone.getRam(), phone.getColor());
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
    }

    void addSmartPhoneList(){

    }
    void deleteSmartPhone(int id){

    }

    void filterSmartphonesById(int id){

    }

    void filterSmartphonesByBrand(String brand){

    }
}
