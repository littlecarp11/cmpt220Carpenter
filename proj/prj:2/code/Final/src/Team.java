import java.io.IOException;
import java.sql.*;

public class Team {
	private int teamId;
	private String teamName;
	private int sportId;
		Connection c = null;
	// private String[] teamColors =	{ "red", "white", "black"} example for singular team
	



	 



	public Team() throws IOException, SQLException, ClassNotFoundException{

		try{
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ethancarpenter", "ethancarpenter", "");
			System.out.println(c);

		}
		catch(Exception ce) {
			System.out.println(ce);
		}


	}
	
	public void saveTeam(int teamId, String teamName, int sportId) {
	 	try {
			Statement st = c.createStatement();
			System.out.println( " INSERT INTO team(teamName, teamId, sportId) values ('" + teamName + "')" + "(" + sportId + ")" + "(" + teamId + ")");
			st.executeUpdate("INSERT INTO team (teamName, sportId, teamId) values ('" + teamName + "'," + "" + teamId + "," + "" + sportId + ")");
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		
	}

	public void deleteTeam(int teamId) {
		try {
			Statement st = c.createStatement();
			st.executeUpdate("DELETE FROM team WHERE teamId =" + teamId);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void setTeamId(int currentId, int newId){
		try {
			Statement st = c.createStatement();
			st.executeUpdate("UPDATE Team set teamId =" + newId + "where teamId= " + currentId);
			//System.out.println("INSERT INTO person (firstname, lastname) values ('" + firstName + "'," + "'" + lastName + "')");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void setSportId(int currentId, int newId){
		try {
			Statement st = c.createStatement();
			st.executeUpdate("UPDATE Team set sportId =" + newId + "where teamId= " + currentId);
			//System.out.println("INSERT INTO person (firstname, lastname) values ('" + firstName + "'," + "'" + lastName + "')");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void setTeamName(int id,  String teamName){
		try {
			Statement st = c.createStatement();
			st.executeUpdate("UPDATE Team set teamName='" + teamName + "' where teamId=" + id);
			//System.out.println("INSERT INTO person (firstname, lastname) values ('" + firstName + "'," + "'" + lastName + "')");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void getAllTeams(){
		try{
			Statement st = c.createStatement();

			String slt = "SELECT * from Team";
			ResultSet rs = st.executeQuery(slt);
			try{
				while(rs.next()){
					String teamName = rs.getString("teamname");


					int teamId = rs.getInt("teamid");
					int sportId = rs.getInt("sportid");

					System.out.print("ID: " + teamId);
					System.out.print("ID: " + sportId);
					System.out.print(", teamName: " + teamName);


					System.out.println(",");

				}
			}
			catch(Exception e){
				System.out.println(e);

			}
		}

		catch (Exception e){
			System.out.println(e);

		}


	}

}
