public class Student {

    String name ;
    int age ;
    String address;

    public Student(String name , int age , String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void setName (String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getName (String name){
        return name ;
    }
    public int getAge(){
        return age ;
    }
    public String getAddress(String address){
        return address;
    }

    public static void main (String args[]){
        Student anushka = new Student("anushka", 19, "barawankalan");
    
        System.out.println(anushka.getAge());
    }

}
