package day26;

public class InterviewQuestion {}
//	        What is class in Java?
//			It is blueprint for objects. 
//			What is an object in Java?
//			It is implementation of the class.
//			What is constructor in Java?
//			It is a special method to create an object.
//			By default java will provide one empty constructor if we didn't create any.
//			What does Garbage Collector do in Java?
//			It clears unused objects from the memory.
//			How do you call GC in Java?
//			We cannot do it, it is automatic process. We can only suggest for it(finalize).
//			When do you get NullPointerException?
//			When we use properties or method of object(reference) that is pointing to null.
//				String str = null;
//				System.out.println(str); // no exception
//				System.out.println(str.length()): // NullPointerException
//			What does it mean when you make your variables/method as static?
//			It means the variables/methods belong to class and not to specific object.
//			The correct way of using static members is by class name. We don't have to create an object to use them.
//			public class MathHelpers {
//				public static int sum(int i, int i2) {
//					return i + i2;
//				}}			
//			MathHelpers.sum(3, 4);
//			What kind of access modifiers do you know? Describe each of them?
//			public    - it is accessible from anywhere.
//			protected - it is accessible within the same package and inside subclass.
//			default   - it is accessible within the same package only.
//			private   - it is accessible within the same class only.
//			What is the difference between String and StringBuilder?
//			String is immutable and StringBuilder is mutable.
//			In which scenario do you prefer using StringBuilder?
//			If we have a lot of string value changes it is better to use StringBuilder. 
//			String is immutable and every change will create new object, but by using mutable StringBuilder we can modify same object.
//			Why don't use every time StringBuilder then?
//			String is immutable and simple to use.

