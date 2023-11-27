public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int count;

        double circleArea;
        final double PI = 3.14159;
        circleArea = 3 * 3 * PI;
        System.out.println(circleArea);
        
        char c = 'f';
        long bing = 2341L;
        System.out.println(bing);
        float bingf = 234.1f;
        System.out.println(bingf);

        int x = 50000;
        long y = x; // 큰 컵에 작은거 넣으면 됨. 묵시적 형변환

        long x2 = 5;
        // int y2 = x2; 
        int y2 = (int) x2; // 작은컵에 넣기위해서는 강제 형변환 해줘야함
        
    }
}
