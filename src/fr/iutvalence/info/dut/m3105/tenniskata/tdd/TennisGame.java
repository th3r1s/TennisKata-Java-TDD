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
	
	public String getScore(){
		if(serverScore == 0 && receiverScore == 0)
			return "love-all";
		if(serverScore == 15 && receiverScore == 0)
			return "fifteen-love";
		if(serverScore == 0 && receiverScore == 15)
			return "love-fifteen";		
		return null;
	}
	
	
	
}
