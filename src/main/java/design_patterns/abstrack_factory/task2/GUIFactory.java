package design_patterns.abstrack_factory.task2;

public interface GUIFactory {
    Button createButton();
    Window createWindow();
    Menu createMenu();
}
