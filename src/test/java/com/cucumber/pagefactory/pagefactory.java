package com.cucumber.pagefactory;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Matcher;

import com.cucumber.base.basepage;
import com.cucumber.utilities.propertiesFile;
//import com.cucumber.utilities.;


public class pagefactory {
	
	static propertiesFile common = new propertiesFile();
	
	static final HashMap<String, String> packageClassMap = new HashMap<String, String>();

	public static String getPackage() throws IOException {
	String packageName= common.getproperties("page.packages");
	return packageName;
	}
	public basepage initialize(String pageName) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		basepage bpage = null;
		String packagename= getPackage();
		String pageClassFullName = packagename + "."
				+ pageName;
		bpage = (basepage) Class.forName(pageClassFullName)
				.newInstance();
	
		/*String formattedPageName = getRemovedSpaceName(pageName);
		try {
			String packageName = packageClassMap.get(formattedPageName);
			if (packageName != null) {
				String pageClassFullName = packageName + "."
						+ formattedPageName;
				page = (BasePage) Class.forName(pageClassFullName)
						.newInstance();
			} else {
				System.out.println("Page Class with" + formattedPageName
						+ "doesnt exist .Please provide valid page Name");*/
		return bpage;	
		}

		/*} catch (Exception e) {
			e.printStackTrace();
			
		}*/
		
		

	//}

	

	

}