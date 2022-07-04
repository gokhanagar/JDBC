package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DBUtils;

import java.sql.SQLException;

public class DBStepDefs {


    @Given("user connects to the database")
    public void user_connects_to_the_database() {

        DBUtils.createConnection();

    }


    @And("user gets the {string} from {string} table")
    public void userGetsTheFromTable(String column, String table) {
    //                  Select      *       from    tp_customer
        String query = "Select " +column+" from " + table;

        // executing the query.We are on customer table based on scenario on.
        DBUtils.executeQuery(query);

    }


    @And("user reads all of the {string} column data")
    public void userReadsAllOfTheColumnData(String column) throws SQLException {
        //Go to the next row cause 1st row do not have data
        DBUtils.getResultset().next();
        //We are currently in the 1st row. This will return only first row data
        Object columnData1 = DBUtils.getResultset().getObject(column);
        System.out.println(columnData1);
        //Go to the next row. We are on row 2
        DBUtils.getResultset().next();
        Object columnData2 = DBUtils.getResultset().getObject(column);
        System.out.println(columnData2);

        //Iterate the ssn rows
        while(DBUtils.getResultset().next()){// keep going to the next line if there is a data in the next line
        Object nextColumnData = DBUtils.getResultset().getObject(column);
            System.out.println(nextColumnData);

        }

    }


    @Then("close the database connection")
    public void closeTheDatabaseConnection() {
        DBUtils.closeConnection();
    }
}
