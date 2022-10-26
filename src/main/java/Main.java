import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://cbr.ru/currency_base/daily/").userAgent("Mozilla").get();
        doc.select("tr:nth-child(3) td:eq(4)").forEach(System.out::println);

    }
}
