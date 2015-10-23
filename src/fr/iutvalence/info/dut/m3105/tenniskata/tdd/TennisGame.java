package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

public class TennisGame
{
	
	private int score1;
	private int score2;
	
	public TennisGame() {
		score1 = 0;
		score2 = 0;
	}
	
	public String getScore(){
		if(score1 == 0 && score2 == 0)
			return "love-all";
		return null;
	}
	
	
	
}
