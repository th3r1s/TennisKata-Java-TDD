package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void loveAllTest()
	{
		TennisGame tg = new TennisGame();
		Assert.assertEquals(tg.getScore(), "love-all");		
	}
	
	@Test
	public void fifteenLoveTest(){
		TennisGame tg = new TennisGame();
		tg.serverScore();
		Assert.assertEquals(tg.getScore(), "fifteen-love");
	}
	
	@Test
	public void loveFifteenTest(){
		TennisGame tg = new TennisGame();
		tg.receiverScore();
		Assert.assertEquals(tg.getScore(), "love-fifteen");
	}

	
	
}
