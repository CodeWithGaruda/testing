public class ProducerConsumer {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}

class Q {
    int num;
    boolean valueSet = false;

    synchronized public void put(int num) throws InterruptedException {
        while (valueSet) {
            wait();
        }
        this.num = num;
        System.out.println("producer:" + num);
        valueSet = true;
        notify();
    }

    synchronized public void get() throws InterruptedException {
        while (!valueSet) {
            wait();
        }
        System.out.println("consumer:" + num);
        valueSet = false;
        notify();
    }
}

class Producer extends Thread {
    Q q;

    Producer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "producer");
        t.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            try {
                q.put(i++);

                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    Q q;

    Consumer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "consumer");
        t.start();
    }

    @Override
    public void run() {
        while (true) {

            try {
                q.get();
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}