/*
Author: Mr. Guglielmi
Date: 04/03/2024
Description: This class defines a general "block" entity for representing different environmental conditions within a computer program.
*/

public class Block{

    protected int temperature; //the temperature in that block
    protected int wind; //the windspeed in that block
    protected String description; //the type of environment being represented. e.g. "rock" "solid" "salt water"


    Block (int t, int w, String s){
	this.temperature = t;
	this.wind = w;
	this.description = s;
    }

    public int getTemp(){
	return this.temperature;
    }

    public int getWind(){
	return this.wind;
    }

    public String getDescription(){
	return this.description;
    }

    public void setTemp(int t){
	this.temperature = t;
    }

    public void setWind(int w){
	this.wind = w;
    }

    public void setDescription (String s){
	this.description = s;
    }

    public void updateDescription (String s){
	this.description += s;
    }

}
