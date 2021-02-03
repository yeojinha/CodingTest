import java.util.Stack;

public class Daily_Temperatures {
    public static void main (String args[])
    {
        int T [] = {73, 74, 75, 71, 69, 72, 76, 73};
        int result [] =solve(T);
        print(result);
    }
    public int[] solve_1(int[] nums) {// 이중 for문
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            inner: for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    ans[i] = j - i;
                    break inner;
                }
            }
        }
        return ans;
    }
    public static int[] solve(int[] nums) {// stack
        Stack<Integer> stack = new Stack<>();
        // { 73, 74, 75, 71, 69, 72, 76, 73 };
        // { 0, 1, 2, 3, 4, 5, 6, 7};
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            while(!stack.isEmpty() && nums[stack.peek()]<nums[i]){
                int idx=stack.pop();
                result[idx]=i-idx;
            }
            stack.push(i);
        }
        return result;
    }
    public static void print(int []nums)
    {
        for(int i:nums)
        {
            System.out.print(i+" ");
        }
    }

}
