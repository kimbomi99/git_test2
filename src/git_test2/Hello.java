package git_test2;
public class Hello {
<<<<<<< HEAD
    
    String message = "�ȳ��ϼ���";

    public String say() {
        return message;
=======

    String message;

    public Hello() {
        this("�ȳ��ϼ���");
    }
    public Hello(String message) {
        this.message = message;
    }

    public void say() {
        System.out.println(message);
>>>>>>> 75ac5b177980105d8cdb98df6a61c86e2a8e237b
    }

}
