import kotlinx.coroutines.*
suspend fun main()= coroutineScope{
    println("введите кол-во функций: ")
    var n= readLine()!!.toInt()
    while(true){
        if(n>0){
            break
        }
        else{
            println("error")
            n= readLine()!!.toInt()
        }
    }
    var rect:Rect=Rect(0.0,0.0)
        for(i in 1..n){
            rect.Input()
            rect.Info()
            rect.P()
            rect.S()
            delay(5000)
        }

}

