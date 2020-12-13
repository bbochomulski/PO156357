import java.util.*;

public class WordsInTreeSetDemo
{
    public static void main(String[] args)
    {
        Set<String> words = new TreeSet<>();
        long totalTime = 0;

        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String word = in.next();
            long callTime = System.currentTimeMillis();
            words.add(word);
            callTime = System.currentTimeMillis() - callTime;
            totalTime += callTime;
        }

        //Iterator<String> iter = words.iterator();
        //for (int j = 1; j <= 20; ++j) {
        //    System.out.println(iter.next());
        //}

        System.out.println("TreeSet");
        System.out.println(words.size() + " unikalnych słów. " + totalTime + " milisekund.");
    }
}

