package com.tnsif.daytwenty;

@SmartPhone(version=5)
@SmartTV(os="android" , width=40, height= 50)
@SmartTV(width=50, height = 0, os = "")
public class AndroidSeries {
	String model;
	int screenSize;
	public AndroidSeries(String model, int screenSize) {
		super();
		this.model = model;
		this.screenSize = screenSize;
	}
	@Override
	public String toString() {
		return "AndroidSeries [model=" + model + ", screenSize=" + screenSize + "]";
	}	
	
	
}
