public class MyDate implements Comparable<MyDate>{
    private int day;
    private int month;
    private int year;

    public MyDate(int month,int day,int year){
        this.month=month;
        this.day=day;
        this.year=year;
    }

    @Override
    public int compareTo(MyDate o) {
        if (year<o.year)return -1;
        else if (year>o.year)return 1;
        else{
            if(month<o.month)return -1;
            else if(month>o.month)return 1;
            else{
                if(day<o.day)return -1;
                else if(day>o.day)return 1;
                else return 0;
            }

        }
    }
}
