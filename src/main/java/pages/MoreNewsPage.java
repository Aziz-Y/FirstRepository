package pages;

import org.openqa.selenium.By;

public class MoreNewsPage {

    DriverManager driver = new DriverManager();

    private By cornerLogo = By.xpath("//*[@id=\"header\"]/a[1]/img[1]");
    private By largeLogo = By.xpath("/html/body/section/a/h1");
    private By searchHole = By.xpath("//*[@id=\"gsc-i-id1\"]");
    private By searchIcon = By.xpath("//*[@id=\"navbar\"]/div[2]/div/img");
    private By searchBlog = By.xpath("//*[@id=\"gsc-i-id3\"]");
    private By archive2018 = By.xpath("//*[contains(text(),'2018')]");
    private By archive2017 = By.xpath("//*[@class='archive-link-container']//*[text()='2017']");
    private By archive2016 = By.xpath("//*[@class='archive-link-container']//*[text()='2016']");
    private By archive2015 = By.xpath("//*[contains(text(),'2015')]");
    private By learnMore = By.xpath("//*[@class='button']");
    private By youTubeVideo = By.xpath("//*[@title='YouTube Video']");
    private By moreNewsButton = By.xpath("//*[contains(text(),'MORE NEWS')]");
    private By olderPosts = By.xpath("//a[@href='/blog/page/2/']");

    public DriverManager getDriver() {
        return driver;
    }

    public By getCornerLogo() {
        return cornerLogo;
    }

    public By getLargeLogo() {
        return largeLogo;
    }

    public By getSearchHole() {
        return searchHole;
    }

    public By getSearchIcon() {
        return searchIcon;
    }

    public By getSearchBlog() {
        return searchBlog;
    }

    public By getArchive2018() {
        return archive2018;
    }

    public By getArchive2017() {
        return archive2017;
    }

    public By getArchive2016() {
        return archive2016;
    }

    public By getArchive2015() {
        return archive2015;
    }

    public By getLearnMore() {
        return learnMore;
    }

    public By getYouTubeVideo() {
        return youTubeVideo;
    }

    public By getMoreNewsButton() {
        return moreNewsButton;
    }

    public By getOlderPosts() {
        return olderPosts;
    }
}
