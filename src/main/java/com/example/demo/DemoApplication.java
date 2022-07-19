package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Product;
import com.example.demo.model.ProductNameComparator;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("started"+ System.getenv());//vnv
		
		String s = "jhsh";
		
		String[] sarr = s.split("");
		
		Set<String> sSet = new HashSet<String>();
		
		for (String string : sarr) {
			
			System.out.println(string);
			
			if(sSet.add(string)) {
				System.out.println("Non Duplicate Numbers are: - "+ string);
			}
			else {
				System.out.println("Duplicate letter found: - "+string);
			}
			
		}
		
		
		//ProcessBuilder pb = new ProcessBuilder();
		
		//List<String> commandList = pb.command();
		
		//System.out.println("command List Size: --"+commandList.size());
		
		/*
		 * for (String s : commandList) {
		 * 
		 * System.out.println(s); }
		 */
		
		  List<Product> lp = new ArrayList<>();
		  
		  lp.add(new Product(1,"light",300.5,"white","glow surrounding")); 
		  lp.add(new Product(2,"fan",2000.00,"black","air flow surrounding")); 
		  lp.add(new Product(3,"light",30.5,"white","glow surrounding"));
		  lp.add(new Product(4,"syskalight",500.5,"white","glow surrounding"));
		  lp.add(new Product(5,"syskaled",800.5,"white","glow surrounding"));
		  
		  Set<Product> sp = new HashSet<Product>(lp);
		  
		  List<Product> lpu = new ArrayList<>(sp);
		  
		  //List<Product> sortedProducts = lp.stream().filter((i)-> i.getProductName().contains("li")).collect(Collectors.toList());
		  
		  //lpu.forEach(i->System.out.println(i.getProductName()));
		  
			/*
			 * List<Product> sortedProducts =
			 * lp.stream().sorted(Comparator.comparing(Product::getProductName)).collect(
			 * Collectors.toList());
			 */
		  
		  //List<Product> sortedProducts =lp.stream().
		 List<Product> sortedProducts = lp.stream().sorted(Comparator.comparing(Product::getProductID)).sorted(Comparator.comparing(Product::getProductPrice)).collect(Collectors.toList());
		  Optional<Product> pprice = lp.stream().sorted(Comparator.comparing(Product::getProductPrice)).sorted(Comparator.reverseOrder()).skip(3).findFirst();
		  
		  if(pprice.isPresent()) {
			  System.out.println("2nd highest product - "+pprice.get().getProductID()+" which has price of "+ pprice.get().getProductPrice());
		  }
		  //List<Product> sortedProducts = lp.stream().sorted((o1,o2)-> o1.getProductPrice()>o2.getProductPrice()?-1:o2.getProductPrice()>o1.getProductPrice()?1:0).collect(Collectors.toList());
		  //ProductNameComparator pn = new ProductNameComparator();
		  //List<Product> sortedProducts =lp.stream().sorted(pn).collect(Collectors.toList());
		  sortedProducts.forEach(i->System.out.println(i.getProductName()));
		
			/*
			 * Thread t = Thread.currentThread();
			 * 
			 * System.out.println("Current Thread: - "+ t.getName());
			 * 
			 * //Thread m = new Thread
			 * 
			 * Thread t1 = new Thread( ()-> {System.out.println("Inside thread t1");
			 * 
			 * for (int j = 0; j < 5; j++) {
			 * 
			 * try {
			 * System.out.println(Thread.currentThread().getName()+" is executing "+j);
			 * Thread.sleep(2000); } catch (InterruptedException e) { // TODO Auto-generated
			 * catch block e.printStackTrace(); }
			 * 
			 * }
			 * 
			 * 
			 * });
			 * 
			 * 
			 * Thread t2 = new Thread( ()-> {System.out.println("Inside thread t2");
			 * 
			 * for (int j = 0; j < 5; j++) {
			 * 
			 * try {
			 * System.out.println(Thread.currentThread().getName()+" is executing "+j);
			 * Thread.sleep(2000); } catch (InterruptedException e) { // TODO Auto-generated
			 * catch block e.printStackTrace(); }
			 * 
			 * }
			 * 
			 * 
			 * 
			 * });
			 * 
			 * System.out.println("Thread t1 before start: -"+ t1.hashCode());
			 * 
			 * t1.start(); System.out.println("Thread t1 after start: -"+ t1.hashCode());
			 * 
			 * try { t1.join(); } catch (InterruptedException e) { // TODO Auto-generated
			 * catch block e.printStackTrace(); } t2.start();
			 * 
			 * Runnable t3 = ()-> {System.out.println("Inside t3");};
			 * 
			 * System.out.println("t3 hascode: -"+ t3);
			 */
		
		
		//ExecutorService c = new E
		
		  
		/*
		 * List<Product> distinctElements =
		 * lp.stream().distinct().collect(Collectors.toList());
		 */
		 
		//List<Product> distinctElements = lp.stream().collect(collectingAndThen(toCollection(() -> {new TreeSet<>(comparing(Product::getProductName))}),ArrayList::new));
	
			
			//ProductNameComparator pn = new ProductNameComparator(); 
			//Collections.sort(lp,pn);
			  
			  
			  //lp.forEach(i->System.out.println(i.getProductName()));
			 
		
		
			/*
			 * ArrayList<String> arr = new ArrayList<String>(4);
			 * 
			 * // using add() to initialize values // ["geeks", "for", "geeks"]
			 * arr.add("geeks"); arr.add("for"); arr.add("geeks");
			 * 
			 * System.out.println(arr.contains("geeks"));
			 */
		  
		  
	}
	 
	//Student st = new Student();
	
	/*
	@Bean 
	public Student getStudent() {
		
		
		return new Student();
	}
*/
}
	
	
