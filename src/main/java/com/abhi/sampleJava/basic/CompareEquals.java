package com.abhi.sampleJava.basic;



public class CompareEquals {

    public static void main(String args[]) {

    /*  int. => Primitive.  => Store directly in memory
        Integer => Reference => * Store reference of memory
                                * Store address of memory where value is stored

        Memory
        { [10] [4] []  [20] []}
            1   2   3    4   5
        int abhi=10;
        Integer submit=20; => 2. (value of reference)
    */
     /*
       int abhi1=10;
      int abhi2=20;

        boolean res=(abhi1==abhi2);
      System.out.println("values for abhi1 and abhi2 are same ? " + res);*/


      /*
      Integer pool => {10}
                        101
      */

      /*
      Integer abhi1=10;
      Integer abhi2=10;

      boolean res=(abhi1==abhi2);
      System.out.println("values for abhi1 and abhi2 are same ? " + res);
      */

      /*
      Integer pool => { 10, 10 , .....}
                       201. 202
      */

    /*  Object abhi=new String("20");
      Integer abhi1=new Integer(10);
      Integer abhi2=new Integer(10);

      boolean res=(abhi1==abhi2);
      System.out.println("values for abhi1 and abhi2 are same ? " + res);

      System.out.println(findDataType(abhi));*/



    /*
    Integer abhi1=new Integer(10);
      Integer abhi2=new Integer(10);
    abhi1 == abhi2  => Checks memory reference
    abhi1.equals(abhi2) => Checks value of variables
    */

        /*
         Integer abhi1=new Integer(10);
        Integer abhi2=new Integer(10);


        boolean res=(abhi1.equals(abhi2));
        System.out.println("values for abhi1 and abhi2 are same ? " + res);
*/
    }
}