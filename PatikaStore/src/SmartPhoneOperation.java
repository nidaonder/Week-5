import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmartPhoneOperation {

    static Map <Integer, SmartPhone> smartPhoneMap = new HashMap<>();

    void printSmartPhoneList(List<SmartPhone> smartPhones){
        for (SmartPhone smartPhone : smartPhones){
            System.out.println("Telefon adi");
        }
    }

    void addSmartPhoneList(SmartPhone smartPhone){
        smartPhoneMap.put(smartPhone.getIdNo(), smartPhone);
    }

    void deleteSmartPhone(int id){
        smartPhoneMap.remove(id);
    }

    void run(){

    }
}
