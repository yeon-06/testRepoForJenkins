package testProject;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HelloWorld {
    public static void main(String[] args) {
    	List<String> list = Arrays.asList("Eric", "Elena", "Java");
    	list.stream()
    	  .filter(el -> {
    	    System.out.println("filter() was called.");
    	    return el.contains("a");
    	  })
    	  .map(el -> {
    	    System.out.println("map() was called.");
    	    return el.toUpperCase();
    	  })
    	  .findFirst();
    	
    	System.out.println(Arrays.stream(new String[]{"c", "python", "java"})
        .filter(word -> {
            System.out.println("Call filter method: " + word);
            return word.length() > 3;
        })
        .map(word -> {
            System.out.println("Call map method: " + word);
            return word.substring(0, 3);
        }).findFirst());
	}
}
