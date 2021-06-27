public class client
{
	public static void dynamicStackTest() throws Exception {
        dynamicstack st = new dynamicstack(3);

        for (int i = 1; i <= 10; i++)
            st.push(i * 10);

        System.out.println(st);
        while (st.size() != 5) {
        System.out.println(st.pop());
        }
    }
    public static void dynamicQueueTest() throws Exception {
        dynamicqueue st = new dynamicqueue(3);

        for (int i = 1; i <= 10; i++)
            st.add(i * 10);

        System.out.println(st);
        while (st.size() != 5) {
        System.out.println(st.remove());
        }
    }

    public static void main(String[] args) throws Exception {
        dynamicQueueTest();
    }
}