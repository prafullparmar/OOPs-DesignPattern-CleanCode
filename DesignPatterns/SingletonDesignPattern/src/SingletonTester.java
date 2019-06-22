import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SingletonTester {

	
	
@Test
public void testSingletonObject()
{
	
	
	//Requesting an instance of LoggerClass with name Logger1 
	String objName1 = "Logger1";
	LoggerClass log1 = LoggerClass.getInstance(objName1);
	//Expecting an instance of LoggerClass with name Logger1 
	assertEquals(true,objName1.equals(log1.name));

	//Requesting an instance of LoggerClass with name Logger2
	String objName2 = "Logger2";
	LoggerClass log2 = LoggerClass.getInstance(objName2);
	
	//Expecting the same instance of LoggerClass with name Logger1
	assertEquals(false,objName2.equals(log2.name));
	
	assertEquals(true,objName1.contentEquals(log2.name));
}

}
