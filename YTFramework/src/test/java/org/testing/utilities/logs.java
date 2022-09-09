package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class logs {
	
	public static void takeLogs(String classname, String logMessg) {
		
		DOMConfigurator.configure("../YTFramework/Logslayout.xml");
		Logger L=Logger.getLogger(classname);
		L.info(logMessg);
	}

}
