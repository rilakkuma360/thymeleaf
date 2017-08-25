package com.example.project.common.domain;

public class DataTableSearch {
	
	private int draw;
	
	//第一条数据的起始位置，比如0代表第一条数据
	private int start;
	
	//告诉服务器每页显示的条数
	private int length;

	public int getDraw() {
		return draw;
	}

	public void setDraw(int draw) {
		this.draw = draw;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public int getPage() {
		
		return this.start/this.length;
		
	}


}
