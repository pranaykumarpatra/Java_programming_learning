package com.pranay;

public class Library {

    private String nameOfStudent;
    private String bookIssued;
    private String branchOfTheStudent;


    public Library() {
        this("Default name","Default books","default branch");
    }

    public Library(String nameOfStudent, String bookIssued) {
        this(nameOfStudent,bookIssued,"metallurgy");

    }

    public Library(String nameOfStudent, String bookIssued, String branchOfTheStudent) {
        this.nameOfStudent = nameOfStudent;
        this.bookIssued = bookIssued;
        this.branchOfTheStudent = branchOfTheStudent;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public String getBookIssued() {
        return bookIssued;
    }

    public String getBranchOfTheStudent() {
        return branchOfTheStudent;
    }

    public static void main(String[] args) {
        Library student1 = new Library();
        System.out.println(student1.getNameOfStudent() + " of branch " + student1.getBranchOfTheStudent() +
                " issued " + student1.getBookIssued() + " book") ;

        Library student2 = new Library("pranay","iron making");
        System.out.println(student2.getNameOfStudent() + " of branch " + student2.getBranchOfTheStudent() +
                " issued " + student2.getBookIssued() + " book") ;

        Library student3 = new Library("biki","steel making", "mechanical");
        System.out.println(student3.getNameOfStudent() + " of branch " + student3.getBranchOfTheStudent() +
                " issued " + student3.getBookIssued() + " book") ;


    }
}


