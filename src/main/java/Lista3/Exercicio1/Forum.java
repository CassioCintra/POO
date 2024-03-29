package Lista3.Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private int id;
    private String name;
    private String url;
    private List<Message> messageList;

    public Forum() {
    }

    public Forum(int id, String name, String url) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.messageList = new ArrayList<>();
    }
    public void setMessageList(int id, String text, Person person){
        Message newMessage = new Message(id, text, person);
        messageList.add(newMessage);
    }
    public List<Message> getMessage(){
        return messageList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Forum{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", messageList=" + messageList +
                '}';
    }
}
