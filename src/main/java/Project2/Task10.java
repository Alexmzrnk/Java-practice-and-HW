package Project2;

/*
Provide Implementation for the diagram below. Then create a test class
in which you need to create Objects of ChromeDriver, FirefoxDrive and
SafariDriver classes and see which methods available to them.
 */
public class Task10 {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.open();
        chromeDriver.close();
        chromeDriver.navigate();
        chromeDriver.getTitle();
        chromeDriver.getScreenshot();

        FirefoxDrive firefoxDrive = new FirefoxDrive();
        firefoxDrive.open();
        firefoxDrive.close();
        firefoxDrive.navigate();
        firefoxDrive.getTitle();
        firefoxDrive.getScreenshot();

        SafariDriver safariDriver = new SafariDriver();
        safariDriver.open();
        safariDriver.close();
        safariDriver.navigate();
        safariDriver.getTitle();
        safariDriver.getScreenshot();
    }
}

interface Webdriver {

    void open();

    void close();

    String getTitle();
}

interface TakesScreenshot {
    void getScreenshot();

}

interface RemoteWebDriver extends Webdriver, TakesScreenshot {
    void navigate();
}

class ChromeDriver implements RemoteWebDriver {

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void getScreenshot() {

    }

    @Override
    public void navigate() {

    }
}

class FirefoxDrive implements RemoteWebDriver {

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void getScreenshot() {

    }

    @Override
    public void navigate() {

    }
}

class SafariDriver implements RemoteWebDriver {

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void getScreenshot() {

    }

    @Override
    public void navigate() {

    }
}