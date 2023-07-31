fun main(args: Array<String>) {
    // Label
    loop@for (i in 1..10) {
        for (j in 1..10) {
            break@loop
            println("$i, $j")
        }
    }

    //Pratica
//    A group of young people are going to a nightclub.
//
//    Design a program that accepts user ages.
//
//    The program displays a welcome message for each user.
//
//    If it receives an age lower than 18, it prints a message that this client is not allowed.
//
//    If it receives the word “stop”, the program ends

   while(true){
       println("Entre com sua idade")
       var input = readLine ?: ""]
       if(input == "stop"){
           break
       }

       val idade = input.toInt()
       if(idade <= 18){
           println("Você nao pode entrar")
           continue
       }
   }
}