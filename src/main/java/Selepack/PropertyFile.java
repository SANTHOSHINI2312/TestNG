package Selepack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
public static void main(String[] args) throws FileNotFoundException, IOException {
	Properties p=new Properties();
	p.load(new FileInputStream("C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\images\\test.properties"));
	String s=p.getProperty("Username");
	System.out.println(s);
	String s1=p.getProperty("Password");
	System.out.println(s1);
}
}
