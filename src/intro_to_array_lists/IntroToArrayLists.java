package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> list = new ArrayList<String>();
		//2. Add five Strings to your list
		list.add("0 a");
		list.add("1 b");
		list.add("2 c");
		list.add("3 d");
		list.add("4 e");
		//3. Print all the Strings using a standard for-loop
		for(int i=0;i<list.size();i++){
			String s = list.get(i);
		System.out.println(list.get(i));
		}
		System.out.println("\n");
		//4. Print all the Strings using a for-each loop
		for(String s : list){
			System.out.println(s);
		}
		System.out.println("\n");
		//5. Print only the even numbered elements in the list.
		for(int i=0;i<list.size();i++){
			if(i%2==0){
				System.out.println(list.get(i));
			}
			else{
				
			}
		}
		System.out.println("\n");
		//6. Print all the Strings in reverse order.
		for(int i=list.size()-1; i>-1; i--){
			System.out.println(list.get(i));
		}
		System.out.println("\n");
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i=0;i<list.size();i++){
			if(list.get(i).contains("e")){
				System.out.println(list.get(i));
			}
		}
	}
}
