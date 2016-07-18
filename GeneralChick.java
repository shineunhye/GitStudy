package com.sist.chick;
import java.awt.*;
public class GeneralChick extends Chick{
	public static final int GC_SIZE=30;
	
	public GeneralChick(){
		
	}
	
	public GeneralChick(int xx,int yy){
		super(xx,yy); //부모 클래스 생성자 호출
	}

	@Override
	public void display(Graphics g) {
		g.setColor(Color.orange);
		g.drawString("노란병아리", x, y-2);
		g.fillOval(x, y, GeneralChick.GC_SIZE, GeneralChick.GC_SIZE); //지정한 크기만큼 채워짐.
	}
	
}
