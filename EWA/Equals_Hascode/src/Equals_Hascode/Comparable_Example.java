package Equals_Hascode;
import java.util.*;



//a class movie that implements comparable
// if we have to compare only one object then we use comparable
// if we have to compare more than on ewe use comparator
class Movie implements Comparable<Movie>{
	Double rating;
	int  year ;
	String name;
	//constructor

	Movie(Double ra ,String na , int ye  ){
		this.rating=ra;
		this.name=na;
		this.year=ye;
		
	}
	// used to sort movie by that year
	public int compareTo(Movie m) {
		return this.year - m.year;
	} 
	public Double getRating() {
		return rating;
	}
	public int getYear() {
		return year;
	}
	public String getName() {
		return name;
	}
}


//Driver class
public class Comparable_Example
{

	public static void main(String[] args) {
		 ArrayList< Movie> a1 = new  ArrayList< Movie>();
		 a1.add(new Movie(9.2,"starwars",2022));
		 a1.add(new Movie(8.2,"starwars2",2021));
		 a1.add(new Movie(7.9,"starwars3",2020));
		 a1.add(new Movie(8.1,"starwars4",2023));
		 Collections.sort(a1);
		 System.out.println("Movies after sorting");
	       for(Movie movie:a1) 
	       {
	    	   System.out.println(movie.getRating() +"/"+ movie.getName() + "/" + movie.getYear());
	       }
		 
	}

}
