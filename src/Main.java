import java.util.*;

public class Main {
    private static List<Integer> numsForTask1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 13, 2323231, 1321, 13));
    private static List<Integer> numsForTask2 = new ArrayList<>(List.of(56, 242, 2, 8, 44, 2, 2, 242, 8, 10, 12, 12, 20));
    private static List<String> wordsForTask3 = new ArrayList<>(List.of("dog", "cat", "dog", "cat", "horse", "cow", "goose", "cow"));
    private static List<String> wordsForTask4 = new ArrayList<>(List.of("dog", "cat", "dog", "cat", "horse", "cow", "goose", "cow",
            "horse", "horse", "cow", "cow", "cow", "cat", "cat", "cat", "cat", "cat", "cat"));
    public static void main(String[] args) {
        printOddNumbers();
        System.out.println("");
        printEvensNumbersInIncreasingOrder();
        System.out.println("");
        printUniqWords();
        System.out.println("");
        printCountOfUniqWords();
    }

    public static void printOddNumbers() {
        for (int i = 0; i < numsForTask1.size(); i++) {
            if (numsForTask1.get(i) % 2 != 0) {
                System.out.println(numsForTask1.get(i));;
            }
        }
    }

    public static void printEvensNumbersInIncreasingOrder() {
        Collections.sort(numsForTask2);
        int newNum = Integer.MIN_VALUE;
        for (int i = 0; i < numsForTask2.size(); i++) {
            if (numsForTask2.get(i) % 2 == 0 && numsForTask2.get(i) != newNum) {
                System.out.println(numsForTask2.get(i));
                newNum = numsForTask2.get(i);
            }
        }
    }

    public static void printUniqWords() {
        Set<String> result = new HashSet<>(wordsForTask3);
        System.out.println(result);
    }

    public static void printCountOfUniqWords() {
        Collections.sort(wordsForTask4);
        Map<String, Integer> result = new HashMap<>(Map.of());
        String newUniqWord = " ";
        for (int i = 0; i < wordsForTask4.size(); i++) {
            if (result.containsKey(wordsForTask4.get(i))) {
                Integer counter = result.get(wordsForTask4.get(i)) + 1;
                result.put(wordsForTask4.get(i), counter);
            } else {
                result.put(wordsForTask4.get(i), 1);
            }
        }
        System.out.println(result.values());
    }
}