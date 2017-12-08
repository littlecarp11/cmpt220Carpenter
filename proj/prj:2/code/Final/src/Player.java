import java.sql.*;
import java.io.*;
import java.lang.*;

public class Player {

	private int playerNumber;
	private String position;
	public boolean isCaptain;
	private int teamId;
	private int personId;
	Connection c = null;

	public Player() throws IOException, SQLException, ClassNotFoundException {

			Connection c = null;
		try{
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ethancarpenter", "ethancarpenter", "");
			System.out.println(c);

		}
		catch(Exception ce) {
			System.out.println(ce);
		}
		Statement st = c.createStatement();
		ResultSet rs = st.executeQuery("SELECT * from 	Players");
		while(rs.next()){
			System.out.println(rs.getString(1));

		}
		rs.close();
		st.close();



	}

	
	public void savePlayer(int playerNumber, String position, boolean isCaptain, int teamId, int personId ) {
		try {
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ethancarpenter", "ethancarpenter", "");
			Statement st = c.createStatement();
			System.out.println( " INSERT INTO player(playerNumber, position, isCaptain, teamId, personId) values ('" + playerNumber + "')" + "(" + position + ")" + "(" + isCaptain + ")" + "(" + teamId + ")" + "(" + personId + ")");
			st.executeUpdate("INSERT INTO player (playerNumber, position, isCaptain, teamId, personId) values ('" + playerNumber + "'," + "'" + position + "'," + "" + isCaptain + "," + "" + teamId + "," + "" + personId + ")");
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

	public void deletePlayer(int personId) {
		try {
			Statement st = c.createStatement();
			st.executeUpdate("DELETE FROM player WHERE personId =" + personId);
		} catch (Exception e) {
			System.out.println(e);

		}
	}

		public void setTeamId(int currentId, int newId){
			try {
				Statement st = c.createStatement();
				st.executeUpdate("UPDATE Player set teamId =" + newId + "where personId= " + currentId);
				//System.out.println("INSERT INTO person (firstname, lastname) values ('" + firstName + "'," + "'" + lastName + "')");
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	public void getAllPlayers(){
		try{
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ethancarpenter", "ethancarpenter", "");

			Statement st = c.createStatement();

			String slt = "SELECT * from Player";
			ResultSet rs = st.executeQuery(slt);
			try{
				while(rs.next()){
					String position = rs.getString("position");


					int playerNumber = rs.getInt("playernumber");
					int teamId = rs.getInt("teamid");
					int personId = rs.getInt("personid");
					boolean isCaptain = rs.getBoolean("iscaptain");

					System.out.print(", Player Number: " + playerNumber);
					System.out.print(", Team Id: " + teamId);
					System.out.print(", Person id: " + personId);
					System.out.print(", position " + position);
					System.out.print(", isCaptain " + isCaptain);



					System.out.println(",");

				}
			}
			catch(Exception e){
				System.out.println(e.fillInStackTrace());

			}
		}

		catch (Exception e){
			System.out.println(e);

		}


	}

//		public void setPersonId(int currentId, int newId){
//			try {
//				Statement st = c.createStatement();
//				st.executeUpdate("UPDATE Player set personId =" + newId + "personId= " + currentId);
//				//System.out.println("INSERT INTO person (firstname, lastname) values ('" + firstName + "'," + "'" + lastName + "')");
//			} catch (Exception e) {
//				System.out.println(e);
//			}
//		}
//
//		public void setPlayerNumber(int currentNumber, int newNumber){
//			try {
//				Statement st = c.createStatement();
//				st.executeUpdate("UPDATE Player set playerNumber =" + newNumber + "where personId= " + currentNumber);
//				//System.out.println("INSERT INTO person (firstname, lastname) values ('" + firstName + "'," + "'" + lastName + "')");
//			} catch (Exception e) {
//				System.out.println(e);
//			}
//		}
//
//		public void setPosition(int id,  String position){
//			try {
//				Statement st = c.createStatement();
//				st.executeUpdate("UPDATE Player set position='" + position + "' where personId=" + id);
//				//System.out.println("INSERT INTO person (firstname, lastname) values ('" + firstName + "'," + "'" + lastName + "')");
//			} catch (Exception e) {
//				System.out.println(e);
//			}
//		}
//
//		public void setIsCaptain(boolean currentCaptain, boolean newCaptain){
//			try {
//				Statement st = c.createStatement();
//				st.executeUpdate("UPDATE Player set isCaptain =" + newCaptain + "where isCaptain= " + currentCaptain);
//				//System.out.println("INSERT INTO person (firstname, lastname) values ('" + firstName + "'," + "'" + lastName + "')");
//			} catch (Exception e) {
//				System.out.println(e);
//			}
//		}


//	public setCaptain(boolean val){
//		isCaptain = val;
//
//
//
//	}
//	public getCaptains(){
//
//
//	}


//	public getCaptainsByPosition(String position){
//
//
//	}

}


