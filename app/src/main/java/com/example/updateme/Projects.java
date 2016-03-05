package com.example.updateme;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Umesh on 05-Mar-16.
 */
public class Projects{

   private String district;
   private String zone;
    private String geograph;
    private String DevelopmentRegion;
    private String projectTitle;
    private String Sector;
    private Double amount;



    public Projects(Double amount, String developmentRegion, String district, String geograph, String projectTitle, String sector, String zone) {
        this.amount = amount;
        DevelopmentRegion = developmentRegion;
        this.district = district;
        this.geograph = geograph;
        this.projectTitle = projectTitle;
        Sector = sector;
        this.zone = zone;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDevelopmentRegion() {
        return DevelopmentRegion;
    }

    public void setDevelopmentRegion(String developmentRegion) {
        DevelopmentRegion = developmentRegion;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getGeograph() {
        return geograph;
    }

    public void setGeograph(String geograph) {
        this.geograph = geograph;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getSector() {
        return Sector;
    }

    public void setSector(String sector) {
        Sector = sector;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public static List<Projects> getDummyData(){

        Projects projects1 = new Projects(22597.89,"Far-Western","Achham","Hill","Non-formal Education & National Literacy Campaign","Education","Seti");

        Projects projects2 = new Projects(226173.0,"Far-Western","Achham","Hill","School Sector Reform Program","Education","Seti");
        Projects projects3 = new Projects(143154.0,"Far-Western","Achham","Hill","Integrated District Health Program","Health, Nutrition and Population","Seti");
        Projects projects4 = new Projects(2267.0,"Far-Western","Achham","Hill","Tuberculosis Control","Health, Nutrition and Population","Seti");
        Projects projects5 = new Projects(2635.0,"Far-Western","Achham","Hill","Ayurveda Service Program","Health, Nutrition and Population","Seti");
        Projects projects6 = new Projects(4600.0,"Far-Western","Achham","Hill","National Health Education Information & Communication Service","Health, Nutrition and Population","Seti");
        Projects projects7 = new Projects(150.0,"Far-Western","Achham","Hill","National Training Program","Health, Nutrition and Population","Seti");
        Projects projects8 = new Projects(130.0,"Far-Western","Achham","Hill","National Forest Development & Management Program","Forest and Land Conservation","Seti");
        Projects projects9 = new Projects(2135.0,"Far-Western","Achham","Hill","Leasehold Forest & Livestock Development Program","Forest and Land Conservation","Seti");
        Projects projects10 = new Projects(11051.0,"Far-Western","Achham","Hill","Multi Stakeholders Forestry Program","Forest and Land Conservation","Seti");


        List<Projects> projectsList = new ArrayList<>();
        projectsList.add(projects1);
        projectsList.add(projects2);
        projectsList.add(projects3);
        projectsList.add(projects4);
        projectsList.add(projects5);
        projectsList.add(projects6);
        projectsList.add(projects7);
        projectsList.add(projects8);
        projectsList.add(projects9);
        projectsList.add(projects10);

        return projectsList;

    }
}
