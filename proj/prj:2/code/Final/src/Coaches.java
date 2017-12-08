import java.io.IOException;
import java.sql.*;

public class Coaches {
private int coachId;
private int teamId;
private String coachName;
	Connection c = null;



	public Coaches() throws IOException, SQLException, ClassNotFoundException{

		try{
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ethancarpenter", "ethancarpenter", "");
			System.out.println(c);

		}
		catch(Exception ce) {
			System.out.println(ce);
		}


	}
	
	 

	 
	public void saveCoach(int coachId, int teamId) {
		try {
			Statement st = c.createStatement();
			System.out.println( "INSERT INTO coach (coachId, teamId, coachName) values ('" + coachId + "')" + "(" + teamId + ")" + "(" + coachName + ")");
			st.executeUpdate("INSERT INTO coach (coachId, teamId) values (" + coachId + "," + "" + teamId+")");
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}
	public void deleteCoach(int coachId) {
		try {
			Statement st = c.createStatement();
			st.executeUpdate("DELETE FROM Coach WHERE coachId =" + coachId);
		} catch (Exception e) {
			System.out.println(e);

		}
	}

	public void setCoachId(int currentId, int newId){
		try {
			Statement st = c.createStatement();
			st.executeUpdate("UPDATE Coach set coachId =" + newId + "where coachId= " + currentId);
			//System.out.println("INSERT INTO person (firstname, lastname) values ('" + firstName + "'," + "'" + lastName + "')");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void setTeamId(int currentId, int newId){
		try {
			Statement st = c.createStatement();
			st.executeUpdate("UPDATE Coach set teamId =" + newId + "where teamId= " + currentId);
			//System.out.println("INSERT INTO person (firstname, lastname) values ('" + firstName + "'," + "'" + lastName + "')");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void getAllCoaches(){
		try{
			Statement st = c.createStatement();

			String slt = "SELECT * from Coaches";
			ResultSet rs = st.executeQuery(slt);
			try{
				while(rs.next()){


					int teamidId = rs.getInt("teamid");
					int coachId = rs.getInt("coachid");

					System.out.print("ID: " + teamId);
					System.out.print("ID: " + coachId);



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
