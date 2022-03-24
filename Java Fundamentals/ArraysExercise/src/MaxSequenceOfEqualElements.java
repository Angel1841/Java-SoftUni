import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nums = scanner.nextLine().split(" ");
        int roll = 0;
        int maxMax = 0;
        String index = "";

        for(int i = 0;i< nums.length - 1;i++)
        {
            if(nums[i].equals(nums[i+1]))
            {
                roll++;

                if(roll > maxMax)
                {
                    maxMax = roll;
                    index = nums[i];
                }

            } else{
                roll = 0;
            }

        }

        String[] print = new String[maxMax + 1];
        for (int i = 0; i < print.length; i++) {
            print[i] = index;
        }

        for (var element: print) {
            System.out.print(element + " ");
        }

    }
}
