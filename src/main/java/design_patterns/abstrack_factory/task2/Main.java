package design_patterns.abstrack_factory.task2;

public class Main {
    public static void main(String[] args) {
        // выбрали Windows
        GUIFactory windowsFactory = new WindowsFactory();

        Button windowsButton = windowsFactory.createButton();
        Window windowsWindow = windowsFactory.createWindow();
        Menu menuWindows = windowsFactory.createMenu();

        windowsButton.click();
        windowsWindow.draw();
        menuWindows.draw();

        // выбрали MacOS
        GUIFactory macFactory = new MacFactory();

        Button macButton = macFactory.createButton();
        Window macWindow = macFactory.createWindow();
        Menu macMenu = macFactory.createMenu();

        macButton.click();
        macWindow.draw();
        macMenu.draw();
    }
}
