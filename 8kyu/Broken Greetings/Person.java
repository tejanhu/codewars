public class Person {
    String name;

    public Person(String personName) {
       name =  personName;
    }

    public String greet(String yourName) {
        
        return ("Hi " + yourName + ", my name is " + this.name);
    }
}