package com.example.BeanswithGetterandSetter;

import java.util.HashMap;
import java.util.Map;

public class Collections{

    private String name;
    private long rollno;

    private Map<String,Integer> address=new HashMap<>();
    private Map<String,Integer> marks=new HashMap<String,Integer>();


    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getRollno() {
            return rollno;
        }

        public void setRollno(long rollno) {
            this.rollno = rollno;
        }

    public Map<String, Integer> getAddress() {
        return address;
    }

    public void setAddress(Map<String, Integer> address) {
        this.address = address;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public void setMarks(Map<String, Integer> marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Collections{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", address=" + address +
                ", marks=" + marks +
                '}';
    }
}
