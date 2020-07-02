class MessageNotifier extends Thread {

    private final String msg;
    private final int repeats;

    public MessageNotifier(String msg, int repeats) {
        this.msg = msg;
        this.repeats = repeats;
    }

    @Override
    public void run() {
        for (int i = repeats; i > 0; i--) {
            System.out.println(msg);
        }
    }
}