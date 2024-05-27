fun main() {
    val count:Int
    val count1=30
    count=60

    val sum=count*count1
    println("You have $count unread messages.")
    println("Sum:$sum ")
    println(name())
    println(add())
    println(Add(b=5,a=49))
    println(Add(b=5))
}
fun name():String{
    val name="Kumar Devashish"
    val branch="CSE"
    return "$name\n$branch"
}
fun add():Int{
    val a=16
    val b=63
    val sum =a+b
    return sum
}
fun Add(a:Int=9,b:Int):Int{
    val x=a
    val y=b
    val z=x-y
    return z
}