
import java.util.Arrays;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author pattr
 */
public class LoadRecRun
{

    private LoadRec loader;
    //private long start;
    private int gap;
    private int leftGap;
    private int rightGap;
    private int[] leftArray;
    private int[] rightArray;
    private int[] sortArray;
    private int[] temp;

    public LoadRecRun()
    {

    }

    public void run(int[] nums)
    {
        long start = System.currentTimeMillis();

        loader = new LoadRec();

        //int[] array = {10, 5, 42, 1, 6};
        
        //System.out.println(Arrays.toString(nums));
        loader.mergeSort(nums, 0, nums.length - 1);
        //System.out.println(Arrays.toString(nums));
        
        long end = System.currentTimeMillis();

        //System.out.println(Arrays.toString(nums));
        //loader.bubbleSort(nums);
        System.out.println("Total time is " + (end - start) + 
                " milliseconds and is it sorted " + nums.length);
    }

    public void loop(int amount)
    {

//        int[] nums = new int[amount];
//
//        for (int j = 0; j < amount; j++)
//        {
//            Random rng = new Random();
//
//            nums[j] = rng.nextInt(50);
//        }
//        run(nums);
        for (int i = 1; i <= 8; i++)
        {
            int arraySize = amount * i;
            int[] nums = new int[arraySize];

            for (int j = 0; j < arraySize; j++)
            {
                Random rng = new Random();

                nums[j] = rng.nextInt(50);
            }

            run(nums);
        }
    }
}
