package com.example.lexicry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        println(Solution().lexicalOrder(2))
//        println(Solution().lexicalOrder(23))
//        println(Solution().lexicalOrder(333))
        println(Solution().lexicalOrder(13))

    }


}



class Solution {
    //    private var index = 0
//    private var onesDigit = 0
//    private var tensDigit = 0
//    private var hundredsDigit = 0
//    private var thousandsDigit = 0
    fun lexicalOrder(n: Int): List<Int> {
        val stringList: MutableList<String> = mutableListOf()
        for (i in 1 .. n) {
            stringList.add("$i")
            stringList.sort()
        }
        return stringList as MutableList<Int>
    }
    fun scratch() : CharArray{
        val a = 50

        return(Character.toChars(a))
    }
//    fun lexicalOrder(n: Int): List<Int> {
//        //what if n = 100?
//        //set would be [1, 10..19, 100, 2..29,...,9..99]
//        when (n.toString().length){
//            //ex. 1-9
//            1 ->{
//                for(i in 1..n){
//                    numList.add(i)
//                }
//            }
//            //ex. 10-99
//            2 ->{
//                //ex.: n == 99 -> [1, 10, 11...2, 20, 21...99]
//                //ex.: n == 23 -> [1, 10, 11...2, 20, 21, 22, 23]
//                val endpointTensDigit = n.toString().substring(0,1).toInt()
//                val endpointOnesDigit = n.toString().substring(1).toInt()
//
//                for(i in 1..endpointTensDigit){
//                    tensDigit = i
//                    numList.add(i)
//                    //if for ex. we're on 10 out of n = 23, add onto the list with just the ones digit
//                    if(tensDigit < endpointTensDigit){
//                        //add 0 thru 9 to the ones digit and add to list
//                        for(j in 0..9){
//                            numList.add((tensDigit.toString() + j.toString()).toInt())
//                        }
//                    }
//                    //ex. if n = 23, account for 20, 21, 22, 23
//                    else{
//                        for (j in 0..endpointOnesDigit){
//                            numList.add((tensDigit.toString() + j.toString()).toInt())
//                        }
//                    }
//                }
//
//            }
//            //ex. 100-999
//            3 ->{
//                val endpointHundredsDigit = n.toString().substring(0,1).toInt()
//                val endpointTensDigit = n.toString().substring(1,2).toInt()
//                val endpointOnesDigit = n.toString().substring(2).toInt()
//
//                for(i in 1..endpointHundredsDigit){
//                    hundredsDigit = i
//                    numList.add(i)
//                    //if for ex. we're on 10 out of n = 230, add onto the list with just the tens digit
//                    if(hundredsDigit < endpointHundredsDigit){
//                        //add 0 thru 9 to the ones digit and add to list
//                        for(j in 0..9){
//                            tensDigit = j
//                            numList.add((hundredsDigit.toString() + j.toString()).toInt())
//                            for(k in 0..9){
//                                numList.add((hundredsDigit.toString() + tensDigit.toString() + k.toString()).toInt())
//                            }
//
//                        }
//                    }
//                    //ex. if n = 230, account for 2, 20, 201...209, 21, 210...
//                    else{
//                        for (j in 0..endpointTensDigit){
//                            tensDigit = j
//                            numList.add((hundredsDigit.toString() + j.toString()).toInt())
//                            if (tensDigit < endpointTensDigit) {
//                                for (k in 0..9) {
//                                    numList.add((hundredsDigit.toString() + tensDigit.toString() + k.toString()).toInt())
//                                }
//                            }
//                            else {
//                                //what if n = 233?
//                                for(k in 0..endpointOnesDigit){
//                                    numList.add((hundredsDigit.toString() + tensDigit.toString() + k.toString()).toInt())
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//            //ex.
//            4 ->{
//                val endpointThousandsDigit = n.toString().substring(0,1).toInt()
//                val endpointHundredsDigit = n.toString().substring(1,2).toInt()
//                val endpointTensDigit = n.toString().substring(2,3).toInt()
//                val endpointOnesDigit = n.toString().substring(3).toInt()
//            }
//        }
//        return numList
//    }

}