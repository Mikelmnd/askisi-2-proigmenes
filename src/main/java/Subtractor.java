public class Subtractor {
    enum Result {
        POSITIVE,
        NEGATIVE,
        EQUALITY
    }
    public Result subtract(int a,int b) {
        if (a - b > 0)
            return Result.POSITIVE;
        else if (a - b < 0)
            return Result.NEGATIVE;
        else
            return Result.EQUALITY;
    }
}
