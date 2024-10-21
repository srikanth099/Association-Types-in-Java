package org.Friday.assosiation.main;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.Friday.assosiation.repository.AssosiationRepository1;
import org.Friday.assosiationtype.manytomany.MilkBrand;
import org.Friday.assosiationtype.manytomany.MilkProduct;

public class MilkBrand_Product {
	public static void main(String[] args) {
		AssosiationRepository1 repository3 = new AssosiationRepository1();
//		MilkBrand milkBrand = new MilkBrand("curd", "ammul");
//		MilkProduct milkProduct = new MilkProduct("milk", "ammul");

		MilkProduct pro = new MilkProduct();
		pro.setBrand("curd");
		MilkProduct pro1 = new MilkProduct();
		pro1.setBrand("milk");
		MilkProduct pro2 = new MilkProduct();
		pro2.setBrand("pannir");

		ArrayList<MilkProduct> products = new ArrayList<MilkProduct>();

		products.add(pro);
		products.add(pro1);
		products.add(pro2);

		ArrayList<MilkBrand> brands = new ArrayList<MilkBrand>();

		MilkBrand brand1 = new MilkBrand();
		brand1.setName("ammul");
		brand1.setProduct(products);
		MilkBrand brand2 = new MilkBrand();
		brand2.setName("qualitywalls");
		brand2.setProduct(products);
		MilkBrand brand3 = new MilkBrand();
		brand3.setName("nandini");
		brand3.setProduct(products);

		brands.add(brand1);
		brands.add(brand2);
		brands.add(brand3);

		pro.setBrands(brands);
		pro1.setBrands(brands);
		pro2.setBrands(brands);

		repository3.saveBrands(brand3);
		repository3.saveBrands(brand2);
		repository3.saveBrands(brand1);

	}

}
