/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class GreatCircle {
    public static void main(String[] args) {

        double pointOneXRadian = Math.toRadians(Double.parseDouble(args[0]));
        double pointOneYRadian = Math.toRadians(Double.parseDouble(args[1]));
        double pointTwoXRadian = Math.toRadians(Double.parseDouble(args[2]));
        double pointTwoYRadian = Math.toRadians(Double.parseDouble(args[3]));
        double meanEarthRadius = 6371.0;
        double temp1 = (pointTwoXRadian - pointOneXRadian) / 2.0;
        double temp2 = (pointTwoYRadian - pointOneYRadian) / 2.0;

        double twoPointDistance = 2.0 * meanEarthRadius * Math
                .asin(Math.sqrt(Math.sin(temp1) * Math.sin(temp1)
                                        + Math.cos(pointOneXRadian) * Math.cos(
                        pointTwoXRadian) * Math.sin(temp2) * Math.sin(temp2)));

        System.out.println(twoPointDistance + " kilometers");
    
    }
}
