class person {
  int age;
  String Name;
  String country;
  void setAge(int a){
    age = a;
  }
  void setName(String name){
    Name = name;
  }
  void setCountry(String country){
    this.country = country;
  }
  int getAge(){
    return age;
  }
  String getName(){
    return Name;
  }
  String getCountry(){
    return country;
  }
  void Display(){
    System.out.println("Name: "+getName()+", "+"Age: "+getAge()+", "+"Country: "+getCountry()+";");
  }
  public static void main(String[] args) {
    person p = new person();
    p.setAge(20);
    p.setCountry("India");
    p.setName("Aryan");
    p.Display();
  }
}
