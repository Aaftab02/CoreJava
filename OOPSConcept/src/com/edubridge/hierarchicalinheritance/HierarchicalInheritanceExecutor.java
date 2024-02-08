package com.edubridge.hierarchicalinheritance;
//program to demonstrate on hierarchical inheritance
public class HierarchicalInheritanceExecutor {

	public static void main(String[] args) {
		SnowCone c = new SnowCone();
		Tiramisu t = new Tiramisu();
		t.deviceName="Realme 10 PRO PLUS 5G";
		t.version="Android 13";
		c.deviceName="Samsung Galaxy S22";
		c.version="Android 12";
		t.print();
		c.print();

	}

}
