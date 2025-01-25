package code.creational.abstract_factory.WebApplication;

import java.util.Scanner;

import code.creational.abstract_factory.WebApplication.factory.DarkUIFactory;
import code.creational.abstract_factory.WebApplication.factory.LightUIFactory;
import code.creational.abstract_factory.WebApplication.factory.UIFactory;

public class WebApplication {

    UIFrameworkWithThemes uiFrameworkWithThemes;

    public void setUiFrameworkWithThemes(UIFrameworkWithThemes uiFrameworkWithThemes) {
        this.uiFrameworkWithThemes = uiFrameworkWithThemes;
    }

    public void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String themeType = sc.nextLine();
            UIFactory uiFactory = null;

            switch (themeType) {
                case "dark":
                    uiFactory = new DarkUIFactory();
                    break;
                default:
                    uiFactory = new LightUIFactory();
                    break;
            }

            uiFrameworkWithThemes = new UIFrameworkWithThemes(uiFactory);
            uiFrameworkWithThemes.createUI();
            uiFrameworkWithThemes.render();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
