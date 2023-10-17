
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SmartPhoneOperation {

    public static Scanner input = new Scanner(System.in);
    static List<SmartPhone> smartPhoneList = new ArrayList<>();

    static {
        smartPhoneList.add(new SmartPhone(1,3199.0, 0.0, 3,
                "Samsung GALAXY A51", "SAMSUNG", 6.5, 6,128,
                4000,"Black"));
        smartPhoneList.add(new SmartPhone(2,7379.0, 0.1,5,
                "IPhone 11 64 GB", "APPLE", 6.1,6,64,
                4000,"Blue"));
        smartPhoneList.add(new SmartPhone(3,4012.0,0.0, 4,
                "Redmi Note 10 Pro 8 GB", "XIAOMI", 6.5, 12,128,
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
                    addSmartPhoneList();
                    break;
                case 3:
                    deleteSmartPhone();
                    break;
                case 4:
                    System.out.println("Filtrelemek istediginiz turu seciniz.\n1-ID\n2-Marka");
                    System.out.print("Seciminiz: ");
                    int select = input.nextInt();
                    switch (select){
                        case 1:
                            filterSmartphonesById();
                            break;
                        case 2:
                            filterSmartphonesByBrand();
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
        System.out.println();
        System.out.println("Telefon ekleme paneline hosgeldiniz! Eklemek istediginiz urunun; ");
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
        System.out.print("Hafizasi: ");
        int addMemory = input.nextInt();
        System.out.print("Pil Gucu: ");
        int addBatteryPower = input.nextInt();
        System.out.print("Rengi: ");
        String addColor = input.next();

        smartPhoneList.add(new SmartPhone(addID, addPrice, addRateOfDiscount, addAmountOfStock, addName,addBrand,addScreenSize,addRam,addMemory,addBatteryPower,addColor));
        printSmartPhoneList();

    }
    void deleteSmartPhone(){

        System.out.print("Urun silme paneline hosgeldiniz! Silmek istediginiz urunun ID No'sunu giriniz: ");
        int removeID = input.nextInt();
        Iterator<SmartPhone> iterator = smartPhoneList.iterator();
        while (iterator.hasNext()){
            SmartPhone phone = iterator.next();
            if (removeID == phone.getIdNo()){
                smartPhoneList.remove(phone);
                printSmartPhoneList();
                break;
            }
        }
        /*
        System.out.println("Urun silme paneline hosgeldiniz! Silmek istediginiz urunun ID No'sunu giriniz: ");
        for (SmartPhone phones : smartPhoneList){
            System.out.println(phones.getIdNo());
        }
        int removeID = input.nextInt();
        input.nextLine();
        for (SmartPhone phones : smartPhoneList){
            if (phones.getIdNo() == removeID){
                smartPhoneList.remove(phones);
                break;
            }
        }
        printSmartPhoneList(); */
    }

    void filterSmartphonesById(){
        printSmartPhoneList();
        System.out.println("Filtrelemek istediginiz urunun ID No'sunu giriniz: ");
        int filterID = input.nextInt();
        System.out.println(filterID + " id numarali telefon = " + smartPhoneList.get(filterID-1).getProductName()); // IndexOutOfBound almamamak icin filterID-1.
    }

    void filterSmartphonesByBrand(){
        printSmartPhoneList();
        System.out.print("Filtrelemek istediginiz urunun markasini giriniz: ");
        String filterBrand = input.next();
        filterBrand = filterBrand.toUpperCase();
        for (SmartPhone phones : smartPhoneList){
            if (phones.getBrand().equals(filterBrand)){
                System.out.println(filterBrand + " marka telefon = " + phones.getProductName());
            }
        }
    }
}
