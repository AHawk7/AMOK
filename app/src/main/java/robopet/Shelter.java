
package robopet;

import java.io.Console;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// changes in menus to adJust to robot pets addition
// two additional options for adding robots and listing robots.

public class Shelter {

	Map<String, Pet> shelterMap = new HashMap<>();
	int choice2;
	String petName;
	String description;
	boolean canine;
	String pet;

	// 16 pets for the shelter
	public void existingPets() {

		OrganicDog dog1 = new OrganicDog("", "",50, 50, 10, 5, 5);
		dog1.setName("Snoopy");
		dog1.setDescription("White Beagle");
		// dog1.setDays(20);
		shelterMap.put("Snoopy", dog1);

		OrganicDog dog2 = new OrganicDog("", "",50, 50, 10, 5,5);
		dog2.setName("Scooby");
		dog2.setDescription("Hound");
		// dog2.setDays(29);
		shelterMap.put("Scooby", dog2);

		OrganicDog dog3 = new OrganicDog("", "",50, 50, 10, 5, 5);
		dog3.setName("Pongo");
		dog3.setDescription("Dalmatian");
		// dog3.setDays(12);
		shelterMap.put("Pongo", dog3);

		OrganicDog dog4 = new OrganicDog("", "",50, 50, 10, 5, 5);
		dog4.setName("Hooch");
		dog4.setDescription("Mastiff");
		// dog4.setDays(30);
		shelterMap.put("Hooch", dog4);

		OrganicCat cat1 = new OrganicCat("", "",50, 50, 10, 5, 5);
		cat1.setName("Garfield");
		cat1.setDescription("Orange Tabby");
		// cat1.setDays(18);
		shelterMap.put("Garfield", cat1);

		OrganicCat cat2 = new OrganicCat("", "", 50, 50, 10, 5, 5);
		cat2.setName("Tom");
		cat2.setDescription("Alley Cat");
		// cat2.setDays(17);
		shelterMap.put("Tom", cat2);

		OrganicCat cat3 = new OrganicCat(petName,description, 50, 50, 5, 10, 5);
		cat3.setName("Sassy");
		cat3.setDescription("Black Tabby");
		// cat3.setDays(22);
		shelterMap.put("Sassy", cat3);

		OrganicCat cat4 = new OrganicCat("", "",50, 50, 10, 5, 5);
		cat4.setName("Mr. Bigglesworth");
		cat4.setDescription("Hairless");
		// cat4.setDays(33);
		shelterMap.put("Mr. Bigglesworth", cat4);

		RoboDog roboDog1 = new RoboDog(petName, description, false, true, 50, 100);
		roboDog1.setName("Bruiser");
		roboDog1.setDescription("Chihuahua");
		// roboDog1.setDays(28);
		shelterMap.put("Bruiser", roboDog1);

		RoboDog roboDog2 = new RoboDog( petName,description, false, true, 50, 100 );
		roboDog2.setName("Lassie");
		roboDog2.setDescription("Collie");
		// roboDog2.setDays(44);

		shelterMap.put("Lassie", roboDog2);
		RoboDog roboDog3 = new RoboDog(petName, description, false, true, 50, 100);
		roboDog3.setName("Clifford");
		roboDog3.setDescription("Big Red Dog");
		// roboDog3.setDays(23);
		shelterMap.put("Clifford", roboDog3);

		RoboDog roboDog4 = new RoboDog(petName, description, false, true, 50, 100);
		roboDog4.setName("Air Bud");
		roboDog4.setDescription("Golden Retriever");
		// roboDog4.setDays(7);
		shelterMap.put("AirBud", roboDog4);

		RoboCat roboCat5 = new RoboCat(petName, description, false, true, 50, 100);
		roboCat5.setName("Salem");
		roboCat5.setDescription("Black Witch Cat");
		// robot5.setDays(18);
		shelterMap.put("Salem", roboCat5);

		RoboCat roboCat6 = new RoboCat(petName, description, false, true, 50, 100);
		roboCat6.setName("Morris");
		roboCat6.setDescription("Commercial Cat");
		// robot6.setDays(21);
		shelterMap.put("Morris", roboCat6);

		RoboCat roboCat7 = new RoboCat(petName, description, false, true, 50, 100);
		roboCat7.setName("Grumpy Cat");
		roboCat7.setDescription("Tardar");
		// roboCat7.setDays(33);
		shelterMap.put("Grumpy Cat", roboCat7);

		RoboCat roboCat8 = new RoboCat("", "", false, true, 50, 100);
		roboCat8.setName("Mr. Jinx");
		roboCat8.setDescription("Himalayan");
		// roboCat8.setDays(14);
		shelterMap.put("Mr.Jinx", roboCat8);

	}

