// oops , state, behavour..
class Student{
    public String string;
    private int[] marksString;
    public int getNumberOfMarks(){
        return marksString.length;
    }
    public int getTotalSumOfMarks(){
        int sum=0;
        for(int i=0;i<marksString.length;i++){
            sum=sum+marksString[i];
        }
        return sum;
    }
    public int getMaxiMarks(){
        int max= marksString[0];
        for(int i=0;i<marksString.length;i++){
            if(marksString[i]>max){
                max=marksString[i];
            }
        }
        return max;
    }
    public int getMinMarks(){
        int min=marksString[0];
        for(int i=0;i<marksString.length;i++){
            if(marksString[i]<min){
                min=marksString[i];
            }
        }
        return min;
    }
    public int averagrMarks(){
        int a=getTotalSumOfMarks();
        int ar=a/marksString.length;
        return ar;
    }
    public int percentage(){
        int abc=getTotalSumOfMarks();
        int j=(abc/500)*100;
        return j;
    }
    Student(String string, int... marksString ){
    this.marksString=marksString;
    this.string=string;
    System.out.println(string);
    }
}

class Prtc1{

    public static void main(String args[]){
       

        Student student=new Student("faizan",85,99,61,44,37);
        int n=student.getNumberOfMarks();
        System.out.println("Total subjects : "+n);
        int av=student.getTotalSumOfMarks();
        System.out.println("total sum of marks : "+av);
        int maxMarks =student.getMaxiMarks();
        System.out.println("max marks is : "+maxMarks);
        int avg=student.averagrMarks();
        System.out.println("average marks is "+avg);
        int min=student.getMinMarks();
        System.out.println("minimum marks is "+min);
        int pt = student.percentage();
        System.out.println("percentage  : "+pt+"%");
        
        Student faizan=new Student("imran", 88,55,78,69,76);
        int r=faizan.getNumberOfMarks();
        System.out.println("Total subjects : "+r);
        int s=faizan.getTotalSumOfMarks();
        System.out.println("total sum of marks : "+s);
        int maxMarksa =faizan.getMaxiMarks();
        System.out.println("max marks is : "+maxMarksa);
        int avgb=faizan.averagrMarks();
        System.out.println("average marks is "+avgb);
        int minc=faizan.getMinMarks();
        System.out.println("minimum marks is "+minc);
        int pt1 = faizan.percentage();
        System.out.println("percentage  : "+pt1+"%");

    }
    
}