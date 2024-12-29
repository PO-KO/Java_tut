public class ProblemSolving {
    public int noBoringZeros(int n) {
        int newNum;
        if((n != 0) && (n % 10 == 0)) {
          newNum = n / 10;
          return noBoringZeros(newNum);
        }
        return n;
    }
    public String call(int left, int right, int call){
      
        int cLeft = (int) Math.abs(call - left);
        int cRight = (int) Math.abs(call - right);
        
        System.out.println(cLeft);
        System.out.println(cRight);

          if(cLeft >= cRight) {
            return "right";
          }   
            return "left";
      }
}