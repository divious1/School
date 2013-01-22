/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package udpsocket_server;

/**
 *
 * @author drac0
 */
import java.io.*;
import java.net.*;
public class Server {

public static void main(String args[]) throws Exception
    {
//Constructor, creates datagram socket (with size)
DatagramSocket serverSocket = new DatagramSocket(9876);
byte[] receiveData = new byte[1024];
byte[] sendData = new byte[1024];


while(true)
        {
DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

serverSocket.receive(receivePacket);
String sentence = new String(receivePacket.getData());
InetAddress IPAddress = receivePacket.getAddress();

//find the port
int port = receivePacket.getPort();
String capitalizedSentence = sentence.toUpperCase();
sendData = capitalizedSentence.getBytes();
DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);

//Sends the data
serverSocket.send(sendPacket);
        }
    }
}
