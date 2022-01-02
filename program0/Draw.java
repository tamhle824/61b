public class Draw {
    /**
     draws a triangle of "*'s";
      */
    public static void drawTriangle(int N){
        String dot = "*";
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<N;i++) {
            sb.append(dot);
            System.out.println(sb);
        }
    }
    public static void main(String[] args) {
        drawTriangle(10);
    }
}