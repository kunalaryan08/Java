public class Person{
    int age;
    String name;
    Person(int age, String Name){
      this.age = age;
      name = Name;
    }
    void Display(){
      System.out.print("Name: "+name+"  ");
      System.out.println("Age: "+age);
    }
  
  public static void main(String[] args){
    Person p1 = new Person(21,"Aryan");
    Person p2 = new Person(21,"Aayush");
    p1.Display();
    p2.Display();
  }
}
