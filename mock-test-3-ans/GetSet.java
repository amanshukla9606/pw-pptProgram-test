 class Person {

   private String name;
   private int age;
   private int weight;

   public Person(String name, int age, int weight) {
       this.name = name;
       this.age = age;
       this.weight = weight;
   }

   public Person() {
   }

   public void say() {
       System.out.println("Hi");
   }

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public int getAge() {
       return age;
   }

   public void setAge(int age) {
       this.age = age;
   }

   public int getWeight() {
       return weight;
   }

   public void setWeight(int weight) {
       this.weight = weight;
   }
}


public class GetSet {

   public static void main(String[] args) {

       Person smudge = new Person("doremon", 5, 4);
       String smudgeName = smudge.getName();
       int smudgeAge = smudge.getAge();
       int smudgeWeight = smudge.getWeight();

       System.out.println("Person's name: " + smudgeName);
       System.out.println("Person's age: " + smudgeAge);
       System.out.println("Person's weight: " + smudgeWeight);
   }
}