	// methods to add the four kinds of pets
	public void addPet() {

		System.out.println("");

		System.out.println("1)  Add Organic Dog\r\n" + //
				"\r\n" + //
				"2)  Add Organic Cat\r\n" + //
				"\r\n" + //
				"3)  Add Robotic Dog\r\n" + //
				"\r\n" + //
				"4)  Add Robotic Cat\r\n" + //
				"\r\n" + //
				"");

		KeyboardInput num1 = new KeyboardInput();
		choice2 = num1.getIntegerValue("Enter a number 1-4: ");

		switch (choice2) {
			case 1:
				addOrganicDog();
				break;
			case 2:
				addOrganicCat();
				break;
			case 3:
				addRoboticDog();
				break;
			case 4:
				addRoboticCat();
				break;
		}

	}

	public void addOrganicDog() {
		do {
			System.out.println("Enter Pet Name (identical name will not save)");
			KeyboardInput name = new KeyboardInput();
			petName = name.getStringValue("");
		} while (shelterMap.containsKey(petName) == true);
		System.out.println();
		System.out.println("Enter Pet Description");
		KeyboardInput newDescription = new KeyboardInput();
		description = newDescription.getStringValue("");
		System.out.println("");
		OrganicDog pet = new OrganicDog(petName, description, 50, 50, 10, 5, 5);
		pet.setName(petName);
		pet.setDescription(description);
		// pet.setDays(1);
		shelterMap.put(petName, pet);
		System.out.println();

	}

	public void addOrganicCat() {
		do {
			System.out.println("Enter Pet Name (identical name will not save)");
			KeyboardInput name = new KeyboardInput();
			petName = name.getStringValue("");
		} while (shelterMap.containsKey(petName) == true);
		System.out.println();
		System.out.println("Enter Pet description");
		KeyboardInput newDescription = new KeyboardInput();
		description = newDescription.getStringValue("");
		System.out.println("");
		OrganicCat pet = new OrganicCat(petName, description, 50, 50, 5, 5, 5);
		pet.setName(petName);
		pet.setDescription(description);
		// pet.setDays(1);
		shelterMap.put(petName, pet);
		System.out.println();
	}

	public void addRoboticDog() {
		do {
			System.out.println("Enter Pet Name (identical name will not save)");
			KeyboardInput name = new KeyboardInput();
			petName = name.getStringValue("");
		} while (shelterMap.containsKey(petName) == true);
		System.out.println();
		System.out.println("Enter Pet description");
		KeyboardInput newDescription = new KeyboardInput();
		description = newDescription.getStringValue("");
		System.out.println("");
		RoboDog pet = new RoboDog(petName, description,false, true, 50, 100);
		pet.setName(petName);
		pet.setDescription(description);
		// pet.setDays(1);
		shelterMap.put(petName, pet);
		System.out.println();
	}

	public void addRoboticCat() {
		do {
			System.out.println("Enter Pet Name (identical name will not save)");
			KeyboardInput name = new KeyboardInput();
			petName = name.getStringValue("");
		} while (shelterMap.containsKey(petName) == true);
		System.out.println();
		System.out.println("Enter Pet description");
		KeyboardInput newDescription = new KeyboardInput();
		description = newDescription.getStringValue("");
		System.out.println("");
		RoboCat pet = new RoboCat(petName, description, false, true, 50, 100);
		pet.setName(petName);
		pet.setDescription(description);
		// pet.setDays(1);
		shelterMap.put(petName, pet);
		System.out.println();

	}

