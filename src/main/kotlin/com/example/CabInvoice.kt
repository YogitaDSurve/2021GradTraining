package com.example
import kotlin.collections.sumOf as sumOf
val BOOKINGCHARGES=5
val SFARE_PER_KM=10
val SFARE_PER_MINUTE=1
val PFARE_PER_KM=15
val PFARE_PER_MINUTE=2

class CabInvoice(val rides: List<Ride>) {

    fun totalFare() = rides.sumOf { element -> element.fare() }
    fun numberOfRides() = rides.size
    fun averageFarePerRide() = totalFare() / numberOfRides()

}
