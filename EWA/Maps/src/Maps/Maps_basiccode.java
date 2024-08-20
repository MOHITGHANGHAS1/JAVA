package Maps;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Maps_basiccode {

	public static void main(String[] args) {
		Map<String, Color > samplecolor =  new HashMap<>();
		samplecolor.put("jullet", Color.BLUE);
		samplecolor.put("romeo", Color.GREEN);
		samplecolor.put("adam", Color.RED);
		samplecolor.put("eye", Color.BLUE);
		samplecolor.put("aman", Color.ORANGE);
		
		
	//enter key value of set
		Set<String> KeySet= samplecolor.keySet();
		for(String key:KeySet) {
			Color value=samplecolor.get(key);
			System.out.println(key+":"+value );
		}
				
	
		

	}

}
