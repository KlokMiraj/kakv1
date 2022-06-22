package com.example.kak.kakv1.Student;

public class Student {
    private long id;
    private String firstName;
    private String lastName;
    private double amountDue;
    private String dept;

    public Student(){
        super();
    }

    public Student(long id,String firstName,String lastName,double amountDue,String dept){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.amountDue=amountDue;
        this.dept=dept;
    }

    private void setId(long id){
        this.id=id;
    }
    public long getId(){
        return this.id;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }

    private void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String getLastName(){
        return this.lastName;
    }
   private void setAmountDue(double amountDue){
        this.amountDue=amountDue;
   }
   public double getAmountDue(){
        return this.amountDue;
   }
   private void setDept(String dept){
        this.dept=dept;
   }
   public String getDept(){
        return this.dept;
   }

   @Override
    public String toString(){
        return "Student [id=" + id + ", firstName=" + firstName + ", surname=" + lastName + ", dept=" + dept + ", fees="
                + amountDue + "]";
   }
}
