import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String s = "aabbbcdfff";

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

        System.out.println(ShortestSubArraySum.shortestSubArrayMatchingSum(new int[]{2,4,6,1,9,1,1,1,2,1},12));

        System.out.println(SmallestMissingValue.findSmallestMissingValueInSortedArray(new int[]{0,1,2,3,4,7}));

        System.out.println(LongestPalindrome.buildLongestPalindrome("abccccdd"));

//        System.out.println(Arrays.deepToString(PascalProgram.buildPascalProgramArray(3)));

        List<List<Integer>> op = PascalProgram.buildPascalProgram(5);
        for(List<Integer> val : op)
            System.out.println(Arrays.toString(val.toArray()));

        int[] arr1 = {2,5};
        int[] arr2 = {1,3,4,6,8};

        System.out.println(MedianOfTwoArrays.MedianOfTwoSortedArrays(arr1, arr2));

        int[] arr = {10,5,6,3,2,20,100,80};
        System.out.println(Arrays.toString(WavedArrayProblem.getWavedArray(arr)));

        System.out.println(WaysToClimb.findWaysToClimb(3));

        String[][] students = {
                {"Charles", "84"},
                {"John", "100"},
                {"Andy", "37"},
                {"John", "23"},
                {"Charles", "20"}
        };

        System.out.println(HighestAverageMarks.findMaxAverage(students));

        String[] ips = {
                "10.0.0.1 bytes=32 time=50ms TTL=63",
                "10.0.0.2 bytes=32 time=50ms TTL=73",
                "10.0.0.4 bytes=32 time=50ms TTL=83",
                "10.0.0.2 bytes=32 time=50ms TTL=93",
        };
        MaxIPAddress.maxIpAddresses(ips);

        System.out.println(PowerOfTen.isPowerOfTen(10));
        System.out.println(PowerOfTen.isPowerOfTen(20));

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        InOrderTraversal.printInorder(root);

    }
}