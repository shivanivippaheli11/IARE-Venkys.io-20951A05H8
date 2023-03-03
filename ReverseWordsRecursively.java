import java.util.Scanner;
import java.util.Arrays;
public class ReverseWordsRecursively {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the paragraph: ");
        String paragraph = input.nextLine();
        String reversedParagraph = reverseWords(paragraph);
        System.out.println(reversedParagraph);
        input.close();
    }

    public static String reverseWords(String paragraph) {
        if (paragraph.isEmpty()) {
            return " ";
        } else {
            String[] words = paragraph.split("\\s+");
            String reversedFirstWord = new StringBuilder(words[0]).reverse().toString();
            String restOfParagraph = String.join(" ",Arrays.copyOfRange(words, 1, words.length));
            String reversedRestOfParagraph = reverseWords(restOfParagraph);
            return reversedFirstWord + " " + reversedRestOfParagraph;
        }
    }
}
