package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void loveAllTest()
	{
		TennisGame tg = new TennisGame();	
		
		Assert.assertEquals(tg.getScore(), Scores.LOVE_ALL);
				
		tg.receiverScore();
		Assert.assertEquals(tg.getScore(), Scores.LOVE_FIFTEEN);
		
		tg.receiverScore();
		Assert.assertEquals(tg.getScore(), Scores.LOVE_THIRTY);
		
		tg.receiverScore();
		Assert.assertEquals(tg.getScore(), Scores.LOVE_FORTY);
		
		
		tg.resetScores();
		
		tg.serverScore();
		Assert.assertEquals(tg.getScore(), Scores.FIFTEEN_LOVE);
		
		tg.serverScore();
		Assert.assertEquals(tg.getScore(), Scores.THIRTY_LOVE);
		
		tg.serverScore();
		Assert.assertEquals(tg.getScore(), Scores.FORTY_LOVE);
		
		
		
		tg.resetScores();
				
		tg.receiverScore();
		tg.serverScore();
		Assert.assertEquals(tg.getScore(), Scores.FIFTEEN_ALL);
		
		tg.serverScore();
		Assert.assertEquals(tg.getScore(), Scores.THIRTY_FIFTEEN);
		
		tg.receiverScore();
		Assert.assertEquals(tg.getScore(), Scores.THIRTY_ALL);
		
		tg.serverScore();
		Assert.assertEquals(tg.getScore(), Scores.FORTY_THIRTY);
		
		
		
		tg.resetScores();
		
		tg.receiverScore();
		tg.receiverScore();
		tg.serverScore();
		Assert.assertEquals(tg.getScore(), Scores.FIFTEEN_THIRTY);
		
		tg.receiverScore();
		tg.serverScore();
		Assert.assertEquals(tg.getScore(), Scores.THIRTY_FORTY);
		
		
		
		
		
//		for(int server=0; server<4; server++){
//			for(int receiver=0; receiver<4; receiver++){
//				
//			}
//		}
		
		

		
	}
		
}
