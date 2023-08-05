package com.simplilearn.EmpDetails.db;

import java.util.List;

import com.simplilearn.EmpDetails.model.Worker;

public interface DAO {

	void createConnection();
	void closeConnection();
	void createWorker(Worker workers);
	List<Worker>getAllWorkers();
	
	
}
