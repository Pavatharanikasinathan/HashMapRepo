package HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class UseDress {
	public static void main(String[] args) {
		Dress d1 = new Dress("cotton",500,false,"Yellow",32);
		Dress d2 = new Dress("Silk",6200,true,"Pink",40);
		Dress d3 = new Dress("synthetic",2000,true,"Blue",35);
		Dress d4 = new Dress("Nylon",1500,false,"White",42);
		Dress d5 = new Dress("woolen",2500,true,"green",36);
		HashMap<String,Dress> d = new HashMap<>();
		d.put(d1.getMaterial(), d1);
		d.put(d2.getMaterial(), d3);
		d.put(d4.getMaterial(), d5);
		d.put(d3.getMaterial(), d4);
		d.put(d5.getMaterial(), d2);
		/* max = d1;
		for(String x:d.keySet()) {
			if(max.getSize()<d.get(x).getSize()) {
				max = d.get(x);
			}
		}
		System.out.println(max);*/
		/*HashMap<String,Dress> brandedDress = new HashMap<>();
		HashMap<String,Dress> localDress = new HashMap<>();
		d.forEach((x,y)->{ if(y.getIsBranded() == true) {
			brandedDress.put(x,y);
		}
 		else {
			localDress.put(x,y);
		}
		});
		brandedDress.forEach((x,y)->System.out.println(y));
			localDress.forEach((x,y)->System.out.println(y));*/
		Iterator<Dress> itr = d.values().iterator();
		while(itr.hasNext()) {
			Dress temp = itr.next();
		
			//System.out.println(temp);
			if(temp.getColor().contains("e")) {
				itr.remove();
			}
		}
		d.forEach((x,y)->System.out.println(y));
		
	}
}


