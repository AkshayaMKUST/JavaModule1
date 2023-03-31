package Strings;

class TestClass
{
   int i;
   public TestClass(int i) { this.i = i;  }
   public String toString()
   {
       if(i == 0) return null;
       else return ""+i;
   }
   public static void main(String[ ] args)
   {
      TestClass t1 = new TestClass(0);
      TestClass t2 = new TestClass(2);
      System.out.println(t2);
      System.out.println(""+t1);
   }
}
//class TestClass
//{
//   public static void main(String args[ ] )
//   {
//      float f = 6.5f;
//      System.out.println( Math.ceil(f) );  //1 -> 7.0
//      System.out.println( Math.round(f) ); //2 -> 7
//      System.out.println( Math.floor(f) ); //3 -> 6.0
//      System.out.println( (int) Math.ceil(f) );  //4 -> 7
//      System.out.println( (int) Math.floor(f) ); //5 -> 6
//   }
//}


