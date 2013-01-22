package udpsocket_client;

/**
 *
 * @author Jose E Hernandez
 */

import java.io.*;
import java.net.*;

public class Client {

public static void main(String args[]) throws Exception
    {
//Get data from User
BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
DatagramSocket clientSocket = new DatagramSocket();

//Where to send it to
InetAddress IPAddress = InetAddress.getByName("127.0.0.1");

//Size
byte[] sendData = new byte[1024];
byte[] receiveData = new byte[1024];
String sentence = inFromUser.readLine();
sendData = sentence.getBytes();

//Full Built UDP packet - sending
DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
clientSocket.send(sendPacket);

//Getting data back
DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length); 
clientSocket.receive(receivePacket);
String modifiedSentence = new String(receivePacket.getData());

//Print statement
System.out.println("FROM SERVER:" + modifiedSentence);
clientSocket.close();
    }



}

    

