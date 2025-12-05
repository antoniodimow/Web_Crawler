import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.net.URI;

public class Main {
    public static void main(String[] args) throws Exception {
        String url = "https://www.famnit.upr.si/en";
        String domain = new URI(url).getHost();

        PageFetcher fetcher = new PageFetcher();
        String html = fetcher.fetch(url);

        Document doc = Jsoup.parse(html, url);
        Elements links = doc.select("a[href]");

        for (Element link : links) {

            String href = link.attr("abs:href");

            // if the domain is not the same, skip
            if (!href.contains(domain)) {
                continue;
            }

            System.out.println(href);
        }
    }
}