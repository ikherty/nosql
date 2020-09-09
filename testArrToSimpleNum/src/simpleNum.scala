object simpleNum {
  def isSimple(n: Int): Boolean = (n >= 2) && (2 to math.sqrt(n).toInt).forall(n%_ != 0)
  /*метод bool для проверки, является ли число n простым. работает по 2 критериям-число больше 2 и
  *деление всех чисел в интервале от 2 до целого значения корня из n происходит без остатка*/
  def main(args: Array[String]) {
    //val=const var
    val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)//массив из 9 указанных элементов
    val simpleArr = arr filter isSimple//фильтруем массив по указанному методу, записывая новые значения в другой массив
    print(simpleArr.mkString(","))//вывод массива в виде строки, иначе кракозябру выведет
    println(" is simple ")
  }
}
