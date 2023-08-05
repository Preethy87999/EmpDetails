package com.simplilearn.EmpDetails;

import java.sql.ResultSet;
import java.util.List;

import com.simplilearn.EmpDetails.db.DB;
import com.simplilearn.EmpDetails.model.Worker;

public class App 
{
    public static void main( String[] args )
    {
        DB db = new DB();
        db.createConnection();
        
       Worker workers=new Worker();
        db.createWorker(workers);
        
        List<Worker> workers1 = db.getAllWorkers();

        db.closeConnection();
    }
}
