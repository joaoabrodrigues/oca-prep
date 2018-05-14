package java.basics;
// we can't import classes in default packages, like src/

// unused
// if we have the both star import, without the full classes names down there, we will
// get a compilation error, the compiler will not know what 'Date' we want to use

// the compiler will figure it out what will be used with the wildcard import
// so, this don't have any effect in the application, won't slow down the application
// import java.sql.*;

public class ConflictExample {

    public static void main(String[] args){
        // with the full name, we don't have any conflicts
        java.util.Date date;
        java.sql.Date sqlDate;
    }
}
