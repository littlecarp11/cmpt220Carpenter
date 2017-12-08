import java.io.IOException;
import java.sql.*;

public class Person {

	private String firstName;
	private String lastName;
	private int personId;
	Connection c = null;

	public Person() throws IOException, SQLException, ClassNotFoundException{
		try{
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ethancarpenter", "ethancarpenter", "");
			System.out.println(c);

		}
		catch(Exception ce) {
			System.out.println(ce);
		}
		Statement st = c.createStatement();




	}


	// INSERT INTO players (firstname, lastname) values ("Ethan", Carpenter");





	public void setPersonId(int currentId, int newId){
		try {
			Statement st = c.createStatement();
			st.executeUpdate("UPDATE person set personid =" + newId + "where personid= " + currentId);
			//System.out.println("INSERT INTO person (firstname, lastname) values ('" + firstName + "'," + "'" + lastName + "')");
		} catch (Exception e) {
			System.out.println(e);
		}
	}


	public void setFirstName(int id,  String firstName){
		try {
			Statement st = c.createStatement();
			st.executeUpdate("UPDATE person set firstName='" + firstName + "' where personId=" + id);
			//System.out.println("INSERT INTO person (firstname, lastname) values ('" + firstName + "'," + "'" + lastName + "')");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void setLastName(int id,  String lastName){
		try {
			Statement st = c.createStatement();
			st.executeUpdate("UPDATE person set lastName='" + lastName + "' where personId=" + id);
			//System.out.println("INSERT INTO person (firstname, lastname) values ('" + firstName + "'," + "'" + lastName + "')");
		} catch (Exception e) {
			System.out.println(e);
		}
	}


	public void savePerson(String firstName, String lastName, int personId) {
		try {
			Statement st = c.createStatement();
			st.executeUpdate("INSERT INTO person (firstname, lastname, personId) values ('" + firstName + "'," + "'" + lastName + "'" + ",'" + personId + "')");
			//System.out.println("INSERT INTO person (firstname, lastname) values ('" + firstName + "'," + "'" + lastName + "')");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void deletePerson(int personId) {
			try {
				Statement st = c.createStatement();
				st.executeUpdate("DELETE FROM person WHERE personId =" + personId);
		}
			catch (Exception e){
				System.out.println(e);

			}




			}
			public void getAllPeople(){
				try{
					Statement st = c.createStatement();

					String slt = "SELECT * from Person";
					ResultSet rs = st.executeQuery(slt);
				try{
					while(rs.next()){
						String firstName = rs.getString("firstname");
						String lastName = rs.getString("lastname");

						int personId = rs.getInt("personid");

						System.out.print("ID: " + personId);
						System.out.print(", FirstName: " + firstName);
						System.out.print(", LastName: " + lastName);

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
