class test

{

	public static void main (String agrs[ ])

	{

		int arr[ ] = {10, 25, 63, 48, 20};

		for(int i = 0 ; i<arr.length ; i++)

		{

			for(int j = 0 ; j <i ; j++ )

            {

				if(arr[ i ] >arr[ j ] )

				{

					int t = arr [ i ];

					arr[ i ] = arr[ j ];

					arr[ j ] = t;

				}

			}

		}

		for(int k = 0 ; k <arr.length ; k++)

		{

			System.out.println(arr[ k ]) ;

		}

	}

}