/*************************************
 * VLine Class
 * SIMPHIWE MCHUNU
 * 25 AUGUST 2016
 *
 ***********************************/

class VLine extends VectorObject
{
   private int length;
   private int controller;

   VLine ( int id, int ax, int ay, int aLength )
   {
      super (id, ax, ay);
      this.length = aLength;
   }

   public void draw ( char [][] array )
   {
      int k = length;
      for ( controller=0; controller<k; controller++ )
         array[y+controller][x] = '*';
   }
}
