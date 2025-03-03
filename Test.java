class Test {
    public static void main( String[] args ) {

        PostalCode[] codes = new PostalCode[ 100 ];
        int count=0, n=10;

        codes[ 0 ] = new CanadaCode( "K1N 6N5" );
        codes[ 1 ] = new CanadaCode( "K1N 6N" );
        codes[ 2 ] = new CanadaCode( "K1N6N5" );
        codes[ 3 ] = new CanadaCode( "K1N N65" );
        codes[ 4 ] = new CanadaCode( "K1N 6N56" );

        codes[ 5 ] = new USCode( "CA 90014" );
        codes[ 6 ] = new USCode( "90014" );
        codes[ 7 ] = new USCode( "90014 CA" );
        codes[ 8 ] = new USCode( "CA 90O14" );
        codes[ 9 ] = new USCode( "CA 900!4" );

        for ( int i=0; i<n; i++ ) {
            if ( codes[ i ].isValid() ) {
                count++;
            }
        }

        System.out.println( count +" codes sont valides");
    }

}
