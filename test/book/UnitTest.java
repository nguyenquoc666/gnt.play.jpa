package book;

import com.google.inject.Inject;
import controllers.BookController;
import models.Book;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import play.data.FormFactory;
import play.data.format.Formatters;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.i18n.MessagesApi;
import play.libs.Json;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Http;
import play.mvc.Result;
import play.test.WithApplication;
import play.twirl.api.Content;
import repositories.BookRepository;
import repositories.SBookRepository;

import javax.persistence.EntityManager;
import javax.validation.Validator;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.CompletableFuture.supplyAsync;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static play.mvc.Http.Status.OK;
import static play.mvc.Http.Status.SEE_OTHER;
import static play.test.Helpers.*;

/**
 * Created by greenlucky on 6/3/17.
 */
public class UnitTest{

    @Inject
    private JPAApi jpaApi;

    @Before
    public void init() throws Exception {
        jpaApi = mock(JPAApi.class);
    }

    @Test
    public void checkIndex() {
        BookRepository repository = mock(BookRepository.class);
        SBookRepository srepository = mock(SBookRepository.class);
        FormFactory formFactory = mock(FormFactory.class);
        HttpExecutionContext ec = new HttpExecutionContext(ForkJoinPool.commonPool());
        final BookController controller = new BookController(formFactory, repository, srepository, ec);
        final Result result = controller.index();

        assertThat(result.status()).isEqualTo(OK);
    }

    @Test
    public void checkTemplate() throws Exception {
        Content html = views.html.book.render();
        assertThat(html.contentType()).isEqualTo("text/html");
        assertThat(contentAsString(html)).contains("Add book");
    }

    @Test
    public void checkAddBook() throws Exception {
        MessagesApi messages = mock(MessagesApi.class);
        Validator validator = mock(Validator.class);
        FormFactory formFactory = new FormFactory(messages, new Formatters(messages), validator);

        SBookRepository srepository = mock(SBookRepository.class);
        BookRepository repository = mock(BookRepository.class);
        Book book = new Book.BookBuilder()
                .setId(1L)
                .setName("Play Action")
                .setPrice(10.5)
                .createBook();
        when(repository.add(any())).thenReturn(supplyAsync(() -> book));

        final Http.RequestBuilder requestBuilder = new Http.RequestBuilder().method("post").bodyJson(Json.toJson(book));

        final CompletionStage<Result> stage = invokeWithContext(requestBuilder, () -> {
            HttpExecutionContext ec = new HttpExecutionContext(ForkJoinPool.commonPool());

            final BookController controller = new BookController(formFactory, repository, srepository, ec);
            return controller.addBook();
        });

        //test the completed result
        await().atMost(1, TimeUnit.SECONDS).until(() ->
                assertThat(stage.toCompletableFuture()).isCompletedWithValueMatching(result ->
                        result.status() == SEE_OTHER, "Should direct after operation"
                )
        );
    }


    @Test
    public void checkAddBooks() throws Exception {
        MessagesApi messages = mock(MessagesApi.class);
        Validator validator = mock(Validator.class);
        FormFactory formFactory = new FormFactory(messages, new Formatters(messages), validator);

        BookRepository repository = mock(BookRepository.class);
        SBookRepository srepository = mock(SBookRepository.class);

        final Http.RequestBuilder requestBuilder = new Http.RequestBuilder().method("get");

        final Result stage = invokeWithContext(requestBuilder, () -> {
            HttpExecutionContext ec = new HttpExecutionContext(ForkJoinPool.commonPool());

            final BookController controller = new BookController(formFactory, repository,srepository, ec);
            return controller.addBooks();
        });

        Thread.sleep(100);

    }

    @Test
    public void removeBook() throws Exception {
        final Http.RequestBuilder requestBuilder = new Http.RequestBuilder().method("get").bodyJson(Json.toJson(1));

        final CompletionStage<Result> stage = invokeWithContext(requestBuilder, () -> {
            HttpExecutionContext ec = new HttpExecutionContext(ForkJoinPool.commonPool());

            FormFactory formFactory = mock(FormFactory.class);
            BookRepository repository = mock(BookRepository.class);
            SBookRepository srepository = mock(SBookRepository.class);
            final BookController controller = new BookController(formFactory, repository,srepository, ec);
            return controller.deleteBook(1);
        });

        await().atMost(1, TimeUnit.SECONDS).until(() ->
                assertThat(stage.toCompletableFuture()).isCompletedWithValueMatching(result ->
                        result.status() == SEE_OTHER, ""
                )
        );
    }

    @Test
    public void addBoosTest() throws Exception {
        running(fakeApplication(), new Runnable() {

            @Transactional
            @Override
            public void run() {
                SBookRepository repository = mock(SBookRepository.class);
                Book book = new Book.BookBuilder().setName("Java 1").createBook();
                when(repository.add(book)).thenReturn(book);
            }
        });


        Thread.sleep(100);

    }
}
