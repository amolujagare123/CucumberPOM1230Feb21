package pages;

import org.openqa.selenium.By;

public class DarkSkyHomePage extends  BasePage{

    By currentTemp = By.xpath("//span[@class='summary swap']"); //86˚ Clear.
    By timeLineTemp = By.xpath("//span[@class='first']//span"); // 86°


    public String getCurrTemp()
    {
        String temp ="";
        String rowTemp = getTextFromElement(currentTemp); //86˚ Clear. --> 86
        temp = rowTemp.split("˚")[0];  // => {"86" ," Clear." }
        return temp;
    }

    public String getTimeLineTemp()
    {
        String temp ="";
        String rowTemp = getTextFromElement(timeLineTemp); //86°
        temp = rowTemp.split("°")[0];  // => {"86"}
        return temp;
    }


}
