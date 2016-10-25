package test;

import domain.VaucherType;

public class VaucherTypeTest {
	public static void main(String[] args) {
		VaucherType a = VaucherType.EXCURSION;
		System.out.println(a.toString());
		System.out.println(a.getName());
		VaucherType b = VaucherType.RECREATION;
		System.out.println(b.toString());
		System.out.println(b.getName());
		for(VaucherType type : VaucherType.values()) {
			System.out.println(type.toString() + "; " + type.getName());
		}
	}
}
