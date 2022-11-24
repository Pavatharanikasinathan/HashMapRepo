package HashMap;

import java.util.HashMap;

public class Developer {
	public static void main(String[] args) {
		String name1 = "Nirmal";
		String name2 = "venkat";
		String name3 = "Bhava";
		String name4 = "Arjun";
		String name5 = "Srithar";
		HashMap<Integer,String> developers = new HashMap<>();
		developers.put(1, name1);
		developers.put(2,name2);
		developers.put(5,name3);
		developers.put(4, name4);
		developers.put(8, name5);
		developers.put(5, name1);
		/*System.out.println(developers.get(5));
		developers.remove(1);
		System.out.println(developers.keySet());
		System.out.println(developers.values());
		System.out.println(developers);*/
		/*for(Integer x:developers.keySet()) {
			System.out.println(x+ " "+developers.get(x));//iterate key and get values
			
		}*/
		/*for(String y:developers.values()) {
			System.out.println(y);
		}*/
		//developers.keySet().forEach(i->System.out.println(i+" "+developers.get(i))); 
		//developers.values().forEach(z->System.out.println(z));
		developers.forEach((i,z)->System.out.println(i+" "+z));
		}
	
		
	}


