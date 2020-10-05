package com.company;

public class TaskNumberSix {

    public static void main(String[] args) {
        System.out.println(testMethod(1,532,"Hello",
                new Person("Anastasia Smith",26,"Female"),
        " world ", 1.53, new Person("John Doe",23,"Male")," f",new Integer(3),"rom",
                new Person("Patrick Stuard",53,"Male")," test method",'d',3.23F));
    }

    public static String testMethod(Object... objects){
        StringBuilder stringBuilder = new StringBuilder();
        Person [] personArray = new Person[objects.length];
        double allNumbers = 0.0;
        int i = 0;

        for (Object obj: objects) {

            if (obj instanceof String || obj instanceof Character){
                stringBuilder.append(obj);
            }

            if (obj instanceof Person){
                personArray[i] = (Person)obj;
                i++;
            }

            if (obj instanceof Integer || obj instanceof Double || obj instanceof Float){
                allNumbers += ((Number) obj).doubleValue();
            }

        }

        return  stringBuilder.toString() + "\n"+
                Person.personArrayToString(personArray) +"\n" +
                "Sum of all numbers:" + Double.toString(allNumbers);
    }
}
