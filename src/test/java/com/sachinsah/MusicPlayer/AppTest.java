package com.sachinsah.MusicPlayer;

import java.util.ArrayDeque;
import java.util.Deque;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	App app;
	Deque<String> recentPlayed;
	
	@BeforeSuite
	public void setUp() {
		app = new App(); 
	}
	
	@BeforeMethod
	public void setValue() {
		recentPlayed = new ArrayDeque<String>();
		recentPlayed.add("s1");
		recentPlayed.add("s2");
		recentPlayed.add("s3");
	}
	
	@Test
	public void recentPlaylistTestWithValidInput() {
		recentPlayed = app.recentPlaylist("s4", recentPlayed);
		Assert.assertTrue(recentPlayed.size()==3);
		Assert.assertEquals("[s2, s3, s4]", recentPlayed.toString());
	}
	
	@AfterMethod
	public void clearValue() {
		recentPlayed.clear();
	}

	@SuppressWarnings("deprecation")
	@AfterSuite
	public void clear() throws Throwable {
		finalize();
	}
}
