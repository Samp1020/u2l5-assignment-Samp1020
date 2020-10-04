import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        // variables; s = Start; e = end
        double sLat, sLong, eLong, eLat, dist;

        //Scanner
        Scanner scan = new Scanner(System.in);

        //user input
        System.out.println("Enter the Latitude of your starting location: ");
        sLat = scan.nextDouble();
        System.out.println("Enter the Longitude of your starting location: ");
        sLong = scan.nextDouble();
        System.out.println("Enter the Latitude of your ending location: ");
        eLat = scan.nextDouble();
        System.out.println("Enter the Longitude of your ending location: ");
        eLong = scan.nextDouble();

        // CALCULATIONS 
        GeoLocation gLocStar = new GeoLocation(sLat, sLong);
        GeoLocation gLocEnd = new GeoLocation(eLat, eLong);
        dist = gLocStar.distanceFrom(gLocEnd);
        System.out.println("The Distance is " + dist + "miles.");

    }
}