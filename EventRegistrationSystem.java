import java.util.*;

class Participant {
    int id;
    String name;

    Participant(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

public class EventRegistrationSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Participant> list = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        int choice;

        do {
            System.out.println("\n--- Event Registration System ---");
            System.out.println("1. Add Participant");
            System.out.println("2. Display All Participants");
            System.out.println("3. Search Participant");
            System.out.println("4. Remove Participant");
            System.out.println("5. Display Unique IDs (HashSet)");
            System.out.println("6. Display Registration Order (LinkedHashSet)");
            System.out.println("7. Display Sorted IDs (TreeSet)");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    if (hashSet.contains(id)) {
                        System.out.println("Duplicate ID! Registration failed.");
                        break;
                    }

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    Participant p = new Participant(id, name);
                    list.add(p);
                    hashSet.add(id);
                    linkedSet.add(id);
                    treeSet.add(id);

                    System.out.println("Participant added successfully!");
                    break;

                case 2:
                    if (list.isEmpty()) {
                        System.out.println("No participants found.");
                    } else {
                        for (Participant part : list) {
                            System.out.println(part);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (Participant part : list) {
                        if (part.id == searchId) {
                            System.out.println("Found: " + part);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Participant not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to remove: ");
                    int removeId = sc.nextInt();
                    boolean removed = false;

                    Iterator<Participant> it = list.iterator();
                    while (it.hasNext()) {
                        Participant part = it.next();
                        if (part.id == removeId) {
                            it.remove();
                            hashSet.remove(removeId);
                            linkedSet.remove(removeId);
                            treeSet.remove(removeId);
                            removed = true;
                            System.out.println("Participant removed.");
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Participant not found.");
                    }
                    break;

                case 5:
                    System.out.println("Unique IDs (HashSet): " + hashSet);
                    break;

                case 6:
                    System.out.println("Registration Order (LinkedHashSet): " + linkedSet);
                    break;

                case 7:
                    System.out.println("Sorted IDs (TreeSet): " + treeSet);
                    break;

                case 8:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 8);

        sc.close();
    }
}