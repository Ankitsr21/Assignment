public class Ques10 {
    public static void main(String[]args){
        String str1 = "Hello  ";
        String repeatStr1 = str1.repeat(3);
        System.out.println("Repeat String: "+repeatStr1);

        String str2 = "               To The New    ";
        System.out.println("Strip: "+str2.strip());

        String str3 = "";
        String str4 = " ";
        String str5 = "Hello";
        System.out.println("isBlank: "+str3.isBlank());
        System.out.println("isBlank: "+str4.isBlank());
        System.out.println("isBlank: "+str5.isBlank());

        String str6 = "To\nThe\nNew";
        System.out.println("indent: "+str6.indent(3));

        String str7 = "hello";
        System.out.println("tranform: "+str7.transform(s->s.toUpperCase()));

        String str8 = "  Hello\n   World\n   !";
        System.out.println("stripIndent: "+str8.stripIndent());

        String str9 = "Ankit\\n                 Rawat";
        System.out.println("translateEscape: "+str9.translateEscapes());

        String str0 = "Ankit";
        int age = 23;
        String format = String.format("My name is %s and am %d years old.",str0,age);
        System.out.println("formatted: "+format);
    }
}
