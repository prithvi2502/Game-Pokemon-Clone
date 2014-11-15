package com.me.GameTrial.entities;

import java.util.ArrayList;

public class CollisionObjects {
	public ArrayList<positions> positionsBottom(){
		return null;
	}
	
	public ArrayList<positions> positionsLeft(){
		return null;
	}
	
	public ArrayList<positions> positionsRight(){
		return null;
	}
	
	public ArrayList<positions> positionsTop(){
		ArrayList<positions> pos = new ArrayList<positions>();
		int[] xRange1 = {366,710,1278,1648,1632,148,1216};
		int[] xRange2 = {418,762,1596,1900,1678,3138,1964};
		int[] yconstants = {1816,1802,1288,1288,1450,136,1962};
		//for loop storage
		
		for(int i = 0; i < xRange1.length; i++) {
			for(int j = xRange1[i]; j < xRange2[i]; j += 2) {
				positions obj = new positions();
				obj.setX(j);
				obj.setY(yconstants[i]);
				pos.add(obj);
			}
		}
		
		/*for(int i = 366; i < 418; i += 2){
			positions obj = new positions();
			obj.setX(i);
			obj.setY(1816);
			pos.add(obj);
		}
		for(int i = 710; i < 762; i += 2){
			positions obj = new positions();
			obj.setX(i);
			obj.setY(1802);
			pos.add(obj);
		}
		for(int i = 1278; i < 1596; i += 2){
			positions obj = new positions();
			obj.setX(i);
			obj.setY(1288);
			pos.add(obj);
		}
		for(int i = 1648; i < 1900; i += 2){
			positions obj = new positions();
			obj.setX(i);
			obj.setY(1288);
			pos.add(obj);
		}
		for(int i = 1632; i < 1678; i += 2){
			positions obj = new positions();
			obj.setX(i);
			obj.setY(1450);
			pos.add(obj);
		}
		for(int i = 148; i < 3138; i += 2){
			positions obj = new positions();
			obj.setX(i);
			obj.setY(136);
			pos.add(obj);
		}
		for(int i = 1216; i < 1964; i += 2){
			positions obj = new positions();
			obj.setX(i);
			obj.setX(1962);
			pos.add(obj);
		}*/
		
		//simple add
		int[] xPos = {1600, 1642};
		int[] yPos = {1276, 1276};
		for(int i = 0; i < xPos.length; i++){
			positions obj = new positions();
			obj.setX(xPos[i]);
			obj.setY(yPos[i]);
			pos.add(obj);
		}
		return pos;
	}
	
	
}
