package project;

public class Viewership {
	public int downloads = 0;
	public int views = 0;
	public int numberOfRatings = 0;
	public double rating=0;
}
/*
1. object composition: (Viewership) performance should be a field in Movies and TV
2. change in fields should happen when people view/download/rate the show. Thus, as the fields are accessed through other classes, they can be public. 
*/