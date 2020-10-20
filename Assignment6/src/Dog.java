public class Dog extends Pet implements Boardable {
    private MyDate boardStart;
    private MyDate boardEnd;
    private String size;

    public Dog(String name,String ownerName,String color,String size){
        super(name, ownerName, color);
        this.size=size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("DOG:"+"\n");
        sb.append(super.toString());
        sb.append("Size:"+getSize());
        return sb.toString();
    }
    @Override
    public void setBoardStart(int month, int day, int year) {
        boardStart=new MyDate(month, day, year);
    }

    @Override
    public void setBoardEnd(int month, int day, int year) {
        boardEnd=new MyDate(month, day, year);
    }

    @Override
    public boolean boarding(int month, int day, int year) {
        MyDate curDate=new MyDate(month, day, year);
        return (boardStart.compareTo(curDate)<=0)&&(boardEnd.compareTo(curDate)>=0);
    }

    public static void main(String[] args){
        Dog obj=new Dog("YoYo","Bonnie","white","big");
        obj.setSex(0);
        System.out.println(obj);

        obj.setBoardStart(10,20,2019);
        obj.setBoardEnd(10,20,2020);

        System.out.println(obj.boarding(1,1,2020));//should be true
        System.out.println(obj.boarding(1,1,2018));//should be false
        System.out.println(obj.boarding(10,20,2020));//should be true
    }
}
