package concepts;

class OuterClass {
    void show() {
        System.out.println("this is show method in outer class");
    }

    class InnerClass {
        void show() {
            System.out.println("this is show method in Inner class");
        }
    }

    static class StaticInnerClass {
        void show() {
            System.out.println("this is show method in static inner class");
        }
    }
}

public class InnerClassConcept {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();// normal class
        outerClass.show();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();// inner class
        innerClass.show();
        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();// static inner class
        staticInnerClass.show();
        OuterClass outerClassAnonymous = new OuterClass() {
            void show() {
                System.out.println("this is show method from anonymous class");
            }
        };// creating a anonymous inner class
        outerClassAnonymous.show();
    }
}
