import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PuzzleJava{
    public ArrayList<Integer> sumAndGreater10(int[] arr1) {
        ArrayList<Integer> greaterThan10 = new ArrayList<Integer>();
        int sum = 0;
        for(var i = 0; i < arr1.length; i++){
            if(arr1[i] > 10){
                greaterThan10.add(arr1[i]);

            }
            sum += arr1[i];
        }
        System.out.println(sum);
        System.out.println(greaterThan10);
        return greaterThan10;
    }
    public ArrayList<String> shuffleAndLongerThan5(String[] names) {
        ArrayList<String> shuffled = new ArrayList<String>();
        ArrayList<String> longerThan5 = new ArrayList<String>();

        for(var i = 0; i < names.length; i++) {
            if(names[i].length() > 5){
                longerThan5.add(names[i]);
            }
            shuffled.add(names[i]);
        }
        Collections.shuffle(shuffled);

        System.out.println(shuffled);
        System.out.println(longerThan5);
        return longerThan5;
    }
    public void alphabetShuffle() {
        ArrayList<String> az = new ArrayList<String>();
        for(char c = 'a'; c <= 'z'; c++){
            az.add(Character.toString(c));
        }
        Collections.shuffle(az);
        System.out.println("The last letter in the shhuffled alphabet is: " + az.get(25));
        System.out.println("The first letter in the shuffled alphabet is: " + az.get(0));
        String firstLetter = az.get(0);
        
        if(firstLetter.compareTo("a") == 0 || firstLetter.compareTo("e") == 0 || firstLetter.compareTo("i") == 0 || firstLetter.compareTo("o") == 0 || firstLetter.compareTo("u") == 0) {
            System.out.println("Wow, the first letter is a vowel!");
        }
    }
    public ArrayList<Integer> random10() {
        ArrayList<Integer> random = new ArrayList<Integer>();
        for(var i = 0; i < 10; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(55, 101);
            random.add(randomNum);
        }
        System.out.println(random);
        return random;
    }
    public ArrayList<Integer> sortedRandom10() {
        ArrayList<Integer> sortedRandom = new ArrayList<Integer>();
        for(var i = 0; i < 10; i++){
            int rand = ThreadLocalRandom.current().nextInt(55, 101);
            sortedRandom.add(rand);
        }
        Collections.sort(sortedRandom);
        System.out.println(sortedRandom);
        return sortedRandom;
    }
    public void randomStrings() {
        Random rand = new Random();
        String randomString = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        while(randomString.length() < 5){
            int i = rand.nextInt(alphabet.length());
            char j = alphabet.charAt(i);
            randomString += j;
        }
        System.out.println(randomString);

    }
    public void randomStrings10() {
        Random randy = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] words = new String[10];
        String randoms = "";
        ArrayList<String> randomWords = new ArrayList<String>();

        for(var i = 0; i < 10; i++) {
            while(randoms.length() < 5) {
                int j = randy.nextInt(alphabet.length());
                char k = alphabet.charAt(j);
                randoms += k;
            }
            words[i] = randoms;
            randomWords.add(words[i]);
        }
        System.out.println(randomWords);

    }
}