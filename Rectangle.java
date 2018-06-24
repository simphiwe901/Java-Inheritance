/***********************************
 * Rectangle Class
 * SIMPHIWE MCHUNU
 * 25 AUGUST 2016
 *
 ************************************/


class Rectangle extends VectorObject
{
   private int xLength;
   private int yLength;
   private int controller1=0;;
   private int controller2 = 0;

   Rectangle ( int id_, int ax_, int ay_, int axLength, int ayLength )
   {
      super (id_, ax_, ay_);
      this.xLength = axLength;
      this.yLength = ayLength;
   }

   public void drawRectangle ( char [][] array )
   {
      for (controller1=0; controller1<yLength; controller1++ )
         for (controller2=0; controller2<xLength; controller2++)
            array[y+controller1][x+controller2] = '*';
   }
}
