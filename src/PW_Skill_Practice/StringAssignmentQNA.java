package PW_Skill_Practice;

public class StringAssignmentQNA {
    public static void main(String[] args) {
        String name = "Arbaj";
        System.out.println( name );
        name.concat("Alam");
        System.out.println(name);
        StringBuilder name1 = new StringBuilder("ArbajFromBuilder");
        System.out.println(name1);
        name1.append("Alam");
        System.out.println(name1);
        StringBuffer name2 = new StringBuffer("ArbajFromBuffer");
        System.out.println(name2);
        name2.append("Alam");
        System.out.println(name2);
    }
}
