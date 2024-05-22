package ExcelRead;

import java.io.IOException;

public class ExcelDemoMain {

	public static void main(String[] args) throws IOException {
		
    String s = ExcelDemo.readStringData(2, 0);
    System.out.println(s);
    String s1 =  ExcelDemo.readIntergerData(2, 1);
    System.out.println(s1);
	}

}
