package com.example
interface typeofRide
{
    val BOOKINGCHARGES : Double
    val FARE_PER_KM : Double
    val FARE_PER_MINUTE : Double
}

class Standard: typeofRide
{
    override val BOOKINGCHARGES=5.0
    override val FARE_PER_KM=10.0
    override val FARE_PER_MINUTE=1.0

}
class Premium: typeofRide
{
    override val BOOKINGCHARGES=5.0
    override val FARE_PER_KM=15.0
    override val FARE_PER_MINUTE=2.0

}





data class Ride ( val distance:Double,val duration:Double, val rideType:typeofRide) {

    fun fare(): Double {
        return distance * rideType.FARE_PER_KM + duration * rideType.FARE_PER_MINUTE + rideType.BOOKINGCHARGES
        }
    }


