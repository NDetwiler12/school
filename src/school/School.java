
package school;

public class School 
{

    public static void main(String[] args) 
    {
        Person joe = Person.addPerson("Joe", Person.Gender.Male, 87);
        System.out.println(joe.getWeight());
        Person jill = Person.addPerson("Jill", Person.Gender.Female, 105);
        jill.setName("Julie");
        Person nick = Person.addPerson("Nick", Person.Gender.Male, 190);
        Person jacob = Person.addPerson("Jacob", Person.Gender.Female, 140);
        
        Person.printNames();
    }
}
