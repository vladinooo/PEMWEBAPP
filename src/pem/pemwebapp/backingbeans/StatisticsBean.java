package pem.pemwebapp.backingbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import pem.pemwebapp.domain.Session;

@ManagedBean(name="statisticsBean")
@SessionScoped
public class StatisticsBean {  
	  
	
	@ManagedProperty(value="#{sessionsBean}") // name of real bean to be injected
	private SessionsBean tempSessionsBean;
	
	private List<Session> sessions;
	private CartesianChartModel caloriesModel;   
	private CartesianChartModel co2EmissionsModel;   
	
	
	// setter for injected bean
	public void setTempSessionsBean(SessionsBean sessionsBean) {
		tempSessionsBean = sessionsBean;
	}
	
	// initialize bean before rendering
	public void preRender() {
		sessions = tempSessionsBean.getAllSessions();
		createCaloriesModel();
		createCo2EmissionsModel();
	}
	
  
    public CartesianChartModel getCaloriesModel() {  
        return caloriesModel;  
    } 
    
    public CartesianChartModel getCo2EmissionsModel() {  
        return co2EmissionsModel;  
    } 
  
  
    // create calories chart
    private void createCaloriesModel() {  
        caloriesModel = new CartesianChartModel();  
        ChartSeries calories = new ChartSeries();  
        calories.setLabel("Calories");  
        for (Session s: sessions) {
        	calories.set(s.getDate(), Double.parseDouble(s.getCalories()));
        }
        caloriesModel.addSeries(calories);  
    }  
  
    // create co2Emissions chart
    public void createCo2EmissionsModel() {
        co2EmissionsModel = new CartesianChartModel();  
    	ChartSeries co2Emissions = new ChartSeries();  
        co2Emissions.setLabel("CO2 emissions");  
        for (Session s: sessions) {
        	co2Emissions.set(s.getDate(), Double.parseDouble(s.getCo2Emissions()));
        } 
        co2EmissionsModel.addSeries(co2Emissions);  
    }
}  




