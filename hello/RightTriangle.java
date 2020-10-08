/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RightTriangle {
    public static void main(String[] args) {

        int sideA = Integer.parseInt(args[0]);
        int sideB = Integer.parseInt(args[1]);
        int sideC = Integer.parseInt(args[2]);
        int maxSide = Math.max(Math.max(sideA, sideB), Math.max(sideA, sideC));
        int minSide = Math.min(Math.min(sideA, sideB), Math.min(sideA, sideC));
        int midSide = sideA + sideB + sideC - maxSide - minSide;
        boolean indicPositive = minSide > 0;
        boolean indicRight = minSide * minSide + midSide * midSide == maxSide * maxSide;
        System.out.println(indicPositive && indicRight);
    }
}
