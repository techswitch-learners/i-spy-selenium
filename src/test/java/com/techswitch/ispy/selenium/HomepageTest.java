package com.techswitch.ispy.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class HomepageTest {

    @Test
    public void testHomepageExists(){
        WebDriver browser = new FirefoxDriver();
        browser.get("https://techswitch-i-spy-staging.herokuapp.com/");

        assertThat(browser.findElement(By.id("root"))).isNotNull();
        assertThat(browser.findElement(By.id("root"))).isNotEqualTo("");
        browser.close();
    }
}
