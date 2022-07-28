import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Server {
    public static void startserver(int x) {
        try {
            ServerSocket ss = new ServerSocket( x );
            Socket sc = ss.accept();
            while (true) {

                DataInputStream userStream = new DataInputStream( sc.getInputStream() );
                String clientmsg = "";
                clientmsg = userStream.readUTF();
                System.out.println( clientmsg );

            }
        } catch (IOException ex) {
            System.out.println( "something wrong" );
        }
    }

}



