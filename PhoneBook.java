

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
	private Map<String, List<String>> dumpContact = new HashMap<>();
	void add(String name, String phoneNumber){
		if (dumpContact.containsKey(name)){
			dumpContact.get(name).add(phoneNumber);
		}
		else{
			ArrayList<String> phoneList = new ArrayList<String>();
			phoneList.add(phoneNumber);
			dumpContact.put(name, phoneList);
		}
	}
	void showContacts(){
		for (String name : dumpContact.keySet()) {
			System.out.println(name + ":");
			// ArrayList<String> numbers = dumpContact.get(name);
			// System.out.println(Arrays.toString(dumpContact.get(name)));
			int count = 0;
			for (String number : dumpContact.get(name)){
				System.out.printf("\t%d. %s\n", ++count, number);
			}
		}
	}
}