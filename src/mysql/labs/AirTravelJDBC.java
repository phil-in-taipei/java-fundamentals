package mysql.labs;

import java.sql.*;

public class AirTravelJDBC {
    public static void main(String[] args)  {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSetFlights = null;
        ResultSet resultSetPassengers = null;

        PrintInfoClass.printExerciseIntro("Using JDBC with Air Travel db");

        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            String connectionString = "jdbc:mysql://localhost/air_travel?"
                    + "user=root&password=######" // replace before running code
                    + "&useSSL=false&allowPublicKeyRetrieval=true";

            // Setup the connection with the DB
            connection = DriverManager
                    .getConnection(connectionString);

            // '2021-01-01 00:00:01'

            PrintInfoClass.printDividerLine();

            System.out.println("Created a new flight (see commented out below):");
            PrintInfoClass.printDividerLine();

            System.out.println("Fixed a flight's arrival time:");
            PrintInfoClass.printDividerLine();
            updateFlight("2022-11-01 04:30:01", 6, connection);


            //createNewFlight(
            //        6,
            //        "2022-11-01 00:00:01",
            //        "2022-11-01 03:00:01",
            //        2,
            //        5,
            //        1,
            //        1,
            //        connection
            //);

            // PrintInfoClass.printDividerLine();

            PrintInfoClass.printDividerLine();

            System.out.println("Created a new passenger (see commented out below):");
            PrintInfoClass.printDividerLine();

            System.out.println("Fixed a passenger's passport number:");
            PrintInfoClass.printDividerLine();

            updatePassenger(777777777, "Air", "Flyer", connection);

            //Passenger newPassenger = new Passenger(
            //        000000001, "Yet Even Another", "Person");

            // try to create new passenger:
            //createNewPassenger(
            //        10,
            //        newPassenger.getPassportNum(),
             //       newPassenger.getGiven_name(),
            //        newPassenger.getSurname(),
            //        connection
            //);

            PrintInfoClass.printDividerLine();

            // Statements allow to issue SQL queries to the database
            statement = connection.createStatement();
            // Result set get the result of the SQL query
            resultSetFlights = statement
                    .executeQuery("select * from air_travel.flights");

            System.out.println("Use result set to query the database, and print flights:");
            resultSetsPrintOutTickets(resultSetFlights);

            resultSetPassengers = statement
                    .executeQuery("select * from air_travel.passengers");

            PrintInfoClass.printDividerLine();

            System.out.println("Use result set to query the database, and print passengers:");
            resultSetsPrintOutPassengers(resultSetPassengers);


        } catch (SQLException exc) {
            System.out.println("Exception occurred");
            exc.printStackTrace();
            System.out.println("Did you remember password? Replace #######!");
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occurred - driver not found on classpath");
            e.printStackTrace();
        } finally {
            try {
                // close all JDBC elements
                statement.close();
                resultSetFlights.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        PrintInfoClass.printExerciseExit("Using JDBC with Air Travel db");
    }

    public static void resultSetsPrintOutTickets(ResultSet resultSetFlights) throws SQLException {
        // loop through the result set while there are more records
        while (resultSetFlights.next()) {

            PrintInfoClass.printDividerLine();

            // get the id, name and units fields from the result set and assign them to local variables
            int id = resultSetFlights.getInt("idflights");
            String departureTime = String.valueOf(resultSetFlights.getTimestamp("departure_time"));
            String arrivalTime = String.valueOf(resultSetFlights.getTimestamp("arrival_time"));
            int planeId = resultSetFlights.getInt("plane_id");
            int arlineId = resultSetFlights.getInt("airline_id");

            // print out the result
            System.out.println(
                    "Flight ID: "
                    + id + " ("
                    + departureTime + " -- "
                    + arrivalTime + "); plane/airline "
                    + planeId + "/" + arlineId
            );
        }
    }

    public static void resultSetsPrintOutPassengers(ResultSet resultSetPassengers) throws SQLException {
        // loop through the result set while there are more records
        while (resultSetPassengers.next()) {

            PrintInfoClass.printDividerLine();

            // get the id, name and units fields from the result set and assign them to local variables
            int id = resultSetPassengers.getInt("idpassengers");
            String passport_number = resultSetPassengers.getString("passport_number");
            String given_name = resultSetPassengers.getString("given_name");
            String surname = resultSetPassengers.getString("surname");
            // print out the result
            System.out.println(
                    "Passenger ID: " + id
                            + " with passport no "
                            + passport_number
                            + ", name "
                            +  surname + ", " + given_name
            );
        }
    }

    private static void createNewFlight(
            int id, String departureTime, String arrivalTime,
            int departureLocation, int arrivalLocation,
            int planeID,  int airlineID, Connection connection
    ) {

        String sql = "INSERT INTO air_travel.flights " +
                "(idflights, departure_time, arrival_time, departure_location_id, arrival_location_id, plane_id, airline_id) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?);";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, departureTime);
            ps.setString(3, arrivalTime);
            ps.setInt(4, departureLocation);
            ps.setInt(5, arrivalLocation);
            ps.setInt(6, planeID);
            ps.setInt(7, airlineID);

            System.out.println(ps);

            ps.executeUpdate();
            ps.close();

            System.out.println("Created a new Flight: " +
                    "Flight{" +
                    "\ndepartureTime='" + departureTime + '\'' +
                    ", \narrivalTime='" + arrivalTime + '\'' +
                    ", \ndepartureLocation='" + departureLocation + '\'' +
                    ", \narrivalLocation='" + arrivalLocation + '\'' +
                    ", \nplaneID='" + planeID + '\'' +
                    ", \nairlineID='" + airlineID + '\'' +
                    '}');

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private static void createNewPassenger(int id, int passportNum, String givenName,
                                        String surname, Connection connection) {

        String sql = "INSERT INTO air_travel.passengers " +
                "(idpassengers, passport_number, given_name, surname) " +
                "VALUES (?, ?, ?, ?);";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setInt(2, passportNum);
            ps.setString(3, givenName);
            ps.setString(4, surname);

            System.out.println(ps);

            ps.executeUpdate();
            ps.close();

            System.out.println("Created a new Passenger: " +
                    "Passenger{" +
                    "\ngivenName='" + givenName + '\'' +
                    ", \nsurname='" + surname + '\'' +
                    ", \npassportNum='" + passportNum + '\'' +
                    '}');

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private static void updateFlight(
            String arrivalTime,
            int flightID,
            Connection connection) {

        String sql = "UPDATE air_travel.flights " +
                "SET arrival_time = ? " +
                "WHERE idflights = ? ";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, arrivalTime);
            ps.setInt(2, flightID);

            ps.close();
            System.out.println("Fixed flight arrival time: " +
                    " flightID='" + flightID + '\'' +
                    ", arrivalTime='" + arrivalTime
            );

        }  catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private static void updatePassenger(
            int newPassportNum,
            String givenName, String surname,
            Connection connection) {

        String sql = "UPDATE air_travel.passengers " +
                "SET passport_number = ? " +
                "WHERE given_name = ? " +
                "AND surname = ?;";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, newPassportNum);
            ps.setString(2, givenName);
            ps.setString(3, surname);

            ps.close();
            System.out.println("Fixed passport number: " +
                    " givenName='" + givenName + '\'' +
                    ", surname='" + surname + '\'' +
                    ", passportNum='" + newPassportNum
            );

        }  catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
