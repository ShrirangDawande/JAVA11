package basic_data_structure_assignment;

import java.util.HashMap;

public class Assignment4Q7 {
    public String convertKeyValueToString(HashMap<String, Integer> map) {
    			return (map)->{
    	            String result="";
    	            for(Map.Entry<String,Integer> mp: map.entrySet())
    	            {
    	                String key = mp.getKey();
    	                int value = mp.getValue();
    	                result += key + Integer.toString(value);
    	            }
    	            return result;
    	            };
    }
    
	public static void main(String[] args) {
		Assignment4Q7 as=new  Assignment4Q7();
		HashMap<String, Integer> hashMap=new HashMap<>();
		hashMap.put("shrirang",1);
        hashMap.put("aysh",2);
        hashMap.put("pratik",3);
        hashMap.put("jack",4);
        hashMap.put("shady",5);
        System.out.println(as.convertKeyValueToString(hashMap));
	}
}
