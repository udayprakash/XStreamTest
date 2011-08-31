import java.io.File;

import com.thoughtworks.xstream.XStream;

public class XStreamTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		XStream xstream = new XStream();
		xstream.alias("person", Person.class);
		xstream.alias("phonenumber", PhoneNumber.class);
		Person p = (Person)xstream.fromXML(new File("temp.xml"));
		System.out.println(p.toString());
	}
}
