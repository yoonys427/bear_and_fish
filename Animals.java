public class Animals {
    public static void main(String args[]) {
        Cat cat1 = new Cat("나비", "암컷", 1, "이집트고양이", "감기걸림");
        Dog dog1 = new Dog("삐삐", "수컷", 2, 2, 20);
        
        System.out.printf("고양이 %s는 %s이고, 나이는 %d, 종류는 %s, 현재 %s상태 입니다.\n",
                            cat1.getName(), cat1.getGender(), cat1.getAge(), cat1.getCategory(), cat1.getInfoCat());
                            
        System.out.printf("강아지 %s는 %s이고, 나이는 %d, 몸무게는 %dkg, 키는 %dcm 입니다.\n",
                            dog1.getName(), dog1.getGender(), dog1.getAge(), dog1.getWeight(), dog1.getHeight());
                            
                            
        cat1.barting();
        dog1.barting();
        cat1.eating();
        dog1.eating();
        cat1.sleeping();
        dog1.sleeping();
        
        
    }
}

abstract class Animal {
    private String name;
    private String gender;
    private int age;
    
    public Animal(String nameOut, String genderOut, int ageOut) {
        this.name = nameOut; this.gender = genderOut; this.age = ageOut;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    public void setName(String nameOut) {
        this.name = nameOut;
    }
    
    public void setAge(int ageOut) {
        this.age = ageOut;
    }
    
    public void setGender(String GenderOut) {
        this.gender = GenderOut;
    }
    
    public abstract void barting();
    
    public abstract void eating();
    
    public abstract void sleeping();
}



class Cat extends Animal {
    private String category;
    private String infoCat;
    
    public Cat(String nameOut, String genderOut, int ageOut, String categoryOut, String infoCatOut) {
        super(nameOut, genderOut, ageOut);
        this.category = categoryOut; this.infoCat = infoCatOut;
    }
    
    public String getCategory() {
        return this.category;
    }
        
    public String getInfoCat() {
        return this.infoCat;
    }
    
    public void setCategory(String categoryOut) {
        this.category = categoryOut;
    }
        
    public void setInfoCat(String infoCatOut) {
        this.infoCat = infoCatOut;
    }
    public void barting() {
        System.out.println("야옹");
    }
    public void eating() {
        System.out.println("고양이 사료 먹는 중...");
    }
    public void sleeping() {
        System.out.println("고양이가 아침에 자는 중");
    }
    
    
}

class Dog extends Animal {
    private int weight;
    private int height;
    
    public Dog(String nameOut, String genderOut, int ageOut, int weightOut, int heightOut) {
        super(nameOut, genderOut, ageOut);
        this.weight = weightOut; this.height = heightOut;
    }
    
    public int getWeight() {
        return this.weight;
    }
        
    public int getHeight() {
        return this.height;
    }
    
    public void setHeight(int heightOut) {
        this.height = heightOut;
    }
        
    public void setInfoCat(int weightOut) {
        this.weight = weightOut;
    }
    public void barting() {
        System.out.println("멍멍");
    }
    public void eating() {
        System.out.println("강아지 사료 먹는 중...");
    }
    public void sleeping() {
        System.out.println("강아지가 저녁에 자는 중");
    }
}