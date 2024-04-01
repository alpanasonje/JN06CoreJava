package com.tnsif.daytwenty;

import java.lang.annotation.Annotation;

public class AnnotationDemo {

	public static void main(String[] args) {
		AndroidSeries obj=new AndroidSeries("A23", 14);
		System.out.println(obj);
		
		Class c=obj.getClass();
		Annotation an=c.getAnnotation(SmartPhone.class);
		SmartPhone s=(SmartPhone) an;
		
		System.out.println(s.os());
		System.out.println(s.version());
		
		an=c.getAnnotation(SmartTV.class);
		SmartTV t=(SmartTV) an;
		System.out.println(t.os());
		System.out.println(t.width());
		System.out.println(t.height());

	}

}
