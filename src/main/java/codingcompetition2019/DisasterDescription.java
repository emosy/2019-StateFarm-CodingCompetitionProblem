package codingcompetition2019;

public class DisasterDescription {
	
	
	private String category;
	private int reportedIncidents;
	private int year;
	
	//big boy constructor
	public DisasterDescription(String category, int reportedIncidents, int year) {
		this.category = category;
		this.reportedIncidents = reportedIncidents;
		this.year = year;
	}
	
	//for when the year is irrelevant
	public DisasterDescription(String category, int reportedIncidents) {
		this(category, reportedIncidents, -1);
	}
	
	//for when the category is irrelevant
	public DisasterDescription(int reportedIncidents, int year) {
		this(null, reportedIncidents, year);
	}
	
    /**
     * [getCategory description]
     * @return [description]
     */
    public String getCategory() {
		return category;
	}

    /**
     * [getReportedIncidentsNum description]
     * @return [description]
     */
	public int getReportedIncidentsNum() {
		return reportedIncidents;
	}

    /**
     * [getYear description]
     * @return [description]
     */
	public int getYear() {
		return year;
	}
}
