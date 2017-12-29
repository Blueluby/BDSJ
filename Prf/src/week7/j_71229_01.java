package week7;

import java.util.*;

public class j_71229_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		
		map.put("김자비", new Integer(90));
		map.put("김자비", new Integer(100));
		map.put("이지금", new Integer(100));
		map.put("강자비", new Integer(80));
		map.put("안자비", new Integer(90));
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		Iterator ito = map.entrySet().iterator();
		
		
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			System.out.println("이름 : "+entry.getKey()+
							   "점수 : "+entry.getValue());
		}
		
		set = map.keySet();
		System.out.println("참가자 명단 : " + set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total/set.size());
		System.out.println("최고점수 : "+ Collections.max(values));
		System.out.println("최저점수 : "+ Collections.min(values));
		
		
		
		
	}

}
