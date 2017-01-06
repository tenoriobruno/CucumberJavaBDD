package feature.book;
 
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
 
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
 
import com.hascode.tutorial.cucumber.book.*;
 
import cucumber.api.Format;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
 
public class BookSearchSteps {
	Library library = new Library();
	List<Book> result = new ArrayList<>();
	
	@Dado(".+livro com o título '(.+)', escrito por '(.+)', publicado em (.+)")
	public void adicionaNovoLivro(final String title, final String author, @Format("dd MMMMM yyyy") final Date published) {
		Book book = new Book(title, author, published);
		library.addBook(book);
	}

	@Quando("^o cliente procura por livros publicados entre (\\d+) e (\\d+)$")
	public void setParametrosDeBusca(@Format("yyyy") final Date from, @Format("yyyy") final Date to) {
		result = library.findBooks(from, to);
	}

	@Então("^(\\d+) livros deveriam ter sido encontrados$")
	public void verifaQuantidadeDeLivrosEncontrados(final int booksFound) {
		assertThat(result.size(), equalTo(booksFound));
	}

	@Então("^o livro (\\d+) deve ter o título '(.+)'$")
	public void verificaLivroNaPosicao(final int position, final String title) {
		assertThat(result.get(position - 1).getTitle(), equalTo(title));
	}
}