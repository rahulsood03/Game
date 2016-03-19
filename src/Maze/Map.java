package Maze;

import java.awt.*;
import java.io.*;
import java.util.*;

import javax.swing.ImageIcon;

public class Map {
	
	private Scanner m;
	
	private String Map[] = new String[16];
	
	private Image wall,
				  road,
				  finish;

	
	public Map(){
		
		ImageIcon img = new ImageIcon("/Users/rahulsood/Documents/workspace/Maze/src/wall.jpg/");
		wall = img.getImage();
	    img = new ImageIcon("/Users/rahulsood/Documents/workspace/Maze/src/road.jpg/");
		road = img.getImage();
		img = new ImageIcon("/Users/rahulsood/Documents/workspace/Maze/src/finish.png/");
		finish = img.getImage();
		
		
		
		openFile();
		readFile();
		closeFile();
	}
	
	public Image getWall(){
		return wall;
	}
	public Image getRoad(){
		return road;
	}
	public Image getFinish(){
		return finish;
	}
	
	public String getMap(int x, int y){
		String index = Map[y].substring(x, x + 1);
		return index;
	}
	
	public void openFile(){
		
		try{
			m = new Scanner(new File("/Users/rahulsood/Documents/workspace/Maze/src/Map.txt"));
		}catch(Exception e){
			System.out.println("error loading map");
		}
		
	}
	public void readFile(){
		while(m.hasNext()){
			for(int i = 0; i < 14; i++){
			Map[i] = m.next();
			}
		}
		
	}
	
	public void closeFile(){
		m.close();

	}
}
