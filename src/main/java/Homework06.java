import java.util.Arrays;

public class Homework06 {
    public static void main(String[] args) {

        int[] numbers = {2,3,5,6,7,8};   //31
        int sumOfNums = sum(numbers);    //Sum function
        System.out.println(sumOfNums);



        int [] numbers2 ={3,9,1,8,4,8,5}; //1, 3, 4, 5, 8, 8, 9
        sort(numbers2);                   //sort function
        for (int num:numbers2) {
            System.out.print(num+" ");
        }
        System.out.println();

        System.out.println(minNum(numbers2)); //minNum function

    }


    //  1. Create function `sum` - which takes int[] as a param and returns sum of all elements of the array.
   //  invoke it from main() - pass {2,3,5,6,7,8} as a param and print out result

    public static int sum(int[] nums) {
        int result=0;
        for(int i =0; i<nums.length; i++){
            result+=nums[i];

        }
        return result;
    }


    //  2. Create function sort - which takes  int[] as a param and print out sorted array invoke it from main()
   //  - pass {3,9,1,8,4,8,5} as a param (this will be void func)

    private static void sort(int[] nums) {
        Arrays.sort(nums);
       // System.out.print(Arrays.toString(nums)+" ");

    }


    //  3. Create a function  which takes int[] as a param and returns min of the array invoke it from main()
   //  - pass {3,9,1,8,4,8,5} as a param

    public static int minNum(int[] nums) {
        int minN = nums[0];
        for (int num : nums) {
            if(num<minN){
                minN = num;
            }
        }
        return minN;

        //See you in giHub

    }






}
