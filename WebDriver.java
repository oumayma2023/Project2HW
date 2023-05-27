package Project2HW;

public class WebDriver {

    // WebDriver interface

    void open() {

    }

    void close() {

    }

    void navigate(String url) {

    }
}

    // ChromeDriver class implementing WebDriver
    class ChromeDriver extends WebDriver {
        @Override
        public void open() {
            System.out.println("ChromeDriver: Opening browser");
        }

        @Override
        public void close() {
            System.out.println("ChromeDriver: Closing browser");
        }

        @Override
        public void navigate(String url) {
            System.out.println("ChromeDriver: Navigating to " + url);
        }

        // Additional methods specific to ChromeDriver
        public void maximizeWindow() {
            System.out.println("ChromeDriver: Maximizing window");
        }

        public void executeScript(String script) {
            System.out.println("ChromeDriver: Executing script: " + script);
        }
    }

    // FirefoxDriver class implementing WebDriver
    class FirefoxDriver extends WebDriver {
        @Override
        public void open() {
            System.out.println("FirefoxDriver: Opening browser");
        }

        @Override
        public void close() {
            System.out.println("FirefoxDriver: Closing browser");
        }

        @Override
        public void navigate(String url) {
            System.out.println("FirefoxDriver: Navigating to " + url);
        }

        // Additional methods specific to FirefoxDriver
        public void refreshPage() {
            System.out.println("FirefoxDriver: Refreshing page");
        }

        public void takeScreenshot() {
            System.out.println("FirefoxDriver: Taking screenshot");
        }
    }

    // SafariDriver class implementing WebDriver
    class SafariDriver extends WebDriver {
        @Override
        public void open() {
            System.out.println("SafariDriver: Opening browser");
        }

        @Override
        public void close() {
            System.out.println("SafariDriver: Closing browser");
        }

        @Override
        public void navigate(String url) {
            System.out.println("SafariDriver: Navigating to " + url);
        }

        // Additional methods specific to SafariDriver
        public void clearCookies() {
            System.out.println("SafariDriver: Clearing cookies");
        }

        public void performGesture(String gesture) {
            System.out.println("SafariDriver: Performing gesture: " + gesture);
        }
    }

