package Project2HW;

// Testing the code
public class DriverTest {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        SafariDriver safariDriver = new SafariDriver();

        // Methods available to ChromeDriver
        chromeDriver.open();
        chromeDriver.navigate("https://www.example.com");
        chromeDriver.maximizeWindow();
        chromeDriver.executeScript("console.log('Executing script')");
        chromeDriver.close();

        // Methods available to FirefoxDriver
        firefoxDriver.open();
        firefoxDriver.navigate("https://www.example.com");
        firefoxDriver.refreshPage();
        firefoxDriver.takeScreenshot();
        firefoxDriver.close();

        // Methods available to SafariDriver
        safariDriver.open();
        safariDriver.navigate("https://www.example.com");
        safariDriver.clearCookies();
        safariDriver.performGesture("swipe");
        safariDriver.close();
    }
}
