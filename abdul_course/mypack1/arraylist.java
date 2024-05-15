import java.util.*;
class arraylist{
	public static void main(String args[]){
		ArrayList<Integer> inte=new ArrayList<>();
		inte.add(1);
		inte.add(2);
		inte.add(3);
		inte.add(4);
		System.out.println(inte.get(0));
		inte.remove(2);
		System.out.println(inte);
		System.out.println(inte.size());
		inte.add(34);
		inte.add(10);
		inte.add(6);
		Collections.sort(inte);
		System.out.println(inte);
		System.out.println(Collections.max(inte));
		inte.remove(Integer.valueOf(1));
		System.out.println(inte);
	}
}
