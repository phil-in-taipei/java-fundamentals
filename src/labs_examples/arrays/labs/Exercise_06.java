package labs_examples.arrays.labs;

/**
 *  Reversing an array in place
 *
 *
 *      This is a very common interview challenge.
 *
 *      Using a for loop, please demonstrate how to reverse the nums[] array in place using only one extra variable. Please note,
 *      you cannot use a second array and you cannot instantiate any new variables in the class below.
 *
 *      Hint: you have two index
 *
 */
public class Exercise_06 {

    public static void main(String[] args){
        int[] nums = {45, 87, 62, 99, 1, 42, 12};
        String WHITE_BACKGROUND = "\u001B[47m";
        String BLACK_TEXT = "\u001B[30m";
        String STANDARD_RESET = "\u001B[0m";
        System.out.println("");
        System.out.println("----------------------------------------------");
        System.out.println("Contents of array originally:");
        // print each element of the array to verify reverse order
        System.out.println("----------------------------------------------");
        for(int i : nums){
            System.out.print(i + " ");
        }

        System.out.println("");
        System.out.println("----------------------------------------------");
        System.out.println(
                WHITE_BACKGROUND + BLACK_TEXT +
                "Reverse an array with only one extra variable " +
                STANDARD_RESET
        );
        System.out.println("----------------------------------------------");

        int temp = 0;

        // Question: in the for loop below, why do we divide "nums.length" by 2?
        // swap elements at indexes in array
        // you have two indices readily available for you to use "i" (which increments) and "nums.length"
        // you've also got this "temp" variable you can use to hold a value temporarily

        for(int i = 0; i < nums.length / 2; i++){
            temp++;
            int negIndexSwap = nums[nums.length - temp];
            nums[nums.length - temp] = nums[i];
            nums[i] = negIndexSwap;
        }
        System.out.println("Contents of array after for loop:");
        // print each element of the array to verify reverse order
        System.out.println("----------------------------------------------");
        for(int i : nums){
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("----------------------------------------------");
    }

}
