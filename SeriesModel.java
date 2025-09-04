/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SeriesModel;

/**
 *
 * @author lab_services_student
 */
public class SeriesModel {
    private String SeriesId;
    private String SeriesName;
    private int seriesAge;
    private int numberOfEpisodes;
    private String seriesName;
    private String seriesId;
    
    public SeriesModel(String seriesId, String SeriesName, int seriesAge, int numberOfEpisode) {
        this.seriesId = seriesId;
        this.SeriesName = seriesName;
        this.seriesAge = seriesAge;
        this.numberOfEpisodes = numberOfEpisodes;
    }
    //Getters and sertters
    public String getSeriesId() {
        return seriesId;
    }
    
    public void setSeriesAge(String seriesId) {
        this.seriesAge = seriesAge;
    }
    
    public void getSeriesName( String seriesName) {
        this.seriesName = seriesName;
    }
    
    public void setSeriesAge(int seriesAge) {
        this.seriesAge = seriesAge;
    }
    
    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }
    
    public int setNumberOFEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes =numberOfEpisodes;
        return 0;
    }
    
    @Override
    public String toString() {
        return "SERIES ID" + seriesId +
                "\nSERIES NAME: " + seriesName +
                "\nSERIES AGE RESTRICTION: " + seriesAge +
                "\nNUMBER OF EPISODES: " + numberOfEpisodes;
    }
}

