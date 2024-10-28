public class Examples {
    public static void main(String[] args) {
        String s1 = "Вован Иванов";
        String s2 = "иван иванов";
        check(s1, s2);

    }
    private static void check(String s1, String s2){
        if(s1.equalsIgnoreCase(s2)==true){
            System.out.println("Выберите другое имя пользователя");}
        else{
            System.out.println("Отличное имя!");
            System.out.println("Имя длинной "+ s1.length());
        }
    }
}
