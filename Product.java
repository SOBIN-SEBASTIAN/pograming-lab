import java.util.Scanner;
public class Product{
	Scanner obj=new Scanner(System.in);
	int p_code;
	String pname;
	int price;
	void getdata(){
		System.out.println("\nEnter The product Details : ");
		System.out.println("Enter the Product code  :");
		p_code=obj.nextInt();
		System.out.println("Enter the Product Name  :");
		pname=obj.next();
		System.out.println("Enter the Product Price :");
		price=obj.nextInt();
	}
	void display(){
		System.out.println("Product code  : "+p_code);
		System.out.println("Product Name  : "+pname);
		System.out.println("Product Price : "+price);
	}	
public static void main (String[] args){
	Scanner obj=new Scanner(System.in);
	Product p1=new Product();
	Product p2=new Product();
	Product p3=new Product();
	p1.getdata();
	p2.getdata();
	p3.getdata();
	p1.display();
	p2.display();
	p3.display();
	if (p1.price>p2.price){
		if(p2.price>p3.price){
			System.out.println("The price of "+p3.pname+" is the lowest");
		}
		else{
			System.out.println("The price of "+p2.pname+" is the lowest");
		}
	}else{
		if(p1.price>p3.price){
			System.out.println("The price of "+p3.pname+" is the lowest");
		}
		else{
			System.out.println("The price of "+p1.pname+" is the lowest");
		}
	}
}}