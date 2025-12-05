
public class Main {
    public static void main(String[] args) throws Exception {
        PageFetcher fetcher = new PageFetcher();
        String html = fetcher.fetch("https://www.famnit.upr.si/en/");
        System.out.println(html);
    }
}