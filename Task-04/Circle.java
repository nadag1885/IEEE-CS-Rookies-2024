import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double X1=scanner.nextDouble();
        double Y1=scanner.nextDouble();

        double X2=scanner.nextDouble();
        double Y2=scanner.nextDouble();

        scanner.nextLine();

        double X3=scanner.nextDouble();
            double Y3=scanner.nextDouble();

        double X4=scanner.nextDouble();
        double Y4=scanner.nextDouble();

        if(isIntersect(X1,Y1,X2,Y2,X3,Y3,X4,Y4))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static double Distance(double X1, double Y1, double X2, double Y2) {
        double distance = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));
        return distance;
    }


    public static boolean isIntersect(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        double XA=(x1+x2)/2 ,YA=(y1+y2)/2;
        double XB=(x3+x4)/2 ,YB=(y3+y4)/2;

        double diameterA=Distance(x1 ,y1 ,x2 , y2);
        double diameterB=Distance(x3 ,y3 ,x4 , y4);

        double distance=Distance(XA  ,YA ,XB ,YB);

        return distance <= ((diameterA+diameterB)/2);
    }

    }
