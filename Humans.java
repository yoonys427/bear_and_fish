public class Humans {
    public static void main(String args[]) {
        Human kim = new Human("김철수", 18, "남자");
        
        Human park = new Human();
        park.setName("박영희");
        park.setAge(18);
        park.setGender("여자");
        
        kim.greeting();
        park.greeting();
    }
}

class Human {
    
    // properties
    private String name;
    private int age;
    private String gender;
    
    // methods
    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    public Human(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
    
    public Human() {
        
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void greeting() {
        System.out.printf("안녕하세요 저는 %s 입니다.\n", this.name);
        System.out.printf("저는 %d살 %s 입니다.\n", this.age, this.gender);
    }
    
    public void eating() {
        System.out.println("밥을 먹겠습니다.");
    }
    
    public void sleeping(int sleepingTime) {
        System.out.println(sleepingTime + "시간을 자도록 하겠습니다.");
    }
}