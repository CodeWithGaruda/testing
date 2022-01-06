package concepts;

class A implements Cloneable {
    int num;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneObj {
    public static void main(String[] args) throws Exception {
        A a = new A();
        a.num = 10;
        A aclone = (A) a.clone();
        System.out.println(aclone.num);
    }

}
