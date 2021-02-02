public class CountDiv {
 public static void main(String[] args) {
  System.out.println("Hello");
  System.out.println(solution(6,14,2));
 }
 public static int solution(int A, int B, int K)
 {
  int cnt=0;
  for(int i=A;i<=B;i++)
  {
   if(i%K==0)
     cnt++;
  }
  return cnt;
 }

}
