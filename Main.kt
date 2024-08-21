fun main(){
    //Array of Integers
    var numbers=arrayOf(1,2,3,4,5)
    //Array of strings
    var words:Array<String> =arrayOf("Kotlin","Java","Python")
    //Array of Arrays
    var multi= arrayOf(arrayOf(1,2,3,4,5), arrayOf(5,6,7,8,9,10), arrayOf(11,12,13,14,15))
    // Array of squares using lambda function
    val squares=Array(5) {i->i*i}
    var firstNumber=numbers[0]
    var secondWord=words[1]
    println("First number: $firstNumber")
    println("Second word: $secondWord")
    numbers[2]=30
    println("Modified third number: ${numbers[2]}")
    //using for statement
    for(num in numbers){
        println(num)
    }
    //using forEach statement
    println("Words array using forEach:")
    words.forEach{word-> println(word) }
    //properties of array
    val size=numbers.size
    println("Size of numbers array: $size")
    //isEmpty and isNotEmpty funtions
    if(numbers.isEmpty()){
        println("Numbers array is empty")
    }
    else{
        println("Numbers array is not empty")
    val firstElement=numbers.first()
        val lastElement=numbers.last()


    }
}
//Design a kotlin program for a store to determine eligibility for a special offer based on the total amount and memberships status
//Instruction:
//1.Create a Kotlin program that stimulates a discount suystem for a store
//2.Define two variables:
//A variable representing the total amount of purchase
//