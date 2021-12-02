package com.ebanking.master;

import java.io.IOException;

public class Exelib {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		//Instance Class
		
		Library LB=new Library();
		
		String Rval=LB.OpenApp("http://122.175.8.158/ranford2");
		System.out.println(Rval);
		LB.Admlgn("Admin","Te$ting@");
		Rval=LB.Bcre();
		System.out.println(Rval);
	}

}