	// 5 methods to list pets
	public void listPet() {
		for (Map.Entry<String, Pet> entry : shelterMap.entrySet()) {
			if (entry.getValue().isAlive() == true && entry.getValue().isCanine() == true) {
				System.out.print("Organic Dog  - ");
			}
			if (entry.getValue().isAlive() == true && entry.getValue().isCanine() == false) {
				System.out.print("Organic Cat  - ");
			}
			if (entry.getValue().isAlive() == false && entry.getValue().isCanine() == true) {
				System.out.print("Robotic Dog  - ");
			}
			if (entry.getValue().isAlive() == false && entry.getValue().isCanine() == false) {
				System.out.print("Robotic Cat  - ");
			}
			System.out.println(entry.getKey() + "   " + entry.getValue().getDescription());
			entry.getValue().infoPet();
			Console console = System.console();
			System.out.println("Press ENTER key to continue...");
			console.readLine();
		}
	}

	public void listOrganicDog() {
		for (Map.Entry<String, Pet> entry : shelterMap.entrySet()) {
			if (entry.getValue().isAlive() == true && entry.getValue().isCanine() == true) {
				System.out.print("Organic Dog  - ");
				System.out.println(entry.getKey() + "   " + entry.getValue().getDescription());
				entry.getValue().infoPet();
				Console console = System.console();
				System.out.println("Press ENTER key to continue...");
				console.readLine();
			}
		}
	}

	public void listOrganicCat() {
		for (Map.Entry<String, Pet> entry : shelterMap.entrySet()) {
			if (entry.getValue().isAlive() == true && entry.getValue().isCanine() == false) {
				System.out.print("Organic Cat  - ");
				System.out.println(entry.getKey() + "   " + entry.getValue().getDescription());
				entry.getValue().infoPet();
				Console console = System.console();
				System.out.println("Press ENTER key to continue...");
				console.readLine();
			}
		}
	}

	public void listRoboticDog() {
		for (Map.Entry<String, Pet> entry : shelterMap.entrySet()) {
			if (entry.getValue().isAlive() == false && entry.getValue().isCanine() == true) {
				System.out.print("Robotic Dog  - ");
				System.out.println(entry.getKey() + "   " + entry.getValue().getDescription());
				entry.getValue().infoPet();
				Console console = System.console();
				System.out.println("Press ENTER key to continue...");
				console.readLine();
			}
		}
	}

	public void listRoboticCat() {
		for (Map.Entry<String, Pet> entry : shelterMap.entrySet()) {
			if (entry.getValue().isAlive() == false && entry.getValue().isCanine() == false) {
				System.out.print("Robotic Cat  - ");
				System.out.println(entry.getKey() + "   " + entry.getValue().getDescription());
				entry.getValue().infoPet();
				Console console = System.console();
				System.out.println("Press ENTER key to continue...");
				console.readLine();
			}
		}
	}

	// two options from iterating map care or remove pets
	public void choosePet() {

		KeyboardInput num1 = new KeyboardInput();
		System.out.println();
		choice2 = num1.getIntegerValue("\r\n" + //
				"1) Care for Pets   2) Remove Pet from List   3) Skip");

		switch (choice2) {
			case 1:
				carePet();
				break;
			case 2:
				removePet();
				break;
			case 3:
				break;
		}
	}

