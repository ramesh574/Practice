package com.Ramesh;

public class Person {
    String firstName;
    String lastName;
    int age;
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int getAge()
    {
        return age;
    }
    public void setFirstName(String s1)
    {
        this.firstName=s1;
    }
    public void setLastName(String s2)
    {
        this.lastName=s2;
    }
    public void setAge(int a)
    {
        if(a<0||a>100)
        {
            this.age=0;
        }
    }
    public boolean isTeen()
    {
        if(age>12||age<20)
        {
            return true;
        }
        return false;
    }
    public String getFullName()
    {
        if(firstName.equals(lastName))
        {
            return "";
        }
        if(lastName.isEmpty())
        {
            return firstName;
        }
        if(firstName.isEmpty())
        {
            return lastName;
        }
        return "";
    }

}
