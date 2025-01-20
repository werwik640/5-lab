public class Main {
    public static void main(String[] args){
        Person[] people = new Person[5];
        Address sampleAddress1 = new Address("Вашингтон", "Не Ленина", 5);
        Address sampleAddress2 = new Address("Москва", "Ленина", 3);
        Address sampleAddress3 = new Address("Москва", "Возможно Ленина", 17);
        people[0] = new Person("Александр", 24, sampleAddress3);
        people[1] = new Person("Алекс", 45, sampleAddress2);
        people[2] = new Person("Алексей", 24, sampleAddress1);
        people[3] = new Person("Антон", 16, sampleAddress2);
        people[4] = new Person("Иван", 40, sampleAddress2);
        printPeople(people, 24, null, null);
        printPeople(people, "Москва", null);
        printPeople(people, "Москва", "Ленина");
    }
    public static void printPeople(Person[] people, String city, String street){
        Person[] filteredPeople = new Person[people.length];

        for (int i = 0; i < people.length; i++){
            Person person = people[i];
            Address personAddress = person.getAddress();
            if ((personAddress.getCity() == city || city == null) && (personAddress.getStreet() == street || street == null)){
                filteredPeople[i] = person;
            }
        }
        for (Person person : filteredPeople){
            if (person != null){
                person.printInfo();
            }
        }
    }

    public static void printPeople(Person[] people, int age, String city, String street){
        Person[] filteredPeople = new Person[people.length];

        for (int i = 0; i < people.length; i++){
            Person person = people[i];
            Address personAddress = person.getAddress();
            if (person.getAge() == age && (personAddress.getCity() == city || city == null) && (personAddress.getStreet() == street || street == null)){
                filteredPeople[i] = person;
            }
        }
        for (Person person : filteredPeople){
            if (person != null){
                person.printInfo();
            }
        }
    }
}