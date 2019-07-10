package testscript2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import testscript1.BasePage;
import testscript1.Loginobject;

public class Logintest {

	Loginobject login;
	BasePage bp;

	public Logintest() {
		login = new Loginobject();
		bp = new BasePage();
	}

	@Test
	public void verifytas() {
		Assert.assertTrue(login.elementFound(login.getWomenNameFromPanel()));
        Assert.assertTrue(login.elementFound(login.getDressNameFromPanel()));
		Assert.assertTrue(login.elementFound(login.getTshirtNameFromPanel()));
	}
	
	@Test
	public void checkEmailSubscription() {
		login.getsubscription();
		Assert.assertTrue(login.getSubscriptionMessage().contains("subscribed "));
	}
	
	@Test
	public void verifyNavigation() {
		login.getWomNameNaviagtion().click();
		login.getDressNameNaviagtion().click();
		login.getTshirtNameNaviagtion().click();
	}
	
	@Test
	public void checkSize() {
		login.getTshirtNameNaviagtion().click();
		Assert.assertTrue(bp.elementFound(login.getSmallSize()));
		Assert.assertTrue(bp.elementFound(login.getMediumSize()));
		Assert.assertTrue(bp.elementFound(login.getLargeSize()));
	
	}
	
	}
	


