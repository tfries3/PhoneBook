package main;

public class Directory {

	Person[] book = new Person[0];

	public void addPerson(Person newPerson) {

		Person[] tempArray = new Person[book.length + 1];
		for (int i = 0; i < book.length; i++) {
			tempArray[i] = book[i];
		}

		tempArray[tempArray.length - 1] = newPerson;

		book = tempArray;
	}

	public Person[] getDirectory() {
		return book;
	}

	public Person getByPhoneNumber(long phoneNumber) {

		int foundIndex = 0;

		for (int i = 0; i < book.length; i++) {
			if (book[i].getPhoneNumber() == phoneNumber) {
				foundIndex = i;
			}
		}
		return book[foundIndex];
	}

	public Person[] getByFirstName(String first) {
		
		int counter = 0;
	
		for (int i = 0; i < book.length; i++) {
			if (book[i].getFirstName().equals(first)) {
				counter++;
			}
		}
	
		Person[] newArray = new Person[counter];
	
		int x = 0;
		for (int i = 0; i < book.length; i++) {
			if (book[i].getFirstName().equals(first)) {
				newArray[x] = book[i];
				x++;
			}
		}
		return newArray;
	}

	public Person[] getByLastName(String last) {
		int counter = 0;
		for (int i = 0; i < book.length; i++) {
			if (book[i].getLastName().equals(last)) {
				counter++;
			}
		}
		Person[] newArray = new Person[counter];
		int x = 0;
		for (int i = 0; i < book.length; i++) {
			if (book[i].getLastName().equalsIgnoreCase(last)) {
				newArray[x] = book[i];
				x++;
			}
		}
		return newArray;
	}

	public Person[] getByFullName(String full) {
		int counter = 0;
		for (int i = 0; i < book.length; i++) {
			if ((book[i].getFirstName() + " " + book[i].getMiddleName() + " " + book[i].getLastName()).equals(full)) {
				counter++;
			}
		}
		Person[] newArray = new Person[counter];
		int x = 0;
		for (int i = 0; i < book.length; i++) {
			if ((book[i].getFirstName() + " " + book[i].getMiddleName() + " " + book[i].getLastName()).equals(full)) {
				newArray[x] = book[i];
				x++;
			}
		}
		return newArray;
	}

	public Person[] getByStreet(String street) {
		int counter = 0;
		for (int i = 0; i < book.length; i++) {
			if (book[i].getMyStreet().equals(street)) {
				counter++;
			}
		}
		Person[] newArray = new Person[counter];
		int x = 0;
		for (int i = 0; i < book.length; i++) {
			if (book[i].getMyStreet().equals(street)) {
				newArray[x] = book[i];
				x++;
			}
		}
		return newArray;
	}

	public Person[] getByCity(String city) {
		int counter = 0;
		for (int i = 0; i < book.length; i++) {
			if (book[i].getMyCity().equals(city)) {
				counter++;
			}
		}
		Person[] newArray = new Person[counter];
		int x = 0;
		for (int i = 0; i < book.length; i++) {
			if (book[i].getMyCity().equals(city)) {
				newArray[x] = book[i];
				x++;
			}
		}
		return newArray;
	}

	public Person[] getByState(String state) {
		int counter = 0;
		for (int i = 0; i < book.length; i++) {
			if (book[i].getMyState().equals(state)) {
				counter++;
			}
		}
		Person[] newArray = new Person[counter];
		int x = 0;
		for (int i = 0; i < book.length; i++) {
			if (book[i].getMyState().equals(state)) {
				newArray[x] = book[i];
				x++;
			}
		}
		return newArray;
	}

	public Person[] getByZip(String zip) {
		int counter = 0;
		for (int i = 0; i < book.length; i++) {
			if (book[i].getMyZip().equals(zip)) {
				counter++;
			}
		}
		Person[] newArray = new Person[counter];
		int x = 0;
		for (int i = 0; i < book.length; i++) {
			if (book[i].getMyZip().equals(zip)) {
				newArray[x] = book[i];
				x++;
			}
		}
		return newArray;
	}


	public void deletePerson(Person toRemove) {
		int counter = 0;
		Person[] newBook = new Person[book.length - 1];
		for (int i = 0; i < book.length; i++) {
			if (book[i] != toRemove) {
				newBook[counter] = book[i];
				counter++;
			}
		}
		book = newBook;
	}

	public void printPersonArray(Person[] searched) {
		for (int i = 0; i < searched.length; i++) {
			searched[i].getPerson();
		}
	}

	public void printAlphabetically(Person[] searched) {

		String[] alphabetical = new String[searched.length];

		for (int i = 0; i < book.length; i++) {
			if (book[i].getFirstName().equals(searched[i].getFirstName())) {
				alphabetical[i] = searched[i].getFirstName();
			}
		}
		String temp;
		int j;
		for (int i = 0; i < alphabetical.length; i++) {
			for (j = i + 1; j < book.length; j++) {
				if (alphabetical[i].compareTo(alphabetical[j]) < 0) {
					temp = alphabetical[i];
					alphabetical[i] = alphabetical[j];
					alphabetical[j] = temp;
				}
				System.out.println(alphabetical[j].toString());

			}
		}
		for (int i = 0; i < alphabetical.length; i++) {
			if (alphabetical[i] == book[i].getFirstName()) {
				book[i].getPerson();
			}

		}
	}

}
