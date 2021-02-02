import java.util.*;

public class TwoSum {
    public static void main(String args[])
    {

        int [] nums = {2,8,10,21};
        int target=10;

        int [] result = solution(nums,target);
        for(int arg: result)
        {
            System.out.print(arg+ " ");
        }

    }
    public static int [] solution(int args [], int target) throws IllegalArgumentException
    {
        Map<Integer,Integer> map =new HashMap<>();

        int val=target-args[0];
        map.put(val,0);
        for(int i=1;i<args.length;i++)
        {
            if(map.containsKey(args[i]))
            {
                return new int [] {map.get(args[i]),i};
            }
        }
        throw new IllegalArgumentException("no match found");
    }
    public static void print(List<Integer>list)
    {
        for(Integer arg: list)
        {
            System.out.print(arg);
        }
    }
}
