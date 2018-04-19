package com.tyjy.app.entity;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String bookname;
	private String zuozhe;
	private String chubanshang;
	private String kucun;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBookname() {
		return bookname;
	}


	public void setBookname(String bookname) {
		this.bookname = bookname;
	}


	public String getZuozhe() {
		return zuozhe;
	}


	public void setZuozhe(String zuozhe) {
		this.zuozhe = zuozhe;
	}


	public String getChubanshang() {
		return chubanshang;
	}


	public void setChubanshang(String chubanshang) {
		this.chubanshang = chubanshang;
	}


	public String getKucun() {
		return kucun;
	}


	public void setKucun(String kucun) {
		this.kucun = kucun;
	}


	@Override
	public String toString() {
		return "UUser [id=" + id + ", bookname=" + bookname + ", zuozhe=" + zuozhe + ", chubanshang=" + chubanshang
				+ ", kucun=" + kucun + "]";
	}
}
