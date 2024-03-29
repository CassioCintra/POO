package Lista3.Exercicio1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(1,"Jubileu","Juju");
        Person person2 = new Person(2, "Irineu", "Iri");

        Forum forum = new Forum(1,"Forum","http://forum.forum/");
        forum.setMessageList(1,"Bla bla bla bla", person1);
        forum.setMessageList(2,"Voce num sabe e nem eu", person2);
        forum.setMessageList(3,"Aoba", person1);
        System.out.println(forum);
    }
}
