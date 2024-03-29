package com.tnsif.dayeighteen;

import java.lang.invoke.ClassSpecializer.Factory;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExpressionDemo {

	public static void main(String[] args) {
		GreetInterface g=(String s)-> {
			return ("Hello "+s);
			};
		
		
		GreetInterface g1=s->"Hey!! Good Evening "+s;
		
		System.out.println(g.sayHello("Students"));
				
		System.out.println(g1.sayHello("TNSIF Students"));
		
		
		Operations opr=n->System.out.println("Square of "+n+" is "+n*n);
		opr.calculate(5);
		
		opr=n->System.out.println("Square root of "+n+" is "+Math.sqrt(n));
		opr.calculate(5);
		
		
		Consumer<Integer> c=n->System.out.println("Cube of "+n+" is "+n*n*n);
		c.accept(5);
		
		//Use Supplier functional interface to return string message
		Supplier<String> s=()->"World of Lambda Expression";
		System.out.println(s.get());
		
		//Use Predicate functional interface to check given number is Even or not?
		Predicate<Integer> evenPredicate;
		/*
		 * evenPredicate(n)->{ if (n%2==0) return true; else return false; };
		 */		
		
		
		//evenPredicate=(n)->n%2==0?true:false;
		
		evenPredicate=(n)->n%2==0;
		System.out.println("Is 5 Even : ?"+evenPredicate.test(5));
		System.out.println("Is 50 Even : ?"+evenPredicate.test(50));
		
	}

}
