    package com.example

    import com.example.Unit.*

    data class Addition(val value1:Double, val unit: Unit) {

        fun add(length: Addition): Addition {

                val convertedValue = length.to(unit).value1
            return Addition(convertedValue + this.value1, unit)

            }

            fun to(targetUnit: Unit): Addition = Addition((value1 * unit.scale) / targetUnit.scale, targetUnit)

    }
        enum class Unit(val scale: Double) {
            Metre(1000.0),
            Centimetre (10.0),
            Millimetre(1.0)
    }