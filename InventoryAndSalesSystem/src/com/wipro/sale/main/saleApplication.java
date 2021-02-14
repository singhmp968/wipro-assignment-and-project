package com.wipro.sale.main;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Stack;

import com.wipro.sale.bean.Product;
import com.wipro.sale.bean.Sales;
import com.wipro.sale.service.Adminstrator;

public class saleApplication {

	public static void main(String[] args) throws ParseException, SQLException {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
Adminstrator ad = new Adminstrator();
Product pdk = new Product();

int ch=0;
do {
	
	System.out.println("1.Insert Stock\n2.Delete Stock\n3.Insert Sales \n4.View Sale Report");
	System.out.println("Eneter Your Choice");
	ch = s.nextInt();
	switch(ch) {
	case 1:
	System.out.println("Eneter Product Id");
	String pid = s.next();
	pdk.setProductId(pid);
	System.out.println("Enter Product Name");
	String pName = s.next();
	pdk.setProductName(pName);
	System.out.println("Enter Quantity on hand");
	int QtyIHand = s.nextInt();
	pdk.setQuantityOnHand(QtyIHand);
	System.out.println("Enter Set Unit Price");
	int setUnitPrice = s.nextInt();
	pdk.setProductUnitPrice(setUnitPrice);
	System.out.println("Enter Record Level");
int rec = s.nextInt();
	pdk.setRecordLevel(rec);
	break;
	
	
	case 2:
		System.out.println("Enter the Product Id deleted");
		String pid1 = s.next();
		pid1 = ad.delete(pid1);
		if(pid1 != null)
			System.out.println("Remove sucess fully");
	break;
	
	case 3:
		Sales sal = new Sales();
		System.out.println("Enter Sales Id");
		String sId = s.next();
		sal.setSaleID(sId);
		System.out.println("Enter date(dd-mm-yyyy)");
		String dayee1 = s.next();
		Date date = new SimpleDateFormat("dd-mm-yyyy").parse(dayee1);
		
		sal.setSaleDate(date);
		System.out.println("Enter Product Id");
		String spid = s.next();
		sal.setProductID(spid);
		
		System.out.println("Enter Quantity Sold");
		int sqtyDol = s.nextInt();
		sal.setQuantitySold(sqtyDol);
		
		System.out.println("Sales Per Unit Price");
		int sPerUtPrc = s.nextInt();
		sal.setSalePricePerUnit(sPerUtPrc);
	break;
	case 4:
		ad.getSalesReport();
		break;
	
		
	}
	
}while(ch!=5);

	}

}
