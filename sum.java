
public class sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
	      final int ARRAY_SIZE = 10;
	      
	      double[] fractions = new double[ ARRAY_SIZE ];
	      
	      fractions[ 9 ] = 1.667;
	      
	      fractions[ 6 ] = 3.333;
	      
	      double total = 0.0;
	      for ( int x = 0; x < fractions.length; x++ )
	         total += fractions[ x ];

	      System.out.printf( "fractions[ 9 ] = %.3f\n", fractions[ 9 ] );
	      System.out.printf( "fractions[ 6 ] = %.3f\n", fractions[ 6 ] );
	      System.out.printf( "total = %.3f", total );

	}

}
