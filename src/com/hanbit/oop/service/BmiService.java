package com.hanbit.oop.service;
public class BmiService {
	private double height, weight, bmi;
	private String result;
	
	public void setHeight(double height){
		this.height = height;
	}
	public void setWeight(double weight){
		this.weight = weight;
	}
	public void setBmi(){
		this.bmi =  weight / ((height)*(height));
	}
	public double getHeight(){
		return height;
	}
	public double getWeight(){
		return weight;
	}
	public double getBmi(){
		return bmi;
	}
	
	public void setState(){
		if (bmi <= 30){
			if(bmi <= 18.5)
				result = "당신은 저체중입니다.";
			else if(bmi > 25)
				result = "당신은 과체중입니다.";
			else
				result = "당신은 정상입니다.";
		}
		else
			result = "당신은 비만입니다.";
	}
	public String getState(){
		return result;
	}
}
