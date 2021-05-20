package HW5;

public class HomeWorkApp {

    public static void main(String[] args) {
        Person[] persArray = new Person[5];

        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Petrov Petr", "Manager", "pepetr@mailbox.com", "892424143", 50000, 56);
        persArray[2] = new Person("Sidorov Sidr", "Developer", "sisidr@mailbox.com", "898374656", 80000, 34);
        persArray[3] = new Person("Makeev Alexandr", "Director", "maalex@mailbox.com", "892384765", 120000, 47);
        persArray[4] = new Person("Putin Vladimir", "Tester", "admin@mailbox.com", "894958595", 100000, 31);

        for (int i = 0; i < 5; i++) {
            if (persArray[i].getAge() > 40) persArray[i].print();
        }
    }
}
