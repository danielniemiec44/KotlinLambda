fun main(){
    var suma:(Double,Double)->Double = {
        a:Double, b:Double -> a + b
    }

    var roznica = {
        liczba1:Double, liczba2:Double -> liczba1 - liczba2
    }

    var dzielenie = {
        liczba1:Double, liczba2:Double -> liczba1 / liczba2
    }

    var mnozenie = {
        liczba1:Double, liczba2:Double -> liczba1 * liczba2
    }

    var potega = { liczba1: Double, liczba2: Double ->
        var a = liczba1
        var b = liczba1
        var potega = liczba2





        when (potega) {
            0.0->null
        else-> {
            if (potega < 0.0) {
                a = 1.0 / a;
                b = a
                potega *= -1.0
            }
            while (potega > 1.0) {
                a *= b
                potega--
            }
            a
        }
        }
    }






    var printResult = {
        a: Double, b: Double, lambda: (Double,Double) -> Double? ->
        println("Wynik dzialania: ${lambda(a,b)}")

        /*
        when(lambda(a,b)){
            1->println("Wynik wynosi wynosi 1")
            2,3 -> println("Wynik wynosi 2 lub 3")
            5..10-> println("Wynik zawiera sie w przedziale 5,10")
            else-> println("Wynik posiada inna wartosc")
        }

         */

    }


    var dzialania = listOf(suma, roznica, dzielenie, mnozenie, potega)

    for(dzialanie in dzialania){
        printResult(2.0, 0.0, dzialanie)
    }

    println()


    val pi:Double = 22.0/7
    val plancka:Double = 6.626070040 * potega(10.0, -34.0)!!
    val diraca:Double = plancka / (2 * pi)

    println(plancka)
    println(diraca)

}