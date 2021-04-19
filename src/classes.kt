fun main() {
    var car=Car("subaru","legacy","white",5)
    car.carry(8)
    car.identity()
   println( car.calculateParkingFees(4))
    var bus=Bus("Mercedes","naboka","green",55)
    println(bus.maxTripFare(80.00))
   println( bus.calculateParkingFees(5))
}
 open class Car (var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int){
        if (people<=capacity){
            println("carrying $people passengers")

        }
        else{
            var x=people-capacity
           println("overcapacity by $x people")
        }
    }
    fun identity(){
        println("I am a $color $make $model")
    }
     open fun calculateParkingFees(hours:Int):Int{
        return (hours*20)
    }
}
class Bus(make: String,model: String,color: String,capacity: Int):Car(make,model, color, capacity){
    fun maxTripFare(fare:Double):Double{
        return (capacity*fare)
    }
     override fun calculateParkingFees(hours: Int):Int{
        return (hours*capacity)
    }
}

