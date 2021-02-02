import java.util.ArrayList;
import java.util.List;

public class MoveZeros {
    public static void main(String [] args)
    {
        /*
        Input [0,3,2,0,8,5]
        Output [3,2,8,5,0,0]
        //0을 맨 뒤로 넣는다.
         */
        int ex1 []={0,3,2,0,8,5};
        solution(ex1);


    }
    public static void solution(int args[])
    {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<args.length;i++){
            if(args[i]!=0)
                list.add(args[i]);
        }
        while(list.size()!=args.length) {
            list.add(0);
        }
        print(list);
    }
    public static void print(List<Integer> list)
    {
        for(Integer arg: list)
        {
            System.out.print(arg+" ");
        }
        System.out.println();
    }
}
