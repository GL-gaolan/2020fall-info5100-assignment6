import java.awt.geom.Arc2D;
import java.util.ArrayList;
import java.util.Arrays;

public class Mreview implements Comparable<Mreview>{
    private String title;
    private ArrayList<Integer>ratings ;

    public Mreview(){
        title="";
        ratings=new ArrayList<Integer>();
    }

    public Mreview(String title){
        this.title=title;
        ratings=new ArrayList<Integer>();
    }

    public Mreview(String title,int firstRating){
        this.title=title;
        ratings=new ArrayList<Integer>(1);
        ratings.add(firstRating);
    }

    public void addRating(int r){
        ratings.add(r);
    }

    public double aveRating(){
        int count=ratings.size();
        double sumRating=0;
        double average=0;
        for(Integer i:ratings){
            sumRating += (double)ratings.get(i);
        }
        average= sumRating/count;
        return average;
    }

    //default older is by Title
    public int compareTo(Mreview obj){
        return this.getTitle().compareTo(obj.getTitle());
    }

    @Override
    public boolean equals(Object obj ){
        if (obj instanceof Mreview){
            Mreview mreview=(Mreview)obj;
            return title.equalsIgnoreCase(mreview.getTitle().trim());
        }
        return false;
    }

    public String getTitle() {
        return title;
    }

    public int numRatings(){
        return ratings.size();
    }

    @Override
    public String toString() {
        return "Movie <" + title + '\'' +
                ">'s average rating is " + aveRating() +" .";
    }

    public void main(String[] args){

    }
}
