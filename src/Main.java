import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int[] blocks = {4,2,0,3,2,5};
//
//        int lb = 0; // left block
//        int rb = 0; // right block
//        int ws = 0;
//        int i = 0;
//        int j = blocks.length-1;
//
////        while(i<j)
//
//
//        while (i<j) {
//            if (blocks[i] < blocks[j]) {
//                if (blocks[i] >= lb) {
//                    lb = blocks[i];
//                } else {
//                    ws += lb - blocks[i];
//                }
//                i++;
//            } else {
//                if (blocks[j] >= rb) {
//                    rb = blocks[j];
//                } else {
//                    ws += rb - blocks[j];
//                }
//                j--;
//            }
//        }


//        int[] arr = {1,2,3,6,4,5};

//        int mid = arr.length/2;
//        if(arr.length%2==0){
//            System.out.println((arr[mid]+arr[mid-1])/2.0);
//        }else{
//            System.out.println(arr[mid]);
//        }

//        int mid = arr.length/2;
//        System.out.println(arr.length%2==0?(arr[mid]+arr[mid-1])/2.0:arr[mid]);

//            if (blocks[i] > 0) {
//                lb = blocks[i];
//
//                for (int j = i + 1; j < blocks.length; j++) {
//                    int ib = 0; // internal blocks
//                    if (blocks[j] >= lb) {
//                        rb = blocks[j];
//                        if (j > i) {
//                            int val = Math.min(lb, rb);
//                            ws = val * (j - i) - ib;
//                        }
//                        lb = rb;
//                        i = j;
//                        break;
//                    } else if (j == blocks.length-1) {
//                        int val = Math.max(lb, rb);
//                        ws = val * (j - i) - ib;
//                        i = j+1;
//                        break;
//                    } else{
//                        ib += blocks[j];
//                    }
//                }
//            }else
//                i++;
//        }
//        System.out.println(ws);



        String s = "a";


        RunLengthEncoding ob = new RunLengthEncoding();

        String res = ob.runLengthEncode(s);
        System.out.println(res);


//        LongestMatchedSubstring ob = new LongestMatchedSubstring();
//
//        String res = ob.LongestMatchedSubStr(new String[]{"fefbdertw4"}, "Ad");
//        System.out.println(res);

//        int[] res = AxisCoordinator.AxisCoordinatorOperator("URRDDL");
//        System.out.print(Arrays.toString(res));

        System.out.println(ShortestDistanceBetweenWords.ShortestDistanceBetweenTwoWords
                ("the quick the quick the brown frog", "quick", "frog") );

//        System.out.println(MinimumElementInSortedArray.MinimumElement(new int[]{5,6,1,2,3,4}));

//        System.out.println(Arrays.toString(FindStringWithPrefix.FindStringsStartingWithPrefix(
//                new String[]{"apple", "orange","ap", "app","rapp"},"app")));

//        System.out.println(FirstNonRepeatingCharacter.FindFirstNonRepeatingCharacter("1221334154"));

//        System.out.println(StringToIntegerConvertion.parseStringToInteger("+1a3"));
    }
}