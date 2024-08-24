class Fan{
int price=1000;
String name="Usha";
String color="Black";
String brand="Tata";
 void off(){
System.out.println("Fan is switched off");
}
void on(){
System.out.println("Fan is switched on");
}
void rotate(){
System.out.println("Fan is rotating");
}
}
class Code{
public static void main(String [] args){
Fan f1= new Fan();
System.out.println(f1.price);
System.out.println(f1.name);
System.out.println(f1.color);
f1.rotate();
}
}






