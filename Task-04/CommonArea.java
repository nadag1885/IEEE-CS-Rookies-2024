import java.util.Scanner;

public class CommonArea {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int T =scanner.nextInt();
        for(int t=1; t<=T; t++){
            int N=scanner.nextInt();

            int[][] points = new int[N][4];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 4; j++) {
                    points[i][j] = scanner.nextInt();
                }
            }

            long commonArea = getCommonArea(points);
            System.out.println("Case #" + t + ": " + commonArea);

        }
    }

    public static long getCommonArea(int[][] points) {
        int minX = Integer.MIN_VALUE, minY = Integer.MIN_VALUE;
        int maxX = Integer.MAX_VALUE, maxY = Integer.MAX_VALUE;

        for (int[] point : points) {
            minX = Math.max(minX, point[0]);
            minY = Math.max(minY, point[1]);
            maxX = Math.min(maxX, point[2]);
            maxY = Math.min(maxY, point[3]);
        }

        if (maxX <= minX || maxY <= minY) {
            return 0;
        } else {
            long width = maxX - minX;
            long height = maxY - minY;
            return width * height;
        }
    }

}
