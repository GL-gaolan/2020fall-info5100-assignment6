public class Pet {
    private String petName;
    private String ownerName;
    private String color;
    protected int sex;
    public static final int MALE = 0;
    public static final int FEMALE = 1;
    public static final int SPAYED = 2;
    public static final int NEUTERED = 3;

    public Pet(String name,String ownerName,String color){
        this.petName=name;
        this.ownerName=ownerName;
        this.color=color;
    }

    public String getPetName() {
        return petName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getColor() {
        return color;
    }

    public void setSex(int sexId) {
        this.sex = sexId;
    }

    public String getSex() {
        String s=null;
        switch(this.sex){
            case 0:
                s="male";
                break;
            case 1:
                s="female";
                break;
            case 2:
                s="spayed";
                break;
            case 3:
                s="neutered";
                break;}
        return s;
        }

        //Why this cannot work?
        /**
        if((sex&MALE)!=0){
            return "male";
        }
        if((sex&FEMALE)!=0){
            return "female";
        }
        if((sex&SPAYED)!=0){
            return "spayed";
        }
        if((sex&NEUTERED)!=0){
            return "neutered";
        }
        else
            return "OOPS,sex no found";*/


    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(getPetName()+" owned by "+getOwnerName()+"\n");
        sb.append("Color:"+getColor()+"\n");
        sb.append("Sex:"+getSex()+"\n");
        return sb.toString();
    }
}

