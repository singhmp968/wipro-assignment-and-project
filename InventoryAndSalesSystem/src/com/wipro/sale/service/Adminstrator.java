package com.wipro.sale.service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import com.wipro.sale.bean.Product;
import com.wipro.sale.bean.Sales;
import com.wipro.sale.bean.salesReport;
import com.wipro.sale.dao.SalesDao;
import com.wipro.sale.dao.StockDao;

public class Adminstrator {
StockDao stockDao = new StockDao();
SalesDao saleDao = new SalesDao();

public synchronized String insertStock(Product stok) throws SQLException {
	String pId =null;
	int pLen=stok.getProductName().length();
	
	if(stok!=null && pLen>=2) {
		 
			pId = stockDao.generateProductID(stok.getProductName());
			stok.setProductId(pId);
			if(stockDao.insertStock(stok) == 1) return pId;
			else
				return "Data not valid";		
	}
	else 
	{
		return "Data not valid";
	}	
	
}

public String delete(String pId) {

	
	if(stockDao.deleteStock(pId) == true) return "true";
	else 
		return "false";
	
}
public String insertSale(Sales sale) {

	if(stockDao.getStock(sale.getProductID().getQuantityOnHand < sale.getQuantitySold())) return "not enugh stock";
	
if(sale == null) return  "not valid for insertion";	


String salsId = saleDao.generateSalesID(sale.getSaleDate()); 
sale.setSaleID(salsId);


if(saleDao.insertSales(sale) == 1) {
	if (stockDao.updateStock(sale.getProductID(), sale.getQuantitySold())==1)
		return "sales record inserted successfully";
	else
		return "False";
}else
{
	return "Error";
}
}
public ArrayList<salesReport> getSalesReport() throws SQLException {	
	return saleDao.getSalesReport();
}
}