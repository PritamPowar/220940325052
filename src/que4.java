class GrandParent{
    String grandFatherName;
    String grandMotherName;
    GrandParent(String GFN,String GMN){
        this.grandFatherName=GFN;
        this.grandMotherName=GMN;
        System.out.println("Grand parent names are:");
        System.out.println("Grandfather "+this.grandFatherName);
        System.out.println("Grandmother "+this.grandMotherName);
    }
}
class Parent extends GrandParent{
    String fatherName;
    String motherName;
    Parent(String FN,String MN,String GFN,String GMN){
        super(GFN,GMN);
        this.fatherName=FN;
        this.motherName=MN;
        System.out.println("parents name are");
        System.out.println("father name: "+this.fatherName);
        System.out.println("mother name: "+this.motherName);
    }
}
class Child extends Parent{
    Child(String FN,String MN,String GFN,String GMN){
        super(FN,MN,GFN,GMN);
    }
}
public class que4 {
    public static void main(String[] args) {
        Child ch= new Child("Vijay","Suhasini","Shankar","Anuja");
    }
}
