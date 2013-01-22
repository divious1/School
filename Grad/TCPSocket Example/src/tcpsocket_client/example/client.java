
package tcpsocket_client.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author Jose E Hernandez
 */

public class client {

public static void main(String argv[]) throws Exception
{
//Variables
String sentence;
String modifiedSentence;

//Constructor Data In
BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
Socket clientSocket = new Socket("127.0.0.1", 6789);

// Constructor Data Out
DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

//Reading the sentences
sentence = inFromUser.readLine();
outToServer.writeBytes(sentence + '\n');
modifiedSentence = inFromServer.readLine();
System.out.println("FROM SERVER: " + modifiedSentence);
clientSocket.close();
}
}


