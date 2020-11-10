public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava puzzle = new PuzzleJava();
        int[] arr1 = {3,5,1,2,7,9,8,13,25,32};
        String[] names = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        
        puzzle.sumAndGreater10(arr1);
        puzzle.shuffleAndLongerThan5(names);
        puzzle.alphabetShuffle();
        puzzle.random10();
        puzzle.sortedRandom10();
        puzzle.randomStrings();
        puzzle.randomStrings10();
    }
}