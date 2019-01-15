package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main( String[] args ) {

		List<String> palavras = new ArrayList<String>();
		palavras.add( "Alura" );
		palavras.add( "Caelum" );
		palavras.add( "casa do codigo" );

		// antigo
		palavras.forEach( new Consumer<String>() {
			@Override
			public void accept( String palavra ) {
				System.out.println( palavra );
			}
		} );

		// lambda
		palavras.forEach( s -> System.out.println( s ) );

		// method reference
		palavras.forEach( System.out::println );

		// ordenando
		palavras.sort( ( s1, s2 ) -> s1.length() - s2.length() );

		palavras.sort( String.CASE_INSENSITIVE_ORDER );

	}
}
