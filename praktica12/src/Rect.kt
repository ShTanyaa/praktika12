public class Rect(var h:Double,var sh:Double) {

    public fun Input(){
        println("введите высоту прямоугольника")
        h= readLine()!!.toDouble()
        if(h<0){
            println("высота не может быть меньше 0")
            h= readLine()!!.toDouble()
        }
        println("введите ширину прямоугольника")
         sh= readLine()!!.toDouble()
        if(sh<0){
            println("ширина не может быть меньше 0")
            sh= readLine()!!.toDouble()
        }

    }
    public fun Info(){
        println("высота прямоугольника= ${h}")
        println("ширина прямоугольника= ${sh}")
    }
    public fun S(){
        println("площадь прямоугольника:${h*sh}")
    }
    public fun P(){
        println("периметр прямоугольника:${(h+sh)*2}")
    }
}