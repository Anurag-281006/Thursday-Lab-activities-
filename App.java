//program to show the use of DataInputStream and DataOutputStream classes for reading and writing primitive data type
package ThursdayLab;

import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.IOException;
class App {


	public static void main(String args[]) throws IOException
	{
		FileOutputStream fos=new FileOutputStream("D:\\Anudip prgs\\AK.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeInt(60000);
		dos.writeShort(3000);
		dos.writeByte(120);
		dos.writeChar(70);
		dos.close();
		
		FileInputStream fis=new FileInputStream("E:\\r.txt");
		DataInputStream dis=new DataInputStream(fis);
		System.out.println("Int :"+dis.readInt());
		System.out.println("Short :"+dis.readShort());
		System.out.println("Byte :"+dis.readByte());
		System.out.println("Char :"+dis.readChar());
		dis.close();
	}
}



