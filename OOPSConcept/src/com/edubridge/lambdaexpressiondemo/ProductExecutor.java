package com.edubridge.lambdaexpressiondemo;
/*implemented functional interface method with the help of lambda expression
 * implemented static and default method of functional interface*/ 
public class ProductExecutor {

	public static void main(String[] args) {
		//lambda expression
		Product p = (price)->{
			System.out.println("Price is: "+price);
		};
		System.out.println(p.displayProductName());
		System.out.println(Product.ProductBrand());
		p.displayProductPrice(1500);

	}

}
