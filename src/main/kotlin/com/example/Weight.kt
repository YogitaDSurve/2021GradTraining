package com.example

data class Weight(val value2:Double, val unit2: WeightUnit) {

    fun add1(weight: Weight): Weight {

        val convertedValue = weight.to(unit2).value2
        return Weight(convertedValue + this.value2, unit2)

    }

    fun to(targetUnit: WeightUnit): Weight = Weight((value2 * unit2.scale) / targetUnit.scale, targetUnit)

}
enum class WeightUnit(val scale: Double) {
    Kilogram(1000.0),
    Pound (453.592),
    Gram(1.0)
}