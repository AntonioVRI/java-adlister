import models.Album;
import models.Author;
import models.Employee;
import models.Quote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class BeanTest {
    public static void main(String[] args) {

        Author douglasAdams = new Author();
        Author markTwain = new Author();
        Author kurtVonnegut = new Author();
        douglasAdams.setFirstName("Douglas");
        douglasAdams.setLastName("Adams");
        douglasAdams.setId(1L);
        markTwain.setFirstName("Mark");
        markTwain.setLastName("Twain");
        markTwain.setId(2L);
        kurtVonnegut.setFirstName("Kurt");
        kurtVonnegut.setLastName("Vonnegut");
        kurtVonnegut.setId(3L);
        Quote quote1 = new Quote();
        Quote quote2 = new Quote();
        Quote quote3 = new Quote();
        Quote quote4 = new Quote();
        Quote quote5 = new Quote();
        quote1.setId(1L);
        quote1.setAuthor(douglasAdams);
        quote1.setContent("I love deadlines. I love the whooshing noise they make as they go by.");

        quote2.setId(2L);
        quote2.setAuthor(douglasAdams);
        quote2.setContent("Don't Panic.");

        quote3.setId(3L);
        quote3.setAuthor(douglasAdams);
        quote3.setContent("Time is an illusion. Lunchtime doubly so.");

        quote4.setId(4L);
        quote4.setAuthor(markTwain);
        quote4.setContent("Clothes make the man. Naked people have little or no influence on society.");

        quote5.setId(5L);
        quote5.setAuthor(kurtVonnegut);
        quote5.setContent("The universe is a big place, perhaps the biggest.");

        List<Quote> quotes = new ArrayList<>(Arrays.asList(quote1, quote2, quote3, quote4, quote5));
        for (Quote quote : quotes) {
            System.out.println("quote: "+quote.getContent()+"-- author: "+
                    quote.getAuthor().getFirstName()+" "+quote.getAuthor().getLastName());
        }
    }

}