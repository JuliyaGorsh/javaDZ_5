
//1.Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

public class javaDZ_5 {
	public static void main(String[] args) {
		PhoneBook phoneBook1 = new PhoneBook();
		phoneBook1.add("Иванов", "89029518462");
		phoneBook1.add("Иванов", "89023925454");
		phoneBook1.add("Петров", "89005558456");
		phoneBook1.add("Сидоров", "89533596556");
		phoneBook1.add("Петров", "86667778899");
		phoneBook1.add("Мама", "89102365486");
		phoneBook1.add("Папа", "89152364535");
		phoneBook1.showContacts();;
	}
}



//2.Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин,
// Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова,
// Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
//Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.


//
//import java.util.Collection;
//import java.util.LinkedList;
//import java.util.TreeMap;
//
//public class javaDZ_5 {
//	public static void main(String[] args) {
//		String data = "Иван Иванов,\n" + "Светлана Петрова,\n" + "Кристина Белова,\n" + "Анна Мусина,\n" +
//				"Анна Крутова,\n" + "Иван Юрин,\n" + "Петр Лыков,\n" + "Павел Чернов,\n" + "Петр Чернышов,\n" +
//				"Мария Федорова,\n" + "Марина Светлова,\n" + "Мария Савина,\n" + "Мария Рыкова,\n" + "Марина Лугова,\n"
//				+ "Анна Владимирова,\n" + "Иван Мечников,\n" + "Петр Петин,\n" + "Иван Ежов.";
//
//		LinkedList<String> parsedData = parsingNames(data);
//
//		System.out.println("Повторяющиеся имена с количеством повторений:");
//		TreeMap<String, Integer> countMap = getFillingCount(parsedData);
//		System.out.println(countMap);
//
//		TreeMap<String, Integer> sortMap = getSortedByValue(countMap);
//		System.out.println("Отсортированный список по убыванию популярности:");
//		System.out.println(sortMap);
//	}
//	static LinkedList<String> parsingNames(String data) {
//		LinkedList<String> list = new LinkedList<>();
//		String[] dataArr = data.replaceAll(",", "").replaceAll("\\.", "").split("\n");
//		for (String fullName : dataArr) {
//			list.add(fullName.split(" ")[0]);
//		}
//		return list;
//	}
//	static TreeMap<String, Integer> getFillingCount(LinkedList<String> data) {
//		TreeMap<String, Integer> map = new TreeMap<String, Integer>() {
//		};
//		for (String name : data) {
//			if (map.containsKey(name)) {
//				map.put(name, map.get(name) + 1);
//			} else {
//				map.put(name, 1);
//			}
//		}
//		return map;
//	}
//	static TreeMap<String, Integer> getPrintMap(TreeMap<String, Integer> unsortedMap) {
//		Collection<Integer> value = unsortedMap.values();
//		System.out.println(value);
//		return unsortedMap;
//	}
//	static TreeMap<String, Integer> getSortedByValue(TreeMap<String, Integer> unsortedMap) {
//		CountComparator vc = new CountComparator(unsortedMap);
//		TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>(vc) {
//		};
//		sortedMap.putAll(unsortedMap);
//		return sortedMap;
//	}
//}