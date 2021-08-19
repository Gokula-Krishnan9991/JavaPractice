import java.util.Arrays;

class Students{
    private String rollNo;
    private String name;
    private String dept;
    private String[] subjects;

    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String[] getSubjects() {

    return this.subjects;
    }

    public Students(String rollNo,String name,String dept){
        this.rollNo=rollNo;
        this.name=name;
        this.dept=dept;
    }

    public Students(String...subjects){
        this.subjects=subjects;
    }

    public void setSubjects(String...subjects){
        this.subjects=subjects;
    }


    public String toString(){

        return "RoolNo.."+getRollNo()+"\n"+"Name.."+getName()+"\n"+"Dept..."+getDept()+"\n"+"Subjects.."+Arrays.toString(getSubjects())  +"\n";
    }


    public void PrintSubjects(){
        for(String k:this.subjects){

            System.out.print(k+" ");
        }
    }

}

public class Constructor {

    public static void main(String[] args) {

        Students []s=new Students[3];
        s[0]=new Students("121006024","Gokula Krishnan","EIE");
        s[0].setSubjects("control Systems","ISD","PLC","Power Systems");
        s[1]=new Students("12004003","Sasisharan","ICT");
        s[1].setSubjects("DSA","OS","CN","architecture");
        s[2]=new Students("12100702","Sasidhar","BIOT");
        s[2].setSubjects("Drugs and food system","Fluid mechanics","Biological hazard");

        for(Students k:s){
            System.out.println(k);
        }
    }
}