package pages;

import org.openqa.selenium.By;

public class DocumentationPage {
    DriverManager driver = new DriverManager();

    private By documentationButton = By.xpath("//*[@class='footer-section']//*[@href='/documentation']");
    private By javaButton = By.xpath("//*[@class='tabset']//*[text()='Java']");
    private By pythonButton = By.xpath("//*[@class='tabset']//*[text()='Python']");
    private By cNumberButton = By.xpath("//*[@class='tabset']//*[text()='C#']");
    private By RubyButton = By.xpath("//*[@class='tabset']//*[text()='Ruby']");
    private By javaScriptButton = By.xpath("//*[@class='tabset']//*[text()='JavaScript']");
    private By kotlinButton = By.xpath("//*[@class='tabset']//*[text()='Kotlin']");
    private By rightArrow = By.xpath("//*[@class='fa fa-chevron-right']");
    private By leftArrow = By.xpath("//*[@class='fa fa-chevron-left']");
    private By searchBox = By.xpath("//*[@id=\"search-by\"]");
    private By clearSearchBox = By.xpath("//*[@class='fas fa-times']");
    private By clearHistory = By.xpath("//*[@class='fas fa-history fa-fw']");
    private By selectLanguage = By.xpath("//*[@class='select-style']//*[@id='select-language']");
    private By editThisPage = By.xpath("//*[@id='top-github-link-text']");
    private By browserStack = By.xpath("//*[@class='backer-logo']//*[@src='/images/sponsors/browserstack.png']");
    private By productsMenu = By.xpath("//*[@class='dropdown-holder']//*[@href='javascript:void(0);']");
    private By freeTrail = By.xpath("//*[@class='btn-secondary-white btn-md']");
    private By loginField = By.xpath("//*[@id='login_field']");

    public By getLoginField() {
        return loginField;
    }

    public By getEditThisPage() {
        return editThisPage;
    }

    public By getFreeTrail() {
        return freeTrail;
    }

    public By getProductsMenu() {
        return productsMenu;
    }

    public By getBrowserStack() {
        return browserStack;
    }

    public By getSelectLanguage() {
        return selectLanguage;
    }

    public DriverManager getDriver() {
        return driver;
    }

    public By getDocumentationButton() {
        return documentationButton;
    }

    public By getJavaButton() {
        return javaButton;
    }

    public By getPythonButton() {
        return pythonButton;
    }

    public By getcNumberButton() {
        return cNumberButton;
    }

    public By getRubyButton() {
        return RubyButton;
    }

    public By getJavaScriptButton() {
        return javaScriptButton;
    }

    public By getKotlinButton() {
        return kotlinButton;
    }

    public By getRightArrow() {
        return rightArrow;
    }

    public By getLeftArrow() {
        return leftArrow;
    }

    public By getSearchBox() {
        return searchBox;
    }

    public By getClearSearchBox() {
        return clearSearchBox;
    }

    public By getClearHistory() {
        return clearHistory;
    }
}
