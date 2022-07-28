import java.io.DataInputStream;
import java.net.Socket;
import java.util.Scanner;

public class Runclass {
    public static void main(String[] args) {
        Thread f = new Thread();
        f.start();
        int x ;
        int y ;
        Scanner sc = new Scanner( System.in );
        x = sc.nextInt();
        y = sc.nextInt();
        Server.startserver( x );
        Client.sartclient( y );

    }
}
