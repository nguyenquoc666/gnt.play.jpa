package controllers;

import models.Book;
import play.data.FormFactory;
import play.db.jpa.JPAApi;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Result;
import repositories.BookRepository;
import repositories.SBookRepository;

import javax.inject.Inject;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static play.libs.Json.toJson;

/**
 * Created by greenlucky on 6/3/17.
 */
public class BookController extends Controller {

    private final FormFactory formFactory;
    private final BookRepository bookRepository;
    private final SBookRepository sBookRepository;
    private final HttpExecutionContext ec;
    private int numQuery = 1;
    private final JPAApi jpaApi;

    @Inject
    public BookController(FormFactory formFactory, BookRepository bookRepository, SBookRepository sBookRepository, HttpExecutionContext ec, JPAApi jpaApi) {
        this.formFactory = formFactory;
        this.bookRepository = bookRepository;
        this.sBookRepository = sBookRepository;
        this.ec = ec;
        this.jpaApi = jpaApi;
    }

    public Result index() {
        return ok(views.html.book.render());
    }

    public CompletionStage<Result> addBook() {
        Book book = formFactory.form(Book.class).bindFromRequest().get();
        return bookRepository.add(book).thenApplyAsync(b -> {
            return redirect(routes.BookController.index());
        }, ec.current());
    }

    public CompletionStage<Result> deleteBook(long id) {
        return bookRepository.delete(id).thenApplyAsync(b -> {
            return redirect(routes.BookController.index());
        }, ec.current());
    }

    public CompletionStage<Result> getBooks() {
        return bookRepository.list().thenApplyAsync(b -> {
            return ok(toJson(b.collect(Collectors.toList())));
        }, ec.current());
    }

    public Result addBooks() {

        long startTime = System.currentTimeMillis();
        System.out.println("StartTime: " + startTime);
        IntStream.range(0, (int) numQuery).forEach(i -> {
            Book book = new Book();
            book.setName("Book: " + i);
            bookRepository.add(book);
        });
        long endTime = System.currentTimeMillis();
        System.out.println("EndTime: " + endTime);
        long result = endTime - startTime;
        System.out.println("Result: " + result);
        return ok(String.valueOf(result));
    }

    public Result synAddBooks() {

        long startTime = System.currentTimeMillis();
        System.out.println("StartTime: " + startTime);
        IntStream.range(0, (int) numQuery).forEach(i -> {
            Book book = new Book();
            book.setName("Book: " + i);
            sBookRepository.add(book);
        });
        long endTime = System.currentTimeMillis();
        System.out.println("EndTime: " + endTime);
        long result = endTime - startTime;
        System.out.println("Result: " + result);
        return ok(String.valueOf(result));
    }

    public Result addBookWithTran() {
        Book book1 = new Book("book1", "pass1", 1.1);
        Book book2 = new Book("book2", "pass2", 2.2);
        System.out.println(book1);
        System.out.println(book2);

        jpaApi.withTransaction(() -> {
            bookRepository.add(book1).thenApplyAsync(b -> {
                return redirect(routes.BookController.index());
            }, ec.current());

            bookRepository.add(book2).thenApplyAsync(b -> {
                return redirect(routes.BookController.index());
            }, ec.current());
        });

        return ok();
    }

    public Result getBooksWithTran() {
        jpaApi.withTransaction(() -> {
            return bookRepository.list().thenApplyAsync(b -> {
                System.out.println(toJson(b.collect(Collectors.toList())));
                return ok(toJson(b.collect(Collectors.toList())));
            }, ec.current());
        });

        return ok();
    }
}
