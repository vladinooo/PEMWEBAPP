//
//  Created by Vladimir Hartmann
//  Copyright (c) 2012 __MyCompanyName__. All rights reserved.
//
// Session entity for storing session data. Used by JPA.

package pem.pemwebapp.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Session implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String sessionName;
	private String date;
	private String activity;
	private String distanceTravelled;
	private String totalTime;
	private String highestSpeed;
	private String averageGrade;
	private String vo2;
	private String calories;
	private String co2Emissions;

	
	public Session() { 
		// for JPA use only }
	}
	
	public Session(String sessionName, String date, String activity, String distanceTravelled,
			String totalTime, String highestSpeed, String averageGrade, String vo2, String calories,
			String co2Emissions) {
		
		this.sessionName = sessionName;
		this.date = date;
		this.activity = activity;
		this.distanceTravelled = distanceTravelled;
		this.totalTime = totalTime;
		this.highestSpeed = highestSpeed;
		this.averageGrade = averageGrade;
		this.vo2 = vo2;
		this.calories = calories;
		this.co2Emissions = co2Emissions;
	}

	public int getId() {
		return id;
	}

	public String getSessionName() {
		return sessionName;
	}

	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getDistanceTravelled() {
		return distanceTravelled;
	}

	public void setDistanceTravelled(String distanceTravelled) {
		this.distanceTravelled = distanceTravelled;
	}

	public String getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(String totalTime) {
		this.totalTime = totalTime;
	}

	public String getHighestSpeed() {
		return highestSpeed;
	}

	public void setHighestSpeed(String highestSpeed) {
		this.highestSpeed = highestSpeed;
	}

	public String getAverageGrade() {
		return averageGrade;
	}

	public void setAverageGrade(String averageGrade) {
		this.averageGrade = averageGrade;
	}

	public String getVo2() {
		return vo2;
	}

	public void setVo2(String vo2) {
		this.vo2 = vo2;
	}

	public String getCalories() {
		return calories;
	}

	public void setCalories(String calories) {
		this.calories = calories;
	}

	public String getCo2Emissions() {
		return co2Emissions;
	}

	public void setCo2Emissions(String co2Emissions) {
		this.co2Emissions = co2Emissions;
	}

}
