import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        String text = input.nextLine();

        // Girilen metindeki tüm kelimeleri ayırıyorum.
        String[] words = text.toLowerCase().split(" ");


        // Bir kelimenin liste içerisinde kaç defa geçtiğini sayıyorum.
        Map<String, Integer> wordsMap = new HashMap<>();
        for (String word : words){
            if (wordsMap.containsKey(word)){
                int count = wordsMap.get(word);
                wordsMap.put(word, count + 1);
            } else {
                wordsMap.put(word,1);
            }
        }

        // For-Each döngüsüyle en büyük value değerini buluyorum.
        int maxValue = 0;
        String maxValueKey = null;
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()){
            if (entry.getValue() > maxValue){
                maxValue = entry.getValue();
                maxValueKey = entry.getKey();
            }
        }
        System.out.println(wordsMap.entrySet());
        System.out.println("En çok tekrar eden kelime = " + maxValueKey);
    }
}