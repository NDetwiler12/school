
package school;
import java.util.ArrayList;

public class Person 
{
    
//    private static int numPeople =10;
//    private static int currentPeopleIndex =0;
//    private static Person peoples[] = new Person[numPeople];
    private static ArrayList<Person> people = new ArrayList<Person>();
    
    enum Gender 
    {
        Male, Female
    }
    
    private String name;
    private int weight;
    private Gender gender;
    
    public static Person addPerson(String _name, Gender _gender, int _weight)
    {
        Person temp = new Person(_name, _gender, _weight);
//        people[currentPeopleIndex++] = temp;
        people.add(temp);
        return(temp);
    }
    
    Person()
    {
        gender = Gender.Male;
        name = "name";
        weight = 100;
    }
    
    Person (String _name, Gender _gender, int _weight)
    {
        name = _name;
        weight = _weight;
        gender = _gender;
    }
    
    public Gender getGender()
    {
        return(gender);
    }
    
    public void setGender(Gender _gender)
    {
        gender =_gender;
    }
    
    public int getWeight()
    {
        return(weight);
    }
    
    public void setWeight(int _weight)
    {
        weight = _weight;
    }
    
    public String getName()
    {
        return(name);
    }
    
    public void setName(String _name)
    {
        name = _name;
    }
    
    public static void printNames()
    {
        System.out.println("===NAMES===");
//        for (int i =0; i <people.length; i++)
//        {
//            if (people[i] != null)
//                System.out.println(people[i].getName());
//        }for (int i =0; i <people.length; i++)
        for (Person temp : people)
        {
                System.out.println(temp.getName());
        }
        
    }
   
    public String toString()
    {
            return(name + " " gender + " " + weight);
    }
    
}
