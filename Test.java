class Student{
 int id=101;
String name="Akash";
String branch="Electronics";
int age=16;
String address="Hasson";
void study(){
System.out.println("Student is studying");
}
void play(){
System.out.println("Student is playing");
}
void walk(){
System.out.println("Student is walking");
}
void run(){
System.out.println("Student is running");
}
}
class Test{
public static void main(String[] args){
 Student s=  new Student();
 System.out.println(s.id);
 System.out.println(s.address);
 System.out.println(s.age);
 System.out.println(s.branch);
 s.walk();
}
}





