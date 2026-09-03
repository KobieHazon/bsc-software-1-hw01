public final class Assignment1 {
    private Assignment1() {
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Invalid input!");
            return;
        }

        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int z = Integer.parseInt(args[2]);
            System.out.println(formatResult(x, y, z));
        } catch (NumberFormatException exception) {
            System.out.println("Invalid input!");
        }
    }

    public static String formatResult(int x, int y, int z) {
        if (x < 0 || y < 0 || z < 0) {
            return "Invalid input!";
        }
        if (isRightTriangleTriple(x, y, z)) {
            return String.format("The input (%d,%d,%d) defines a valid triangle!", x, y, z);
        }
        return String.format("The input (%d,%d,%d) does not define a valid triangle!", x, y, z);
    }

    public static boolean isRightTriangleTriple(int x, int y, int z) {
        long left = (long) x * x + (long) y * y;
        long right = (long) z * z;
        return left == right;
    }
}
