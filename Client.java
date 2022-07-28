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

public class Client {
    public static void sartclient(int x) {
        try {
            Socket sc = new Socket("localhost",x);

            BufferedReader userinput = new BufferedReader(new InputStreamReader(System.in));
            String str = userinput.readLine();
            while (true) {
                DataOutputStream clientstream = new DataOutputStream( sc.getOutputStream() );
                String search = "name : ";
                Boolean found;
                found = str.contains( search );
                if (found == true) {
                    String[] parts = str.split( ":" );
                    String part1 = parts[0];
                    String part2 = parts[1];
                    clientstream.writeUTF( part2 );
                }

                if (str.equals( "date" ) || str.equals( "Date" )) {
                    LocalDate mydate = LocalDate.now();
                    clientstream.writeUTF( String.valueOf( mydate ) );
                } else {
                    clientstream.writeUTF( "error " + str );
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
