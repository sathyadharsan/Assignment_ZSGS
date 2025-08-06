public class block_example
{
    static {
        System.out.println("Static Block Executed");
    }

    {
        System.out.println("Initializer Block Executed");
    }

    public BlockOrder() {
        System.out.println("Constructor Executed");
    }

    public static void main(String[] args) {
        BlockOrder obj1 = new BlockOrder();
    }
}
