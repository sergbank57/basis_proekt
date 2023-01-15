package primitivVALUES;

public class Primitiv_ {
    public static void main(String[] args) {
        System.out.println("Primitive values: INTEGER" );
         byte numerbyte = 124;
        System.out.println("  numerbyte = "  + numerbyte  );
        short numershort = (short) 12412;
        System.out.println("  numershort = "  + numershort  );
      int numerint = 200_000_000;
        System.out.println("  numerint = "  + numerint  );
        long numerlong = 3_000_000_000_000_000_000l;
        System.out.println("  numerlong = "  + numerlong  );
        System.out.println("------------------------------------" );
        System.out.println("Primitive values: FRACTIONAL" );
        float numerfloat  = 1.5f;
        System.out.println("  numerfloat = "  + numerfloat / 4 );
        double numerdouble = 1.5;
        System.out.println("  numerdouble = "  + numerdouble /3 );
        System.out.println("------------------------------------" );
        System.out.println("Primitive values: LOGICAL(true or false)" );
        System.out.println("  " +  (11<9) );
        System.out.println("  " +  (9==9) );
        boolean booleantrue = 6<=3;
        boolean booleanfalse = 6<=6;
        System.out.println( "  "+ booleantrue);
        System.out.println("  "+  booleanfalse);
        System.out.println("------------------------------------" );
        System.out.println("Primitive values: TEXTUAL" );
        char symbol = 'b';
        System.out.println("  symbol = " + symbol);
        System.out.println("  cod this symbol = " +(int) symbol);

    }
}
