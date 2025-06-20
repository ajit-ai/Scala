object VarExp {
    def main(args: Array[String]): Unit = {
        var data = 10;
        data = 101;

        println(data)
        println("Ajit");

        var age: Int = 20;
        if(age>34) {
            println("age is less than 20")
        } else {
            println("age is more than 20")
        }
    }
}