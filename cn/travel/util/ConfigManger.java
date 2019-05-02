package cn.travel.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigManger {

	private static ConfigManger configManger;
	private static Properties properties;

	private ConfigManger() {

		properties = new Properties();
		InputStream is = ConfigManger.class.getClassLoader()
				.getResourceAsStream("database.properties");

		try {
			properties.load(is);
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static ConfigManger getInstance(){
		if(configManger == null){
			configManger = new ConfigManger();
		}
		return configManger;
		
	}
	public static String getString(String key){
		return properties.getProperty(key);
		
		
	}
}
