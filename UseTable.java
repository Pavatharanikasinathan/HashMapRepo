package HashMap;
import java.util.HashMap;
import java.util.Iterator;
public class UseTable {
	public static void main(String[] args) {
		Table table1 = new Table("DinningTable",false,8000,"Black");
		Table table2 = new Table("TeaTable",false,2800,"Brown");
		Table table3 = new Table("StudyTable",true,5000,"white");
		Table table4 = new Table("wooden",false,6500,"Blue");
		Table table5 = new Table("SteelTable",true,4200,"Silver");
		HashMap<Integer,Table> tables = new HashMap<>();
		tables.put(1, table1);
		tables.put(3, table5);
		tables.put(2, table2);
		tables.put(4, table4);
		tables.put(5, table3);
		Table max = table1;
		/*for(Integer x:tables.keySet()) {
			if(max.getPrice()<tables.get(x).getPrice()) {
				max = tables.get(x);
			}
		}
		System.out.println(max);
		//tables.forEach((x,y)->System.out.println(x+" "+y));*/
		Iterator<Table> itr = tables.values().iterator();
		while(itr.hasNext()) {
			if(itr.next().getType().contains("S")) {
				itr.remove();
			}
		}
		System.out.println(tables);
	}

}
