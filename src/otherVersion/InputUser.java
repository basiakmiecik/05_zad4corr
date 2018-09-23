package otherVersion;

import java.util.Scanner;

public class InputUser {

    public Scanner scanner= new Scanner(System.in);

    public Point inpoutCoor() {
        System.out.print("Podaj wspolrzędną X:");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Podaj wspolrzędną Y:");
        int y = scanner.nextInt();
        scanner.nextLine();
        Point point= new Point(x,y);

    return point;}
}
