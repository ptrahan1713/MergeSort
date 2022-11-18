
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author pattr
 */
public class LoadRec
{

    private String load = "";
    private int low;
    private int[] leftArray;
    private int[] rightArray;
    private int count;
    private ArrayList<Integer> orderedList = new ArrayList<>();

    public LoadRec()
    {

    }

    public String loaderRec(int start, int[] nums)
    {
        if (start >= nums.length)
        {
            return load;
        }

        load = load + nums[start] + " ";

        start++;

        return loaderRec(start, nums);
    }

    public boolean groupSum(int start, int[] nums, int target)
    {
        if (start >= nums.length)
        {
            return (target == 0);
        }

        if (groupSum(start + 1, nums, target - nums[start]))
        {
            return true;
        }

        if (groupSum(start + 1, nums, target))
        {
            return true;
        }

        return false;
    }

    /**
     * Selection sort
     *
     * @param list
     * @return
     */
    public ArrayList<Integer> orderLow(ArrayList<Integer> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            low = i;

            for (int j = i; j < list.size(); j++)
            {
                if (list.get(j) < list.get(low))
                {
                    low = j;
                }
            }
            int temp = list.get(low);
            list.set(low, list.get(i));
            list.set(i, temp);

        }
        return list;
    }

    public int[] bubbleSort(int[] userArray)
    {
        for (int j = 0; j < userArray.length - 1; j++)
        {
            for (int i = 0; i < userArray.length - j - 1; i++)
            {
                if (userArray[i] > userArray[i + 1])
                {
                    int temp = userArray[i];
                    userArray[i] = userArray[i + 1];
                    userArray[i + 1] = temp;
                }
            }
        }
        return userArray;
    }
    
    public void mergeSort(int[] userArray, int beg, int end)
    {
        if(end <= beg)
        {
            return;
        }
        
        int mid = (beg + end) / 2;
        
        mergeSort(userArray, beg, mid);
        mergeSort(userArray, mid + 1, end);
        
        merge(userArray, beg, mid, end);
    }
    
    public int[] merge(int[] userArray, int beg, int mid, int end)
    {
        leftArray = new int[mid - beg + 1];
        rightArray = new int[end - mid];
        
        for (int i = 0; i < leftArray.length; i++)
        {
            leftArray[i] = userArray[beg + i];
        }

        for (int i = 0; i < rightArray.length; i++)
        {
            rightArray[i] = userArray[i + mid + 1];
        }
        
        //place holders for each of the arrays
        
        //for the left array
        int left = 0;
        
        //for the right array
        int right = 0;
        
        for(int i = beg; i < end + 1; i++)
        {
            if(left < leftArray.length && right < rightArray.length)
            {
                if(leftArray[left] < rightArray[right])
                {
                    userArray[i] = leftArray[left];
                    left++;
                }
                else
                {
                    userArray[i] = rightArray[right];
                    right++;
                }
            }
            else if(left < leftArray.length)
            {
                userArray[i] = leftArray[left];
                left++;
            }
            else if(right < rightArray.length)
            {
                userArray[i] = rightArray[right];
                right++;
            }
        }
        //System.out.println(Arrays.toString(userArray));
        
        return userArray;
    }
    
    public void printArray(int[] userArray)
    {
        System.out.println("Modified");
        for(int i = 0; i < userArray.length; i++)
        {
            System.out.print(userArray[i] + " ");
        }
        System.out.println("\n");
    }
    
    public boolean validate(int[] userArray)
    {
        for(int i = 0; i < userArray.length - 1; i++)
        {
            if(userArray[i] > userArray[i+1])
            {
                return false;
            }
        }
        return true;
    }
    
    public int[] shellSort(int[] list)
    {
        int gap = list.length / 2;
        
        return list;
    }
}
