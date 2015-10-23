package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

public class TennisGame
{
	
	private int serverScore;
	private int receiverScore;
	
	public TennisGame() {
		serverScore = 0;
		receiverScore = 0;
	}
	
	public void serverScore(){
		serverScore += 15;
	}
	
	public void receiverScore(){
		receiverScore += 15;
	}
	
	public Scores getScore(){
		if(serverScore == 0 && receiverScore == 0)
			return Scores.LOVE_ALL;
		if(serverScore == 15 && receiverScore == 0)
			return Scores.FIFTEEN_LOVE;
		if(serverScore == 0 && receiverScore == 15)
			return Scores.LOVE_FIFTEEN;
		if(serverScore == 15 && receiverScore == 15)
			return Scores.FIFTEEN_ALL;	
		return null;
	}
	
	
	
}
