class xyz

{

	int a[ ] = new int[ 5 ] ;

	static int i ;

	xyz(int n)

    {

		a[ i ] = n ;

		System.out.println( a [ i ] ) ;

		i++ ;

	}

}

class abc extends xyz

{

	int b1 [] = {10,20,30,40,50} ;

	static int b ;

	abc( )

    {
		new xyz(b1[b++]);

	}

}

class sample

{

	public static void main (String srags[ ])

    {

		abc x0 = new  abc( ) ;

		abc x1 = new abc( ) ;

		abc x2 = new abc( ) ;

		abc x3 = new abc( ) ;

		abc x4 =  new abc( ) ;

	}

}