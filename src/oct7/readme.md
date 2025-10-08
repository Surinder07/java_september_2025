## Recap 

1. 2d array 
2. memory - stack and heap 
3. static keyword 
        - variable 
        - method 
        - block 
        - class [skip]

local and instance variable 
4. constructor 
        this keyword 
  

this - to refer the instance variable 

this.x - instance variable 


## stack                           Heap 
local variable                     instance variable 
object reference                   actual object 


Student - id , name 

class Student{
  int id;
  String name; // instance variable 

}

Student student         ------>    new Student(101, "Mike");

## static 
belongs to class not to objects 


static context                  non static context

## static variable 
shared property of the class 


class Employee {

id 
name
email 
phone 
static companyName = "Google";

emp1 = 101 Mike mike34@gmail.com 312344 
emp2 = 102 Peter mike324@gmail.com 2134
emp3 = 104 Mark mike34@gmail.com 1043000
.....
emp4 = 104 Test mike1@gmail.com 1000034 


## static method
## static block 
## instance block


### October 7 

Strings 
1. a character array 
or 
2. sequence of characters treated like a single object 

String is non primitive data type 
String is a class 

## how to create a string 
1. literal 

String name = "Chetan";

2. using new keyword 
String city = new String("Toronto");


## characteristisc 
Strings are immutable 
once the object is created,you cannot modify the string object 

String name = "Chetan";
String studentName = "Chetan";
String myName = "Chetan";
myName = "Mike"

Garbage Collector : Mark and sweep ,garbage colltr
String city = "Toronto";                gc()

Garbage Collector :
https://www.freecodecamp.org/news/garbage-collection-in-java-what-is-gc-and-how-it-works-in-the-jvm/


## String methods 
https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
















