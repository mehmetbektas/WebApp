package com;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="kullanici")
public class IndexBean {
	
	String isim;
	int yas;
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	public String getIsim() {
		return isim;
	}
	public int getYas() {
		return yas;
	}
	
	public void btnEkleClick(){
		ServiceFacade.instance().kayitEkle(new Kisi(isim, yas));
	}
}
