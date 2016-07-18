package com.sist.chick;
import java.awt.*;
import java.util.*;

import com.sist.ui.MyFrame;
public class Chick {
	protected int x;
	protected int y;
	
	//기본 생성자-위치 좌표를 임의로 추출하는 기능 제공함.
	public Chick(){
		Random rnd=new Random();
		x=rnd.nextInt(MyFrame.FRAME_WIDTH-100)+50;
		y=rnd.nextInt(MyFrame.FRAME_HEIGHT-140)+70;
	}
	
	//생성자 오버로딩-인수를 전달받아 설정하는 생성자
	public Chick(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public void display(Graphics g){
		g.fillOval(x, y, 0, 0); //채워주는거.
	}
	
	//나중에 구현 예정.
	public void ppick(Graphics g){;}
	public void walk(Graphics g){;}
	
	
}
