package pack1;

import java.util.Objects;

public class Student implements Comparable<Student>{
    public String name;
    public String surname;
    public String group;
    public int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student(String name, String surname, String group, int number) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", group='" + group + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return number == student.number &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname) &&
                Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, group, number);
    }


    @Override
    public int compareTo(Student o) {
        if(name.equals(o.getName())){
            return 0;
        }
        else if(name.compareTo(o.getName()) <0){
            return -1;
        }
        else return 1;
        }

    
}
