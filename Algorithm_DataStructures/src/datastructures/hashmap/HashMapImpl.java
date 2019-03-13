package datastructures.hashmap;

public class HashMapImpl<K, V> {

	Entry<K, V>[] mainTable;
	int mainTableSize = 10;

	public HashMapImpl() {
		mainTable = new Entry[mainTableSize];
	}

	public int hashIndex(K key) {

		int hash = key.hashCode();
		hash = hash % mainTable.length;
		return hash;
	}

	public void put(K key, V value) {

		if (key == null) {
			Entry<K, V> newEntry = new Entry<K, V>(key, value, null);
			if (mainTable[0] == null) {
				mainTable[0] = newEntry;
			} else {
				Entry<K, V> current = mainTable[0];
				while (current != null) {
					if (current.key == null) {
						return;
					} else {
						if (current.next != null) {
							current = current.next;
						} else {
							current.next = newEntry;
						}
					}
				}
			}
		} else {
			int index = hashIndex(key);
			Entry<K, V> newEntry = new Entry<K, V>(key, value, null);
			if (mainTable[index] == null) {
				mainTable[index] = newEntry;
			} else {
				Entry<K, V> current = mainTable[index];
				while (current != null) {
					if (mainTable[index].key != null && mainTable[index].key.equals(key) == true) {
						mainTable[index].value = value;
						break;
					} else {
						if (current.next == null) {
							current.next = newEntry;
							break;
						} else {
							current = current.next;
						}
					}
				}
			}
		}
	}

	public Object get(K key) {
		if (key == null) {
			Entry<K, V> current = mainTable[0];
			while (current != null) {
				if (current.key == null) {
					return current.value;
				} else {
					if (current.next != null) {
						current = current.next;
					}
				}
			}

		} else {
			int index = hashIndex(key);
			if (mainTable[index] == null) {
				return null;
			} else if (mainTable[index].key.equals(key) == true) {
				return mainTable[index].value;
			} else {
				Entry<K, V> current = mainTable[index];
				while (current != null) {
					current = current.next;
					if (current.key.equals(key) == true) {
						return current.value;
					}
				}
			}
		}
		return null;
	}

	public void remove(K key) {
		if (key == null) {
			Entry<K, V> current = mainTable[0];
			Entry<K, V> previous = null;
			while (current != null) {
				if (current.key == key) {
					if (previous == null) {
						mainTable[0] = null;
						break;
					} else {
						if (current.next != null) {
							previous.next = current.next;
						} else {
							previous.next = null;
							break;
						}
					}
				} else {
					if (current.next != null) {
						previous = current;
						current = current.next;
					} else {
						return;
					}
				}
			}
		} else {
			int index = hashIndex(key);
			Entry<K, V> current = mainTable[index];
			Entry<K, V> previous = null;
			while (current != null) {
				if (current.key == key) {
					if (previous == null) {
						if (current.next != null) {
							System.out.println("deleting: " + current.key);
							mainTable[index] = current.next;
						} else {
							System.out.println("deleting: " + current.key);
							mainTable[index] = null;
							break;
						}
					} else {
						if (current.next != null) {
							System.out.println("print: " + current.key);
							previous.next = current.next;
						} else {
							System.out.println("printing: " + previous.next.key);
							previous.next = null;
							break;
						}
					}
				} else {
					previous = current;
					current = current.next;
				}
			}
		}
	}

	public static void main(String[] args) {
		HashMapImpl<Integer, Integer> testMap = new HashMapImpl<>();
		testMap.put(1, 45);
		testMap.put(2, 40);
		testMap.put(3, 65);
		testMap.put(null, 7);
		testMap.put(null, 20);

		// get method
		System.out.println("Value of req. key: " + testMap.get(2));
		
		// remove method
		System.out.println("Value of req. null key before: " + testMap.get(null));
		testMap.remove(null);
		System.out.println("Value of req. null key after: " + testMap.get(null));

	}
}
