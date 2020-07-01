package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5_CheckBox {
    /*
    Bir class oluşturun : CheckBox
    Main method oluşturun ve aşağıdaki görevi  tamamlayın.
    Verilen web sayfasına gidin. https://the-internet.herokuapp.com/checkboxes
    Checkbox1 ve checkbox2 elementlerini locate edin.
    Checkbox1 seçili değilse onay kutusunu tıklayın
    Checkbox2 seçili değilse onay kutusunu tıklayın

     */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/cevdettellioglu/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");


        WebElement checkBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        if (!checkBox1.isSelected()) {
            checkBox1.click();
        } else {
            System.out.println("CheckBox bir zaten check edilmis");
        }

        WebElement checkBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2])"));
        if (!checkBox2.isSelected()) {
            checkBox2.click();
        } else {
            System.out.println("Checkbox 2 daha once check edilmis");
        }

    }
}
