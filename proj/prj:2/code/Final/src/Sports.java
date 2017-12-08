import java.io.IOException;
import java.sql.*;

public class Sports {
private int sportId;
private String sportName;
	Connection c = null;

		public Sports() throws IOException, SQLException, ClassNotFoundException{

		try{
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ethancarpenter", "ethancarpenter", "");
			System.out.println(c);

		}
		catch(Exception ce) {
			System.out.println(ce);
		}


	}
	

	public void setSportId(int currentId, int newId){
		try {
			Statement st = c.createStatement();
			st.executeUpdate("UPDATE Sports set sportId =" + newId + "where sportid= " + currentId);
			//System.out.println("INSERT INTO person (firstname, lastname) values ('" + firstName + "'," + "'" + lastName + "')");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void setSportName(int id,  String sportName){
		try {
			Statement st = c.createStatement();
			st.executeUpdate("UPDATE Sports set sportName='" + sportName + "' where sportId=" + id);
			//System.out.println("INSERT INTO person (firstname, lastname) values ('" + firstName + "'," + "'" + lastName + "')");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void saveSport(int sportId, String sportName) {
		try {
			Statement st = c.createStatement();
			System.out.println("INSERT INTO sports (sportName, sportId) values ('" + sportName + "')" + "(" + sportId + ")");
			st.executeUpdate("INSERT INTO sports (sportName, sportId) values ('" + sportName + "'," + "" + sportId + ")");
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

	public void deleteSport(int sportId) {
		try {
			Statement st = c.createStatement();
			st.executeUpdate("DELETE FROM sports WHERE sportId =" + sportId);
		}
		catch (Exception e){
			System.out.println(e);

		}
	}

	public void getAllSports(){
		try{
			Statement st = c.createStatement();

			String slt = "SELECT * from Sports";
			ResultSet rs = st.executeQuery(slt);
			try{
				while(rs.next()){
					String sportName = rs.getString("sportname");


					int sportId = rs.getInt("sportid");

					System.out.print("ID: " + sportId);
					System.out.print(", SportName: " + sportName);


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