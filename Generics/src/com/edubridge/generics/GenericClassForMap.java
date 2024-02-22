package com.edubridge.generics;
/*Program to demonstrate on Generic class by passing multiple parameters of different type*/
class Dictionary<K,V>
{
	//where K and V define any kind of type-values
	K key;
	V value;
	
	void print(K key,V value)
	{
		this.key=key;
		this.value=value;
		System.out.println("The value is: "+key+" "+value);
	}
}

public class GenericClassForMap {

	public static void main(String[] args) {
		Dictionary<Character,String>obj=new Dictionary<>();
		obj.print('c', "Cyclone");
		obj.print('d', "dynamic");

	}

}
