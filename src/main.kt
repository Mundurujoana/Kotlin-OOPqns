fun main() {
    val subjects = 5
    println("Data type of subjects: " + subjects::class.simpleName)

    val marks = 47.5
    println("Data type of marks: " + marks::class.simpleName)

    val name = "Deepak"
    println("Data type of name: " + name::class.simpleName)
    //qn1
    addNum(3, 9)

    //qn2
    FindSq(6)

    //qn3
    funNames("Joana", "Munduru")

    //qn4
    Charstr(arrayOf())

    //qn5
    arrStr()

    //6
    var BMW = Mobile("AA4","BMW","1000000")
    println(BMW.MRP)
    println(BMW.Model)
    println(BMW.Brand)

    //qn7
    var person = Human("kamau", "jane", 14)
    println(person.age)
    person.fullName()

   //qn8
    var me = Employee("kamau", "mundujoana@gmail.com", "Skygardens")
    println(me.Email)
    println(me.Company)
//qn9
    addIntg(6,9)
        //qn10

  arrLoop(arrayOf())
}

//1: Write a function that Adds Two Numbers
fun addNum(x:Int, y:Int){
    var sum = x+y
    println(sum)

}
//2:Write a function that finds the square of a number
fun FindSq(a:Int){
    var square = a*a
    println(square)

}

//3:Write a function that displays names
fun funNames(fname:String, lname:String) {
    var allNames = "$fname $lname"
    println(allNames)
}

//4:Given below is an example of Character  Convert char to String
//fun main(args: Array<String>) {
  //  Val ch = 'c' }
//fun charStr(args: String) {
    //val ch = 'c'
   // val st = Character.toString(ch)
    // st = String.valueOf(ch);
   // println("The string is: $st") }
fun Charstr(x: Array<String>) {
    val ch = '7'
    val string = Character.toString(ch)
    println(string)        // c
}
//5:Given below is an example of a kotlin character array convert to string.
//fun main(args: Array<String>) {
//    val ch = charArrayOf('a', 'e', 'i', 'o', 'u')
//  }
fun arrStr( ) {
    val chars = charArrayOf('a', 'e', 'i', 'o', 'u')
    val str = String(chars)
    println(str)
}
//OOP QUESTIONS.

//1:Create a class Mobile containing the following state
//a(Model
//b(Brand
//c(MRP
//a( print out the detail of the mobile
class Mobile (var Model:String, var Brand:String, var MRP:String){

}

//2:Create a class containing firstName,lastName, and age
//a(Println fullName  and age
class Human(var firstName: String, var lastName:String, var age:Int){
fun fullName(){
    var myIdentity = "$firstName $lastName"
    println(myIdentity)
}
}

//3:Create a class employee containing the following state
//a: Name
class Employee(var Name:String, var Email:String, var Company:String){
}

//4:4:Given below is an example of data type.
//a( find there data types
//Val subjects = 5
//val marks = 47.5
//val name = "Deepak"

//5:Write a  Program to Add Two Integers
fun addIntg(a:Int, b:Int) {
    var sum = a+b
    println(sum)
}

//6:Given below is an example of an array
//i: Print an Array using For loop
//Val array = intArrayOf(1, 2, 3, 4, 5)
fun arrLoop(args : Array<String>) {
    val array = intArrayOf(1, 2, 3, 4, 5)
    for (value in array) {
        println(value)
    }
}

