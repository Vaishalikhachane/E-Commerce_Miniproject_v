package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MiniProject {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		char ch;
		int prodQuantity=0;
		int quantity=0;
		int price=0;
		
		try {
			//loading driver
			
			Class.forName("com.mysql.jdbc.Driver");
			//jdbc connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_commerce", "root", "password");
			
			Statement st =con.createStatement();
			
		    System.out.println("Dear Customer ");
		    
		    
		   //getting user info
		    
	    	System.out.print("Enter Your First name : ");
			String Fname=sc.next();
			
			System.out.print("Enter Your Last name : ");
			String Lname=sc.next();
			
			
			System.out.print("Enter Your Email : ");
			String Email=sc.next();
			
			System.out.print("Enter Your Mobile no : ");
			String Mobile=sc.next();
			
			
			st.executeUpdate("insert into Userinfo value ('"+Email+"','"+Fname+"','"+Lname+"','"+Mobile+"')" );
			
			System.out.println(" "+Fname+" : Thannku for registration ");
			
			//showing products details 
			System.out.println("-----------------------  Products ------------------------------- ");
			
			
			ResultSet rs=st.executeQuery("select * from product order by Pnames ASC");
			
			System.out.println("| Quantity  |   Description    |     Price     |    Product Name   |");
			
			while(rs.next())
			{
				System.out.println("  "+rs.getInt(5)+"\t\t"+rs.getString(2)+"\t\t"+rs.getInt(3)+"\t\t"+rs.getString(4));
			}
			
			
			System.out.println(" ");
			System.out.println("--------------------------------------------------------------------------- ");
			
			//getting user choice 
			
			do 
			{
				System.out.println("Dear : "  +Fname+" :   Plz Select What u want to Buy");
				System.out.println("--------------------------------------------------------------------------- ");
				System.out.println("Press 1 for laptop");
				System.out.println("Press 2 for mobile");
				System.out.println("Press 3 for headphone");
				System.out.println("Press 4 for mouse");
				System.out.println("Press 5 for mousepad");
				System.out.println("Press 6 for Keyboard");
				System.out.println("Press 7 for RAM");
				System.out.println("Press 8 for Monitor");
				System.out.println("Press 9 for Earphone");
				System.out.println("Press 10 for MobileCharger");
				
				int item=sc.nextInt();
				
				
				
				
				switch(item)
				{
				
				case 1:

					  
					  ResultSet rs1=st.executeQuery("select Quantity,price,Pnames from product where Pnames='laptop'");
					  while(rs1.next())
					  {
						  prodQuantity = rs1.getInt(1);
						  System.out.println("Stock Left : "+prodQuantity);
						  
						  price = rs1.getInt(2);
						  System.out.println(" Price for 1 : "+price);
					  }
					  //quantity input add price and substract from quantity
			    	  					  
			    	  System.out.println("Enter Quantity : ");
					   quantity = sc.nextInt();
					  if(quantity < prodQuantity) {
						  int add=quantity*price;
						  int rem = prodQuantity-quantity;
						  st.executeUpdate("update product set Quantity="+rem+",price="+price+" where Pnames='laptop'");
						  st.executeUpdate("insert into Cart value('"+Fname+"','laptop',"+add+","+quantity+")");
						  System.out.println("Thanku for shopping");
						  break;
					  
					  }
					  else {
						  System.out.println("Entered Quantity is greater Than Stock / Out of Stock.");
					  break;
					  
					  }
					  
					  
					  
				case 2:
					
				       
					  ResultSet rs2=st.executeQuery("select Quantity,price from product where Pnames='mobile'");
					  while(rs2.next())
					  {
						  prodQuantity = rs2.getInt(1);
						  System.out.println("Stock Left : "+prodQuantity);
						  
						  price = rs2.getInt(2);
						  System.out.println(" Price for 1 : "+price);
					  }
			    	  					  
			    	  System.out.println("Enter Quantity : ");
					   quantity = sc.nextInt();
					  if(quantity < prodQuantity) {
						  int add=quantity*price;
						  int rem = prodQuantity-quantity;
						  st.executeUpdate("update product set Quantity="+rem+",price="+price+" where Pnames='mobile'");
						  st.executeUpdate("insert into Cart value('"+Fname+"','mobile',"+add+","+quantity+")");
						  System.out.println("Thanku for shopping");
						  break;
					  
					  }
					  else {
						  System.out.println("Entered Quantity is greater Than Stock / Out of Stock.");
					  break;
					  
					  }
					  
					  
				case 3:
					  ResultSet rs3=st.executeQuery("select Quantity,price from product where Pnames='headphone'");
					  while(rs3.next())
					  {
						  prodQuantity = rs3.getInt(1);
						  System.out.println("Stock Left : "+prodQuantity);
						  
						  price = rs3.getInt(2);
						  System.out.println(" Price for 1 : "+price);
					  }
			    	  					  
			    	  System.out.println("Enter Quantity : ");
					   quantity = sc.nextInt();
					  if(quantity < prodQuantity) {
						  int add=quantity*price;
						  int rem = prodQuantity-quantity;
						  st.executeUpdate("update product set Quantity="+rem+",price="+price+" where Pnames='headphone'");
						  st.executeUpdate("insert into Cart value('"+Fname+"','headphone',"+add+","+quantity+")");
						  System.out.println("Thanku for shopping");
						  break;
					  
					  }
					  else {
						  System.out.println("Entered Quantity is greater Than Stock / Out of Stock.");
					  break;
					  
					  }
					  
					  
				case 4:
					ResultSet rs4=st.executeQuery("select Quantity,price from product where Pnames='mouse'");
					  while(rs4.next())
					  {
						  prodQuantity = rs4.getInt(1);
						  System.out.println("Stock Left : "+prodQuantity);
						  
						  price = rs4.getInt(2);
						  System.out.println(" Price for 1 : "+price);
					  }
			    	  					  
			    	  System.out.println("Enter Quantity : ");
					   quantity = sc.nextInt();
					  if(quantity < prodQuantity) {
						  int add=quantity*price;
						  int rem = prodQuantity-quantity;
						  st.executeUpdate("update product set Quantity="+rem+",price="+price+" where Pnames='mouse'");
						  st.executeUpdate("insert into Cart value('"+Fname+"','mouse',"+add+","+quantity+")");
						  System.out.println("Thanku for shopping");
						  break;
					  
					  }
					  else {
						  System.out.println("Entered Quantity is greater Than Stock / Out of Stock.");
					  break;
					  
					  }
					  
					  
					  
				case 5:
					ResultSet rs5=st.executeQuery("select Quantity,price from product where Pnames='mousepad'");
					  while(rs5.next())
					  {
						  prodQuantity = rs5.getInt(1);
						  System.out.println("Stock Left : "+prodQuantity);
						  
						  price = rs5.getInt(2);
						  System.out.println(" Price for 1 : "+price);
					  }
			    	  					  
			    	  System.out.println("Enter Quantity : ");
					   quantity = sc.nextInt();
					  if(quantity < prodQuantity) {
						  int add=quantity*price;
						  int rem = prodQuantity-quantity;
						  st.executeUpdate("update product set Quantity="+rem+",price="+price+" where Pnames='mousepad'");
						  st.executeUpdate("insert into Cart value('"+Fname+"','mousepad',"+add+","+quantity+")");
						  System.out.println("Thanku for shopping");
						  break;
					  
					  }
					  else {
						  System.out.println("Entered Quantity is greater Than Stock / Out of Stock.");
					  break;
					  
					  }
					  
					  
				case 6:
					ResultSet rs6=st.executeQuery("select Quantity,price from product where Pnames='keyboard'");
					  while(rs6.next())
					  {
						  prodQuantity = rs6.getInt(1);
						  System.out.println("Stock Left : "+prodQuantity);
						  
						  price = rs6.getInt(2);
						  System.out.println(" Price for 1 : "+price);
					  }
			    	  					  
			    	  System.out.println("Enter Quantity : ");
					   quantity = sc.nextInt();
					  if(quantity < prodQuantity) {
						  int add=quantity*price;
						  int rem = prodQuantity-quantity;
						  st.executeUpdate("update product set Quantity="+rem+",price="+price+" where Pnames='keyboard'");
						  st.executeUpdate("insert into Cart value('"+Fname+"','keyboard',"+add+","+quantity+")");
						  System.out.println("Thanku for shopping");
						  break;
					  
					  }
					  else {
						  System.out.println("Entered Quantity is greater Than Stock / Out of Stock.");
					  break;
					  
					  }
					  
					  
				case 7:
					ResultSet rs7=st.executeQuery("select Quantity,price from product where Pnames='RAM'");
					  while(rs7.next())
					  {
						  prodQuantity = rs7.getInt(1);
						  System.out.println("Stock Left : "+prodQuantity);
						  
						  price = rs7.getInt(2);
						  System.out.println(" Price for 1 : "+price);
					  }
			    	  					  
			    	  System.out.println("Enter Quantity : ");
					   quantity = sc.nextInt();
					  if(quantity < prodQuantity) {
						  int add=quantity*price;
						  int rem = prodQuantity-quantity;
						  st.executeUpdate("update product set Quantity="+rem+",price="+price+" where Pnames='RAM'");
						  st.executeUpdate("insert into Cart value('"+Fname+"','RAM',"+add+","+quantity+")");
						  System.out.println("Thanku for shopping");
						  break;
					  
					  }
					  else {
						  System.out.println("Entered Quantity is greater Than Stock / Out of Stock.");
					  break;
					  
					  }
					  
					  
				case 8:
					ResultSet rs8=st.executeQuery("select Quantity,price from product where Pnames='monitor'");
					  while(rs8.next())
					  {
						  prodQuantity = rs8.getInt(1);
						  System.out.println("Stock Left : "+prodQuantity);
						  
						  price = rs8.getInt(2);
						  System.out.println(" Price for 1 : "+price);
					  }
			    	  					  
			    	  System.out.println("Enter Quantity : ");
					   quantity = sc.nextInt();
					  if(quantity < prodQuantity) {
						  int add=quantity*price;
						  int rem = prodQuantity-quantity;
						  st.executeUpdate("update product set Quantity="+rem+",price="+price+" where Pnames='monitor'");
						  st.executeUpdate("insert into Cart value('"+Fname+"','monitor',"+add+","+quantity+")");
						  System.out.println("Thanku for shopping");
						  break;
					  
					  }
					  else {
						  System.out.println("Entered Quantity is greater Than Stock / Out of Stock.");
					  break;
					  
					  }
					  
					  
					  
				case 9:
					ResultSet rs9=st.executeQuery("select Quantity,price from product where Pnames='earphone'");
					  while(rs9.next())
					  {
						  prodQuantity = rs9.getInt(1);
						  System.out.println("Stock Left : "+prodQuantity);
						  
						  price = rs9.getInt(2);
						  System.out.println(" Price for 1 : "+price);
					  }
			    	  					  
			    	  System.out.println("Enter Quantity : ");
					   quantity = sc.nextInt();
					  if(quantity < prodQuantity) {
						  int add=quantity*price;
						  int rem = prodQuantity-quantity;
						  st.executeUpdate("update product set Quantity="+rem+",price="+price+" where Pnames='earphone'");
						  st.executeUpdate("insert into Cart value('"+Fname+"','earphone',"+add+","+quantity+")");
						  System.out.println("Thanku for shopping");
						  break;
					  
					  }
					  else {
						  System.out.println("Entered Quantity is greater Than Stock / Out of Stock.");
					  break;
					  
					  }
					  
					  
				case 10:
					ResultSet rs10=st.executeQuery("select Quantity,price from product where Pnames='MobileCharger'");
					  while(rs10.next())
					  {
						  prodQuantity = rs10.getInt(1);
						  System.out.println("Stock Left : "+prodQuantity);
						  
						  price = rs10.getInt(2);
						  System.out.println(" Price for 1 : "+price);
					  }
			    	  					  
			    	  System.out.println("Enter Quantity : ");
					   quantity = sc.nextInt();
					  if(quantity < prodQuantity) {
						  int add=quantity*price;
						  int rem = prodQuantity-quantity;
						  st.executeUpdate("update product set Quantity="+rem+",price="+price+" where Pnames='MobileCharger'");
						  st.executeUpdate("insert into Cart value('"+Fname+"','MobileCharger',"+add+","+quantity+")");
						  System.out.println("Thanku for shopping");
						  break;
					  
					  }
					  else {
						  System.out.println("Entered Quantity is greater Than Stock / Out of Stock.");
					  break;
					  
					  }
					  

				 default :
			    {
			    	System.out.println("Invalid choice");
			    }	  
					  
					  
				}
				System.out.println("Do u want do continue Shoppping (Y/N)");
				ch=sc.next().charAt(0);
				
				
				
			} while((ch == 'y') || (ch== 'Y'));

				
				System.out.println("-----------------------  Your Cart ------------------------------- ");
				
				System.out.println("");
				System.out.println("");
				ResultSet rs2=st.executeQuery("select * from Cart where username='"+Fname+"'");
				
				

				System.out.println("User :"+Fname);
				while(rs2.next())
				{
					System.out.println("------------------------------------------------");
					System.out.println("\t Product : "+rs2.getString(2)+"\t Price :"+rs2.getInt(3)+"\t");
					System.out.println("");
					
				}
				
				ResultSet rs3=st.executeQuery("select sum(Pprice) from Cart where username='"+Fname+"'");
				
				while(rs3.next())
				{
					System.out.println("------------------------------------------------");
					System.out.println("Total bill is :"+rs3.getInt(1));
					System.out.println("");
				}
			
			
			
			con.close();
			rs.close();
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
