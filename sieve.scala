
//Name Abdul Basit
// 

object sieve {
  
  def f_Prime(num:Int):List[Int]={ //num is for the list range
    
  val sqt= scala.math.sqrt(num)    //sqt will be our base case
  val num_list=List.range(2,num)    // Num_List is our inputed List
  
  def separate(Start:Int, our_List:List[Int]):List[Int]={  //separate will separate the prime values
    if(Start>sqt) our_List    //Base condition all prime numbers
    else separate(Start+1,our_List.filterNot((iterative_Values) => (iterative_Values%Start==0 && iterative_Values!= Start))) 
  //iterated through our list and sent for vcalculations
  }
  separate(2,num_list)  //function call
  }
  


    def main(args: Array[String]){
     println("Test First")
     if(sieve_test())println("Test Passed")
     else println("Test Failed")
     
     println("Enter Number to which you want a list")
     
     val Starting_value=scala.io.StdIn.readInt()
     
     f_Prime(Starting_value).foreach(println)//printing all values of returned list
    }
    
    //this test is comparing prime numbers up to 30 with our algo
    def sieve_test():Boolean={
      println("Runing test for the given algoithm:")
      val primes=List(2,3,5,7,11,13,17,19,23,29)
      val All_primes=f_Prime(30)
      if(primes==All_primes) true
      else false
    }
     
   
   
}