	public void carePet() {
		{
			for (Map.Entry<String, Pet> entry : shelterMap.entrySet()) {
				System.out.println();
				System.out.println(entry.getKey() + " " + entry.getValue().getDescription());
				entry.getValue().infoPet();
				if (entry.getValue().isAlive() == false) {
					KeyboardInput num1 = new KeyboardInput();
					choice2 = num1.getIntegerValue("1) Charge Pet  2) Change Oil  3) Skip a day");

					switch (choice2) {
						case 1:
							entry.getValue().tick();
							entry.getValue().batteryLevel();
							System.out.println();
							System.out.println("After Charging Pet");
							entry.getValue().infoPet();
							break;
						case 2:
							entry.getValue().tick();
							entry.getValue().oilLevel();
							System.out.println();
							System.out.println("After Changing Oil");
							entry.getValue().infoPet();
							break;
						case 3:
							entry.getValue().tick();
							break;

					}
					Console console = System.console();
					System.out.println("Press ENTER key to continue...");
					console.readLine();
				}

				if (entry.getValue().isCanine() == false && entry.getValue().isAlive() == true) {
					OrganicDog dog = (OrganicDog)entry.getValue();
					KeyboardInput num1 = new KeyboardInput();

					choice2 = num1
							.getIntegerValue(
									"1) Feed  2) Water  3) Clean  4) Play  5) Clean cage  6) Skip a day");

					switch (choice2) {
						case 1:
						dog.feed();
							entry.getValue().tick();
							System.out.println();
							System.out.println("After Feeding dog");
							entry.getValue().infoPet();
							break;
						case 2:
							dog.water();
							entry.getValue().tick();
							System.out.println();
							System.out.println("After Watering dog");
							entry.getValue().infoPet();
							break;
						case 3:
							dog.clean();
							entry.getValue().tick();
							System.out.println();
							System.out.println("After Cleaning dog");
							entry.getValue().infoPet();
							break;
						case 4:
							dog.play();
							entry.getValue().tick();
							System.out.println();
							System.out.println("After Playing with dog");
							entry.getValue().infoPet();
							break;
						case 5:
							dog.cleanCage();
							entry.getValue().tick();
							System.out.println();
							System.out.println("After Changing cage");
							entry.getValue().infoPet();
							break;
						case 6:
							System.out.println();
							entry.getValue().tick();
							break;

					}
					Console console = System.console();
					System.out.println("Press ENTER key to continue...");
					console.readLine();
				}

				if (entry.getValue().isCanine() == true && entry.getValue().isAlive() == true) {
					KeyboardInput num1 = new KeyboardInput();
					choice2 = num1
							.getIntegerValue("1) Feed  2) Water  3) Clean  4) Play  5) Clean Cage  6)Skip a day");

					switch (choice2) {
						case 1:
							entry.getValue().feed();
							entry.getValue().tick();
							System.out.println();
							System.out.println("After Feeding Dog");
							entry.getValue().infoPet();
							break;
						case 2:
							entry.getValue().water();
							entry.getValue().tick();
							System.out.println();
							System.out.println("After Watering Dog");
							entry.getValue().infoPet();
							break;
						case 3:
							entry.getValue().clean();
							entry.getValue().tick();
							System.out.println();
							System.out.println("After Cleaning Dog");
							entry.getValue().infoPet();
							break;
						case 4:
							entry.getValue().play();
							entry.getValue().tick();
							System.out.println();
							System.out.println("After Playing with Dog");
							entry.getValue().infoPet();
							break;
						case 5:
							entry.getValue().cleanCage();
							entry.getValue().tick();
							System.out.println();
							System.out.println("After Cleaning Cage");
							entry.getValue().infoPet();
							break;
						case 6:
							System.out.println();
							entry.getValue().tick();
							break;

					}
					Console console = System.console();
					System.out.println("Press ENTER key to continue...");
					console.readLine();
				}
			}

		}

	}

	public void removePet() {

		Iterator<Map.Entry<String, Pet>> iterator = shelterMap.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, Pet> entry = iterator.next();
			String key = entry.getKey();
			System.out.println();
			System.out.println(key + " " + entry.getValue().getDescription());
			if (entry.getValue().getDays() == 0 && entry.getValue().isAlive() == true) {
				System.out.println("is dead.");
			}
			if (entry.getValue().getDays() == 0 && entry.getValue().isAlive() == false) {
				System.out.println("is non-functioning.");
			}
			KeyboardInput num1 = new KeyboardInput();
			System.out.println();
			choice2 = num1.getIntegerValue("\r\n" + //
					"1) Remove Pet from List   2) Skip");
			System.out.println();

			switch (choice2) {
				case 1:
					if (entry.getValue().getDays() == 0 && entry.getValue().isAlive() == false) {
						System.out.println(key + " has been sent to the junkyard");
						System.out.println();
					}
					if (entry.getValue().getDays() == 0 && entry.getValue().isAlive() == true) {
						System.out.println(key + " has been sent to the pet cemetary");
						System.out.println();
					}
					if (entry.getValue().getDays() > 0) {
						System.out.println(key + " has been adopted after " + entry.getValue().getDays() + " days");
						System.out.println();
					}
					shelterMap.remove(key);
					Console console = System.console();
					System.out.println("Press ENTER key to continue...");
					console.readLine();
					return;
				case 2:
					break;

			}

		}
		;

	}
}
