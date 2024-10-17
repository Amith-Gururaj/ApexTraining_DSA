import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String s = "a";

        RunLengthEncoding ob = new RunLengthEncoding();

        String res = ob.runLengthEncode(s);
        System.out.println(res);

        LongestMatchedSubstring ob1 = new LongestMatchedSubstring();

        res = ob1.LongestMatchedSubStr(new String[]{"fefbdertw4"}, "Ad");
        System.out.println(res);

        int[] result = AxisCoordinator.AxisCoordinatorOperator("URRDDL");
        System.out.print(Arrays.toString(result));

        System.out.println(ShortestDistanceBetweenWords.ShortestDistanceBetweenTwoWords
                ("the quick the quick the brown frog", "quick", "frog") );

        System.out.println(MinimumElementInSortedArray.MinimumElement(new int[]{5,6,1,2,3,4}));

        System.out.println(Arrays.toString(FindStringWithPrefix.FindStringsStartingWithPrefix(
                new String[]{"apple", "orange","ap", "app","rapp"},"app")));

        System.out.println(FirstNonRepeatingCharacter.FindFirstNonRepeatingCharacter("1221334154"));

        System.out.println(StringToIntegerConvertion.parseStringToInteger("+1a3"));
    }
}