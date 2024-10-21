package org.Friday.assosiation.main;

import java.util.ArrayList;

import org.Friday.assosiation.repository.AssosiationRepository1;
import org.Friday.assosiationtype.manytoone.IPLTeams;
import org.Friday.assosiationtype.manytoone.Players;

public class IPLteam_Players {
	public static void main(String[] args) {

		AssosiationRepository1 repository2 = new AssosiationRepository1();
		ArrayList<Players> arrayList = new ArrayList<Players>();


		IPLTeams team1 = new IPLTeams();
		team1.setCaptian("Faf du Plessis");
		team1.setState("Karnataka");
		team1.setTeamCouch("Sanjay Bangar");
		team1.setTeamName("RCB");
		
		Players player = new Players();
		player.setName("Virat Kohili");
		player.setEmail("vk@gmail.com");
		player.setHigestScore("136*");
		player.setHight("5.10");
		player.setTotalRuns(6015);
		player.setPlayerDetailsList(arrayList);

		Players player1 = new Players();
		player1.setName("Glenn Maxwell");
		player1.setEmail("gm@gmail.com");
		player1.setHigestScore("56*");
		player1.setHight("5.11");
		player1.setTotalRuns(5822);
		player1.setPlayerDetailsList(arrayList);

		Players player2 = new Players();
		player2.setName("Mohammed Siraj");
		player2.setEmail("ms@gmail.com");
		player2.setHigestScore("16*");
		player2.setHight("5.9");
		player2.setTotalRuns(615);
		player2.setPlayerDetailsList(arrayList);

		Players player3 = new Players();
		player3.setName("Faf du Plessis");
		player3.setEmail("fdp@gmail.com");
		player3.setHigestScore("146*");
		player3.setHight("6.1");
		player3.setTotalRuns(7015);
		player3.setPlayerDetailsList(arrayList);

		Players player4 = new Players();
		player4.setName("Harshal Patel");
		player4.setEmail("hp@gmail.com");
		player4.setHigestScore("26*");
		player4.setHight("5.10");
		player4.setTotalRuns(115);
		player4.setPlayerDetailsList(arrayList);

		Players player5 = new Players();
		player5.setName("Hasaranga");
		player5.setEmail("hranga@gmail.com");
		player5.setHigestScore("6*");
		player5.setHight("5.0");
		player5.setTotalRuns(15);
		player5.setPlayerDetailsList(arrayList);

		Players player6 = new Players();
		player6.setName("Dinesh Karthik");
		player6.setEmail("dk@gmail.com");
		player6.setHigestScore("236*");
		player6.setHight("6.0");
		player6.setTotalRuns(8015);
		player6.setPlayerDetailsList(arrayList);

		Players player7 = new Players();
		player7.setName("Akash Deep");
		player7.setEmail("ad@gmail.com");
		player7.setHigestScore("13*");
		player7.setHight("5.10");
		player7.setTotalRuns(60);
		player7.setPlayerDetailsList(arrayList);

		Players player8 = new Players();
		player8.setName("Hazeelhood");
		player8.setEmail("h@gmail.com");
		player8.setHigestScore("36*");
		player8.setHight("6.10");
		player8.setTotalRuns(1015);
		player8.setPlayerDetailsList(arrayList);

		Players player9 = new Players();
		player9.setName("Karan Shrma");
		player9.setEmail("ks@gmail.com");
		player9.setHigestScore("66*");
		player9.setHight("5.9");
		player9.setTotalRuns(215);
		player9.setPlayerDetailsList(arrayList);

		Players player10 = new Players();
		player10.setName("David Villy");
		player10.setEmail("dv@gmail.com");
		player10.setHigestScore("86*");
		player10.setHight("6.1");
		player10.setTotalRuns(4005);
		player10.setPlayerDetailsList(arrayList);
		
//		ArrayList<Players> arrayList = new ArrayList<Players>();
		arrayList.add(player);
		arrayList.add(player1);
		arrayList.add(player2);
		arrayList.add(player3);
		arrayList.add(player4);
		arrayList.add(player5);
		arrayList.add(player6);
		arrayList.add(player7);
		arrayList.add(player8);
		arrayList.add(player9);
		arrayList.add(player10);
		
		
		repository2.saveTeamInformation(team1);

		
	}
}
